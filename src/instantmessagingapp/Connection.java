
package instantmessagingapp;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.ConnectionListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;

public class Connection {
   private ConnectionConfiguration config;
   public XMPPConnection conn;
   String server;
   int port;
   
    public Connection(){
        server = "vds.p1.im";
        port = 5222;

        config = new ConnectionConfiguration(server,port);
        config.setSecurityMode(ConnectionConfiguration.SecurityMode.disabled);
        config.setDebuggerEnabled(false);
        config.setSendPresence(true);
        conn = new XMPPConnection(config);        
    }   
    
    public Connection(String nServer,int nPort){
        config = new ConnectionConfiguration(nServer,nPort);
        config.setSecurityMode(ConnectionConfiguration.SecurityMode.disabled);
        config.setDebuggerEnabled(false);
        config.setSendPresence(true);
        conn = new XMPPConnection(config);
        
    }
    
    public void connecting(){
        try {
            conn.connect();
            
            //System.out.println("Connection Pass");
        } catch (XMPPException ex) {
            
            //System.out.println("Connection Fail");
        }
    } 
    
    public boolean connectionCheck(){
        return conn.isConnected();
    }
    
    public void reConnecting(){
        try {
            conn.connect();
            
            System.out.println("Connection Pass");
        } catch (XMPPException ex) {
            System.out.println("Connection Fail");
        }
    }    
    
    public void reConnecting2(){
        try {
            conn.connect();
            System.out.println("Connection Pass");
        } catch (XMPPException ex) {
            System.out.println("Connection Fail");
        }
    } 
   
    public void diconnecting(){
        conn.disconnect();
    }
    
    public void listening(){
        conn.addConnectionListener(new ConnectionListener() {
            @Override
            public void connectionClosed() {
                
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void connectionClosedOnError(Exception excptn) {
                
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void reconnectingIn(int i) {
                
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void reconnectionSuccessful() {
                
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void reconnectionFailed(Exception excptn) {
                
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        /*XMPPConnection.addConnectionCreationListener(new ConnectionCreationListener() {
            @Override
            public void connectionCreated(XMPPConnection xmppc) {
                //System.out.println("New Connection is Created");
                //JOptionPane.showMessageDialog(new JPopupMenu(),"New Connection is Created");
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }); */
    }
    
    public ConnectionConfiguration getConfig(){
        return config;
    }
    
    public XMPPConnection getConn(){
        return conn;
    }
    
    public String getServerName(){
        return conn.getHost();
    }
    
    public int getPort(){
        return conn.getPort();
    }
    
    public void setSever(String nServer){
        server = nServer;
    }
    
    public void setPort(int nPort){
        port = nPort;
    }
}
