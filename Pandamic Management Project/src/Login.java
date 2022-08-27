
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import javafx.scene.effect.ColorAdjustBuilder;

public class Login implements ActionListener {

    ImageIcon icon = new ImageIcon("Icon.png");
    ImageIcon exit = new ImageIcon("exit.gif");
    
    JFrame frame = new JFrame();

    JTextField userIDField = new JTextField();

    JPasswordField userPasswordField = new JPasswordField();
    
    JLabel userIDLabel = new JLabel("User Name: ");
    JLabel userPasswordLabel = new JLabel("Passcode: ");
    JLabel messageLabel = new JLabel(); //print status (user not found) 
    JLabel NoAccountmessage = new JLabel("Don't have any account? Click Sign Up");
    JLabel ColorLabel = new JLabel();// color level
    JLabel Title = new JLabel();
    JLabel ExitTextLabel = new JLabel();
    
    JButton loginButton = new JButton("Login");
    JButton SignupButton = new JButton("Sign Up");
    JButton ExitButton = new JButton("Exit");
    
    HashMap<String, String> logininfo = new HashMap<String, String>();

    Login(HashMap<String, String> loginInfoOriginal) {

        logininfo = loginInfoOriginal;

        userIDLabel.setBounds(650, 297, 200, 25); //200
        userIDLabel.setFont(new Font(null, Font.ITALIC, 25));
        userIDLabel.setForeground (Color.white);
        
        userPasswordLabel.setBounds(650, 350, 200, 25); //253
        userPasswordLabel.setFont(new Font(null, Font.ITALIC, 25));
        userPasswordLabel.setForeground (Color.white);
        
        
        messageLabel.setBounds(730, 550, 350, 35);      //   550
        messageLabel.setFont(new Font(null, Font.PLAIN, 25));
        

        userIDField.setBounds(800, 299, 200, 25); // 197
        userPasswordField.setBounds(800, 350, 200, 25);
        

        loginButton.setBounds(850, 394, 100, 25); // 297
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        
//        resetButton.setBounds(900, 394, 100, 25); // 297
//        resetButton.setFocusable(false);
//        resetButton.addActionListener(this);

        
        NoAccountmessage.setBounds(780, 444, 1000, 25); //347
        NoAccountmessage.setFont(new Font(null, Font.ITALIC, 15));

        
        SignupButton.setBounds(850, 474, 100, 25); // 377
        SignupButton.setFocusable(false);
        SignupButton.addActionListener(this);

        
        // exit button
        ExitButton.setBounds(1700, 800, 150, 150);
        
        
        ExitButton.setFocusable(false);
        ExitButton.addActionListener(this);
        ExitButton.setIcon(exit);

        // exitbutton text
        ExitTextLabel.setBounds(1740, 700, 150, 150);
        ExitTextLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        ExitTextLabel.setForeground(Color.red);
        
        ColorLabel.setBackground(Color.black);

        
        frame.getContentPane().setBackground(Color.black);
        frame.setTitle("Welcome to Pandemic Managment System - Login Page");
        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(NoAccountmessage);
        frame.add(SignupButton);
        frame.add(ColorLabel);
        frame.add(ExitTextLabel);
        frame.add(ExitButton);
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1880, 1000);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //exit button
        if (e.getSource() == ExitButton) {
            frame.dispose();
            System.exit(0);
        }
        
        // signup page

        if (e.getSource() == SignupButton) {
            frame.dispose();
            SignupPage signup = new SignupPage();
        }

        if (e.getSource() == loginButton) {

            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if (logininfo.containsKey(userID)) {
                
                if (logininfo.get(userID).equals(password)) {
                    
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login successful");
                    frame.dispose();
                    Menu menu = new Menu();
                } 
                else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong password");
                }
            } else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("This username doesn't exist!");
            }
        }
    }
}