
package instantmessagingapp;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import javax.swing.UIManager;

public class InstantMessagingApp {

    public static void main(String[] args) {

        LoadingFrame loading = new LoadingFrame();
        loading.setLocationRelativeTo(null);
        loading.setVisible(true);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loading.setVisible(false);
        
        
        Interfaces interfaces = new Interfaces();
        //interfaces.setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
        //interfaces.getContentPane().setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
        interfaces.setLocationRelativeTo(null);
        interfaces.setVisible(true);
        
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0;; i++) {

                        Thread.sleep(1000);
                        if(Interfaces.netIsAvailable()){
                            
                            System.out.println("Connection Successful");
                        }
                        else{
                            System.out.println("Connection Unsuccessful");
                        }

                    }
                } catch (InterruptedException ex) {
                    System.out.println("xxxxxxxxxs");
                }
            }
        }).start();        
   
    }
    
    
    
}
