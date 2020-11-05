/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instantmessagingapp;

import com.sun.org.apache.bcel.internal.classfile.Constant;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.ChatManagerListener;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.Roster;
import org.jivesoftware.smack.RosterEntry;
import org.jivesoftware.smack.SASLAuthentication;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.*;
import sun.swing.ImageIconUIResource;

/**
 *
 * @author Vidumini
 */
public class Interfaces extends javax.swing.JFrame {

    Connection connection = new Connection();
    int attempt = 0;
    Chat chat;
    ChatManager chatManager;
    StartChat startChat;
    String userName;
    String password;
    int messageCount = 0;
    Roster roster;
    public Interfaces() {

        connection.connecting();
        initComponents();
        HomeI.setVisible(false);
        SettingI.setVisible(false);
        ChatI.setVisible(false);
        ConnectionI.setVisible(false);
        ContactI.setVisible(false);
        if (connection.connectionCheck()) {
            btnConnectionStatus.setText("Connected");
            //btnConnectionStatus.setIcon(new ImageIcon(getClass().getResource("/instantmessagingapp/btnConnecteionStatus.png")));

        } else {
            btnConnectionStatus.setText("Not Connected");
            //btnConnectionStatus.setIcon(new ImageIcon(getClass().getResource("/instantmessagingapp/btnNotConnecteionStatus.png")));

        }
        Roster.setDefaultSubscriptionMode(Roster.SubscriptionMode.accept_all);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btnConnectionStatus = new javax.swing.JButton();
        LoginI = new javax.swing.JLayeredPane();
        jPanel6 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnConnection = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnBack = new javax.swing.JLabel();
        HomeI = new javax.swing.JLayeredPane();
        lblHome = new javax.swing.JLabel();
        lblMessageCount = new javax.swing.JLabel();
        btnChatHome = new javax.swing.JButton();
        btnSettingsHome = new javax.swing.JButton();
        btnContactListHome = new javax.swing.JButton();
        btnLogoutHome = new javax.swing.JButton();
        btnBackHome = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        SettingI = new javax.swing.JLayeredPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        btnSavePassword = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtNewPassword = new javax.swing.JPasswordField();
        lblBackProSettings = new javax.swing.JLabel();
        ChatI = new javax.swing.JLayeredPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        listOnline = new java.awt.List();
        jButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        lblBackChatLeft = new javax.swing.JLabel();
        tabPane = new javax.swing.JTabbedPane();
        backChatRight = new javax.swing.JLabel();
        ConnectionI = new javax.swing.JLayeredPane();
        btnSet = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtServer = new javax.swing.JTextField();
        txtPort = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtGetServer = new javax.swing.JTextField();
        txtGetPort = new javax.swing.JTextField();
        lblBackConnection = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        ContactI = new javax.swing.JLayeredPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        listContacts = new java.awt.List();
        btnRefresh = new javax.swing.JButton();
        backContackListOutside = new javax.swing.JLabel();

        jLabel4.setText("Username");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        btnConnectionStatus.setBackground(new java.awt.Color(204, 204, 255));
        btnConnectionStatus.setFocusPainted(false);
        btnConnectionStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectionStatusActionPerformed(evt);
            }
        });
        getContentPane().add(btnConnectionStatus);
        btnConnectionStatus.setBounds(0, 0, 510, 20);

        LoginI.setBackground(new java.awt.Color(153, 153, 255));
        LoginI.setMaximumSize(new java.awt.Dimension(500, 400));
        LoginI.setMinimumSize(new java.awt.Dimension(500, 400));

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));
        jPanel6.setLayout(null);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/logo2.png"))); // NOI18N
        jPanel6.add(lblLogo);
        lblLogo.setBounds(160, 20, 70, 70);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jPanel6.add(jLabel1);
        jLabel1.setBounds(168, 31, 160, 30);

        btnExit.setBackground(new java.awt.Color(204, 204, 204));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/btnExit1.png"))); // NOI18N
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setFocusPainted(false);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel6.add(btnExit);
        btnExit.setBounds(278, 227, 150, 40);

        btnConnection.setBackground(new java.awt.Color(204, 204, 204));
        btnConnection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/btnConnection1.png"))); // NOI18N
        btnConnection.setBorderPainted(false);
        btnConnection.setContentAreaFilled(false);
        btnConnection.setFocusPainted(false);
        btnConnection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConnectionMouseEntered(evt);
            }
        });
        btnConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectionActionPerformed(evt);
            }
        });
        jPanel6.add(btnConnection);
        btnConnection.setBounds(150, 227, 130, 40);

        btnLogin.setBackground(new java.awt.Color(204, 204, 204));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/btnLogin2.png"))); // NOI18N
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setFocusPainted(false);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel6.add(btnLogin);
        btnLogin.setBounds(16, 227, 120, 40);
        jPanel6.add(txtPassword);
        txtPassword.setBounds(232, 171, 150, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/if_lock_318582 (1).png"))); // NOI18N
        jLabel5.setText("Password");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(46, 158, 100, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/if_user_318585 (1).png"))); // NOI18N
        jLabel15.setText("Username");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(46, 98, 100, 50);
        jPanel6.add(txtUsername);
        txtUsername.setBounds(232, 118, 150, 20);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/back5.png"))); // NOI18N
        btnBack.setText("jLabel20");
        jPanel6.add(btnBack);
        btnBack.setBounds(0, 4, 500, 390);

        LoginI.setLayer(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LoginILayout = new javax.swing.GroupLayout(LoginI);
        LoginI.setLayout(LoginILayout);
        LoginILayout.setHorizontalGroup(
            LoginILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LoginILayout.setVerticalGroup(
            LoginILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(LoginI);
        LoginI.setBounds(0, 0, 500, 400);

        HomeI.setMaximumSize(new java.awt.Dimension(600, 500));
        HomeI.setMinimumSize(new java.awt.Dimension(600, 500));
        HomeI.setVerifyInputWhenFocusTarget(false);

        lblHome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/lblHome2.png"))); // NOI18N
        HomeI.add(lblHome);
        lblHome.setBounds(230, 30, 62, 70);
        HomeI.add(lblMessageCount);
        lblMessageCount.setBounds(300, 130, 40, 30);

        btnChatHome.setBackground(new java.awt.Color(204, 204, 204));
        btnChatHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/btnChats1.png"))); // NOI18N
        btnChatHome.setBorderPainted(false);
        btnChatHome.setContentAreaFilled(false);
        btnChatHome.setFocusPainted(false);
        btnChatHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChatHomeMouseEntered(evt);
            }
        });
        btnChatHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChatHomeActionPerformed(evt);
            }
        });
        HomeI.add(btnChatHome);
        btnChatHome.setBounds(160, 120, 200, 54);

        btnSettingsHome.setBackground(new java.awt.Color(204, 204, 204));
        btnSettingsHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/btnSettings1.png"))); // NOI18N
        btnSettingsHome.setBorderPainted(false);
        btnSettingsHome.setContentAreaFilled(false);
        btnSettingsHome.setFocusPainted(false);
        btnSettingsHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSettingsHomeMouseEntered(evt);
            }
        });
        btnSettingsHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsHomeActionPerformed(evt);
            }
        });
        HomeI.add(btnSettingsHome);
        btnSettingsHome.setBounds(140, 180, 240, 54);

        btnContactListHome.setBackground(new java.awt.Color(204, 204, 204));
        btnContactListHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/btnContacts1.png"))); // NOI18N
        btnContactListHome.setBorderPainted(false);
        btnContactListHome.setContentAreaFilled(false);
        btnContactListHome.setFocusPainted(false);
        btnContactListHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnContactListHomeMouseEntered(evt);
            }
        });
        btnContactListHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactListHomeActionPerformed(evt);
            }
        });
        HomeI.add(btnContactListHome);
        btnContactListHome.setBounds(160, 240, 200, 54);

        btnLogoutHome.setBackground(new java.awt.Color(204, 204, 204));
        btnLogoutHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/btnLogout1.png"))); // NOI18N
        btnLogoutHome.setBorderPainted(false);
        btnLogoutHome.setContentAreaFilled(false);
        btnLogoutHome.setFocusPainted(false);
        btnLogoutHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutHomeMouseEntered(evt);
            }
        });
        btnLogoutHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutHomeActionPerformed(evt);
            }
        });
        HomeI.add(btnLogoutHome);
        btnLogoutHome.setBounds(160, 300, 200, 54);

        btnBackHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/back5.png"))); // NOI18N
        btnBackHome.setText("jLabel20");
        HomeI.add(btnBackHome);
        btnBackHome.setBounds(0, 0, 600, 500);

        jPanel5.setBackground(new java.awt.Color(0, 153, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(600, 500));
        jPanel5.setMinimumSize(new java.awt.Dimension(600, 500));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        HomeI.add(jPanel5);
        jPanel5.setBounds(0, 0, 600, 500);

        getContentPane().add(HomeI);
        HomeI.setBounds(0, 0, 600, 500);

        SettingI.setMaximumSize(new java.awt.Dimension(500, 400));
        SettingI.setMinimumSize(new java.awt.Dimension(500, 400));

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(500, 400));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(505, 428));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(505, 428));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(500, 400));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 400));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("New Usename");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(74, 126, 110, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("New Password");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(74, 161, 110, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Confirm Password");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(74, 199, 110, 17);
        jPanel2.add(jTextField4);
        jTextField4.setBounds(301, 123, 100, 20);

        btnSavePassword.setBackground(new java.awt.Color(204, 204, 204));
        btnSavePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/btnSave1.png"))); // NOI18N
        btnSavePassword.setBorderPainted(false);
        btnSavePassword.setContentAreaFilled(false);
        btnSavePassword.setFocusPainted(false);
        btnSavePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSavePasswordMouseEntered(evt);
            }
        });
        btnSavePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePasswordActionPerformed(evt);
            }
        });
        jPanel2.add(btnSavePassword);
        btnSavePassword.setBounds(50, 240, 140, 48);

        jButton15.setBackground(new java.awt.Color(204, 204, 204));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/btnHome3.png"))); // NOI18N
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.setFocusPainted(false);
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton15MouseEntered(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15);
        jButton15.setBounds(270, 229, 160, 70);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Profile Settings");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(162, 37, 158, 29);
        jPanel2.add(txtConfirmPassword);
        txtConfirmPassword.setBounds(300, 200, 100, 20);
        jPanel2.add(txtNewPassword);
        txtNewPassword.setBounds(300, 160, 100, 20);

        lblBackProSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/back5.png"))); // NOI18N
        lblBackProSettings.setText("jLabel2");
        jPanel2.add(lblBackProSettings);
        lblBackProSettings.setBounds(-3, -1, 500, 340);

        jTabbedPane1.addTab("Profile Settings                                      ", jPanel2);

        SettingI.setLayer(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout SettingILayout = new javax.swing.GroupLayout(SettingI);
        SettingI.setLayout(SettingILayout);
        SettingILayout.setHorizontalGroup(
            SettingILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingILayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SettingILayout.setVerticalGroup(
            SettingILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingILayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(SettingI);
        SettingI.setBounds(0, 0, 515, 409);

        ChatI.setMaximumSize(new java.awt.Dimension(500, 400));
        ChatI.setMinimumSize(new java.awt.Dimension(500, 400));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(500, 400));
        jPanel3.setMinimumSize(new java.awt.Dimension(500, 400));
        jPanel3.setName(""); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 400));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setMaximumSize(new java.awt.Dimension(150, 400));
        jPanel4.setMinimumSize(new java.awt.Dimension(150, 400));
        jPanel4.setPreferredSize(new java.awt.Dimension(150, 400));
        jPanel4.setLayout(null);
        jPanel4.add(listOnline);
        listOnline.setBounds(10, 100, 130, 210);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/btnHomeChat.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(7, 320, 130, 48);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Online");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(13, 63, 124, 14);

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/btnStartChat.png"))); // NOI18N
        btnNew.setBorderPainted(false);
        btnNew.setContentAreaFilled(false);
        btnNew.setFocusPainted(false);
        btnNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewMouseEntered(evt);
            }
        });
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel4.add(btnNew);
        btnNew.setBounds(14, 30, 130, 30);

        lblBackChatLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/back5.png"))); // NOI18N
        lblBackChatLeft.setText("jLabel20");
        jPanel4.add(lblBackChatLeft);
        lblBackChatLeft.setBounds(0, 0, 150, 400);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 150, 400);

        tabPane.setBackground(new java.awt.Color(0, 153, 255));
        tabPane.setMaximumSize(new java.awt.Dimension(350, 400));
        tabPane.setMinimumSize(new java.awt.Dimension(350, 400));
        tabPane.setPreferredSize(new java.awt.Dimension(350, 400));
        jPanel3.add(tabPane);
        tabPane.setBounds(156, 27, 350, 360);

        backChatRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/back5.png"))); // NOI18N
        jPanel3.add(backChatRight);
        backChatRight.setBounds(150, 0, 350, 400);

        ChatI.add(jPanel3);
        jPanel3.setBounds(0, 0, 500, 400);

        getContentPane().add(ChatI);
        ChatI.setBounds(0, 0, 500, 400);

        txtGetServer.setText(connection.getServerName());
        txtGetPort.setText(String.valueOf(connection.getPort()));
        ConnectionI.setMaximumSize(new java.awt.Dimension(500, 400));
        ConnectionI.setMinimumSize(new java.awt.Dimension(500, 400));

        btnSet.setBackground(new java.awt.Color(204, 204, 204));
        btnSet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/btnSet1.png"))); // NOI18N
        btnSet.setBorderPainted(false);
        btnSet.setContentAreaFilled(false);
        btnSet.setFocusPainted(false);
        btnSet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSetMouseEntered(evt);
            }
        });
        btnSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetActionPerformed(evt);
            }
        });
        ConnectionI.add(btnSet);
        btnSet.setBounds(94, 294, 110, 48);

        jLabel12.setText("Server");
        ConnectionI.add(jLabel12);
        jLabel12.setBounds(94, 212, 50, 14);

        jLabel13.setText("Port");
        ConnectionI.add(jLabel13);
        jLabel13.setBounds(94, 250, 40, 14);

        txtServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServerActionPerformed(evt);
            }
        });
        ConnectionI.add(txtServer);
        txtServer.setBounds(253, 209, 101, 20);
        ConnectionI.add(txtPort);
        txtPort.setBounds(253, 247, 101, 20);

        btnback.setBackground(new java.awt.Color(204, 204, 204));
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/btnBack1.png"))); // NOI18N
        btnback.setBorderPainted(false);
        btnback.setContentAreaFilled(false);
        btnback.setFocusPainted(false);
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnbackMouseEntered(evt);
            }
        });
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        ConnectionI.add(btnback);
        btnback.setBounds(244, 294, 110, 48);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Current Server Information");
        ConnectionI.add(jLabel16);
        jLabel16.setBounds(148, 21, 212, 22);

        jLabel17.setText("Server");
        ConnectionI.add(jLabel17);
        jLabel17.setBounds(94, 64, 50, 14);

        jLabel18.setText("Port");
        ConnectionI.add(jLabel18);
        jLabel18.setBounds(94, 118, 40, 14);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("New Settings");
        ConnectionI.add(jLabel22);
        jLabel22.setBounds(173, 163, 103, 22);

        txtGetServer.setEnabled(false);
        ConnectionI.add(txtGetServer);
        txtGetServer.setBounds(253, 61, 101, 20);

        txtGetPort.setEnabled(false);
        ConnectionI.add(txtGetPort);
        txtGetPort.setBounds(253, 115, 101, 20);

        lblBackConnection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/back5.png"))); // NOI18N
        lblBackConnection.setText("jLabel2");
        ConnectionI.add(lblBackConnection);
        lblBackConnection.setBounds(-3, 6, 500, 390);

        jPanel7.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        ConnectionI.add(jPanel7);
        jPanel7.setBounds(0, 0, 500, 458);

        getContentPane().add(ConnectionI);
        ConnectionI.setBounds(0, 0, 500, 400);

        ContactI.setMaximumSize(new java.awt.Dimension(600, 500));
        ContactI.setMinimumSize(new java.awt.Dimension(600, 500));

        jPanel9.setBackground(new java.awt.Color(0, 153, 255));
        jPanel9.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Contact List");
        jPanel9.add(jLabel14);
        jLabel14.setBounds(220, 20, 150, 30);

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/btnHome1.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton4);
        jButton4.setBounds(20, 70, 120, 48);
        jPanel9.add(listContacts);
        listContacts.setBounds(180, 70, 210, 290);

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/btnRefresh.png"))); // NOI18N
        btnRefresh.setToolTipText("");
        btnRefresh.setBorderPainted(false);
        btnRefresh.setContentAreaFilled(false);
        btnRefresh.setFocusPainted(false);
        btnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRefreshMouseEntered(evt);
            }
        });
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel9.add(btnRefresh);
        btnRefresh.setBounds(10, 130, 140, 48);

        backContackListOutside.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instantmessagingapp/back5.png"))); // NOI18N
        backContackListOutside.setText("jLabel2");
        jPanel9.add(backContackListOutside);
        backContackListOutside.setBounds(0, 0, 540, 500);

        ContactI.setLayer(jPanel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ContactILayout = new javax.swing.GroupLayout(ContactI);
        ContactI.setLayout(ContactILayout);
        ContactILayout.setHorizontalGroup(
            ContactILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactILayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        ContactILayout.setVerticalGroup(
            ContactILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(ContactI);
        ContactI.setBounds(0, 0, 600, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //set Connection settings
    public void setConnectionSettings() {
        connection.diconnecting();
        connection = new Connection(txtServer.getText(), 5222);
        try {
            connection.connecting();
            txtGetServer.setText(txtServer.getText());
            txtGetPort.setText("5222");
            txtServer.setText("");
            txtPort.setText("");
            JOptionPane.showMessageDialog(rootPane, "Change is successful");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Change is unsuccessful\nConnection reset");
            connection = new Connection();
            connection.connecting();
        }
    }

    //Internet Connection Check
    public static boolean netIsAvailable() {
        try {
            final URL url = new URL("http://www.hosted.im");
            final URLConnection conn = url.openConnection();
            conn.connect();
            //btnConnectionStatus.setText("Connected");
            return true;

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            btnConnectionStatus.setText(" Not Connected");

            return false;
        }
    }

    //Reconnect When Connection is failed
    public void reconnectNow() {
        connection.reConnecting();
        if (connection.connectionCheck()) {
            btnConnectionStatus.setText("Connected");
        } else {
            btnConnectionStatus.setText("Not Connected");
        }
    }
    
    public void getOnlineContacts(){
        roster = connection.getConn().getRoster();
        Collection<RosterEntry> entries = roster.getEntries();
        for (RosterEntry entry : entries) {
            listOnline.add(entry.toString().replaceAll(entry.toString().substring(entry.toString().indexOf("@")), ""));
            if(roster.getPresence(entry.toString()).equals("unavailable")){
                
            }
            else{
                
            } 
            
        }        
    }

    //Login to User Account
    void login() {
        try {
            SASLAuthentication.supportSASLMechanism("PLAIN", 0);
            userName = txtUsername.getText();
            password = txtPassword.getText();
            connection.getConn().login(userName, password);
            LoginI.setVisible(false);
            HomeI.setVisible(true);
            txtUsername.setText("");
            txtPassword.setText("");
            chatManager = connection.getConn().getChatManager();
            attempt = 0;

        } catch (XMPPException ex) {
            txtPassword.setText("");
            connection.diconnecting();
            connection.connecting();
            JOptionPane.showMessageDialog(rootPane, "Incorrect Username or password\n\nRemaining Attempts : " + (6 - attempt));
            if (attempt > 5) {
                dispose();
            }
        }
    }
    
    //Logout
    public void logout() {
        tabPane.removeAll();
        connection.diconnecting();
        connection = new Connection();
        connection.connecting();
        //chatManager.removeChatListener(connection.getConn().removePacketListener(packetListener));        
    }    

    //replying to incomming messages
    void replying() {
        chatManager.addChatListener(new ChatManagerListener() {
            @Override
            public void chatCreated(Chat chat, boolean bln) {
                String title = chat.getParticipant().replaceAll(chat.getParticipant().substring(chat.getParticipant().indexOf("@")), "");
                ChatPanel chatPanel = new ChatPanel();
                tabPane.addTab(title, chatPanel);
                chatPanel.getTextTo().setText(chat.getParticipant());
                MouseListener mouseListener = new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            chat.sendMessage(chatPanel.getTextMsg().getText());
                            chatPanel.getTextChat().append(userName + " : " + chatPanel.getTextMsg().getText() + "\n");
                            chatPanel.getTextMsg().setText("");
                        } catch (XMPPException ex) {
                            JOptionPane.showMessageDialog(rootPane, "Sending Fail");
                        }
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        System.out.println("MPressed");

                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                        System.out.println("MRelease");

                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        System.out.println("MEntered");
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        System.out.println("MExited");
                    }
                };
                chat.addMessageListener(new MessageListener() {

                    @Override
                    public void processMessage(Chat chat, Message msg) {
                        messageCount++;
                        lblMessageCount.setText(String.valueOf(messageCount));
                        chatPanel.getSendButton().removeMouseListener(mouseListener);
                        chatPanel.getTextChat().append(chat.getParticipant().replaceAll(chat.getParticipant().substring(chat.getParticipant().indexOf("@")), " : ") + msg.getBody() + "\n");
                        chatPanel.getSendButton().addMouseListener(mouseListener);
                    }
                });

            }
        });

    }

    //sending messages
    public void sending() {
        chat = chatManager.createChat(startChat.getTextWith().getText() + "@" + connection.getConn().getHost(), new MessageListener() {
            @Override
            public void processMessage(Chat chat, Message msg) {

            }

        });

        try {
            chat.sendMessage(startChat.getTextWithMsg().getText());
            //cht.txtChat.append(userName +" : "+sCht.txtWithMsg.getText()+"\n");
            System.out.println("Sended");
        } catch (XMPPException ex) {
            System.out.println("Sending Fail");
            //Logger.getLogger(Interfaces.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Get contacts
    private void getContacts() {

        roster = connection.getConn().getRoster();
        Collection<RosterEntry> entries = roster.getEntries();
        for (RosterEntry entry : entries) {
            listContacts.add(entry.toString() + "  :  " + roster.getPresence(entry.toString()));
            listOnline.add(entry.toString().replaceAll(entry.toString().substring(entry.toString().indexOf("@")), ""));
            /*            if(roster.getPresence(entry.toString()).equals("available")){
                System.out.println(entry.toString());
            }
            else{
                System.out.println(entry.toString()+ " not available");
            } */
        }
    }

    //Change Password
    public void changePassword() {
        String newPassword = txtNewPassword.getText();
        String confirmPassword = txtConfirmPassword.getText();
        if ("".equals(newPassword) && "".equals(confirmPassword)) {
            JOptionPane.showMessageDialog(rootPane, "Please enter to change");
        } else if (!newPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(rootPane, "Password not Matched");
            txtNewPassword.setText("");
            txtConfirmPassword.setText("");
        } else if (newPassword.equals(confirmPassword)) {
            try {
                System.out.println(newPassword.equals(confirmPassword));
                connection.getConn().getAccountManager().changePassword(newPassword);
                txtNewPassword.setText("");
                txtConfirmPassword.setText("");
            } catch (XMPPException ex) {
                //System.out.println(ex);
                JOptionPane.showMessageDialog(rootPane, ex);
                txtNewPassword.setText("");
                txtConfirmPassword.setText("");
            }
        }
    }

    //Start New Chat
    public void startNewChat() {
        //sending();
        startChat = new StartChat();
        tabPane.addTab("New", startChat);
        startChat.getBtnWithStart().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                sending();
                startChat.getBtnWithStart().removeMouseListener(this);
                tabPane.remove(startChat);
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

    }

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        attempt++;
        login();
        replying();
        getContacts();

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectionActionPerformed
        LoginI.setVisible(false);
        ConnectionI.setVisible(true);
    }//GEN-LAST:event_btnConnectionActionPerformed

    private void btnChatHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChatHomeActionPerformed
        lblMessageCount.setText("");
        messageCount = 0;
        HomeI.setVisible(false);
        ChatI.setVisible(true);
        listOnline.removeAll();
        getOnlineContacts();        

    }//GEN-LAST:event_btnChatHomeActionPerformed

    private void btnSettingsHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsHomeActionPerformed
        HomeI.setVisible(false);
        SettingI.setVisible(true);
    }//GEN-LAST:event_btnSettingsHomeActionPerformed


    private void btnLogoutHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutHomeActionPerformed
        logout();
        HomeI.setVisible(false);
        LoginI.setVisible(true);

    }//GEN-LAST:event_btnLogoutHomeActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        ConnectionI.setVisible(false);
        LoginI.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnContactListHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactListHomeActionPerformed
        HomeI.setVisible(false);
        ContactI.setVisible(true);
        listContacts.removeAll();
        getContacts();


    }//GEN-LAST:event_btnContactListHomeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ContactI.setVisible(false);
        HomeI.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed


    private void btnSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetActionPerformed
        setConnectionSettings();
    }//GEN-LAST:event_btnSetActionPerformed

    private void txtServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServerActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed


    private void btnSavePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePasswordActionPerformed

        changePassword();

    }//GEN-LAST:event_btnSavePasswordActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        SettingI.setVisible(false);
        HomeI.setVisible(true);

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ChatI.setVisible(false);
        HomeI.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        startNewChat();

    }//GEN-LAST:event_btnNewActionPerformed

    private void btnConnectionStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectionStatusActionPerformed
        reconnectNow();
    }//GEN-LAST:event_btnConnectionStatusActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        listContacts.removeAll();
        getContacts();
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered

        btnLogin.setRolloverIcon(new ImageIcon(getClass().getResource("/instantmessagingapp/btnLogin2Clicked.png")));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnConnectionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConnectionMouseEntered
        btnConnection.setRolloverIcon(new ImageIcon(getClass().getResource("/instantmessagingapp/btnConnection1Clicked.png")));

    }//GEN-LAST:event_btnConnectionMouseEntered

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setRolloverIcon(new ImageIcon(getClass().getResource("/instantmessagingapp/btnExit1Clicked.png")));

    }//GEN-LAST:event_btnExitMouseEntered

    private void btnChatHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChatHomeMouseEntered
        btnChatHome.setRolloverIcon(new ImageIcon(getClass().getResource("/instantmessagingapp/btnChats1Clicked.png")));

    }//GEN-LAST:event_btnChatHomeMouseEntered

    private void btnSettingsHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingsHomeMouseEntered
        btnSettingsHome.setRolloverIcon(new ImageIcon(getClass().getResource("/instantmessagingapp/btnSettings1Clicked.png")));

    }//GEN-LAST:event_btnSettingsHomeMouseEntered

    private void btnContactListHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContactListHomeMouseEntered
        btnContactListHome.setRolloverIcon(new ImageIcon(getClass().getResource("/instantmessagingapp/btnContacts1Clicked.png")));

    }//GEN-LAST:event_btnContactListHomeMouseEntered

    private void btnLogoutHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutHomeMouseEntered
        btnLogoutHome.setRolloverIcon(new ImageIcon(getClass().getResource("/instantmessagingapp/btnLogout1Clicked.png")));

    }//GEN-LAST:event_btnLogoutHomeMouseEntered

    private void btnSetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetMouseEntered
        btnSet.setRolloverIcon(new ImageIcon(getClass().getResource("/instantmessagingapp/btnSet1Clicked.png")));

    }//GEN-LAST:event_btnSetMouseEntered

    private void btnbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseEntered
        btnback.setRolloverIcon(new ImageIcon(getClass().getResource("/instantmessagingapp/btnBack1Clicked.png")));

    }//GEN-LAST:event_btnbackMouseEntered

    private void btnNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseEntered
        btnNew.setRolloverIcon(new ImageIcon(getClass().getResource("/instantmessagingapp/btnStartChatClicked.png")));

    }//GEN-LAST:event_btnNewMouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setRolloverIcon(new ImageIcon(getClass().getResource("/instantmessagingapp/btnHomeChatClicked.png")));

    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setRolloverIcon(new ImageIcon(getClass().getResource("/instantmessagingapp/btnHome1Clicked.png")));

    }//GEN-LAST:event_jButton4MouseEntered

    private void btnRefreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseEntered
        btnRefresh.setRolloverIcon(new ImageIcon(getClass().getResource("/instantmessagingapp/btnRefreshClicked.png")));

    }//GEN-LAST:event_btnRefreshMouseEntered

    private void btnSavePasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSavePasswordMouseEntered
        btnSavePassword.setRolloverIcon(new ImageIcon(getClass().getResource("/instantmessagingapp/btnSave1Clicked.png")));

    }//GEN-LAST:event_btnSavePasswordMouseEntered

    private void jButton15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseEntered
        jButton15.setRolloverIcon(new ImageIcon(getClass().getResource("/instantmessagingapp/btnHome3Clicked.png")));

    }//GEN-LAST:event_jButton15MouseEntered

    public String getUserName() {
        return txtUsername.getText();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaces().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane ChatI;
    private javax.swing.JLayeredPane ConnectionI;
    private javax.swing.JLayeredPane ContactI;
    private javax.swing.JLayeredPane HomeI;
    private javax.swing.JLayeredPane LoginI;
    private javax.swing.JLayeredPane SettingI;
    private javax.swing.JLabel backChatRight;
    private javax.swing.JLabel backContackListOutside;
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel btnBackHome;
    private javax.swing.JButton btnChatHome;
    private javax.swing.JButton btnConnection;
    public static javax.swing.JButton btnConnectionStatus;
    private javax.swing.JButton btnContactListHome;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogoutHome;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSavePassword;
    private javax.swing.JButton btnSet;
    private javax.swing.JButton btnSettingsHome;
    private javax.swing.JButton btnback;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblBackChatLeft;
    private javax.swing.JLabel lblBackConnection;
    private javax.swing.JLabel lblBackProSettings;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMessageCount;
    private java.awt.List listContacts;
    private java.awt.List listOnline;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtGetPort;
    private javax.swing.JTextField txtGetServer;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtServer;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
