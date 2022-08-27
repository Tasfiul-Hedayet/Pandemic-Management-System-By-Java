
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignupPage implements ActionListener{
    
    ImageIcon icon = new ImageIcon("Icon.png");
    
    ImageIcon icon1 = new ImageIcon("submit.gif");
    JFrame frame = new JFrame();
   
    JTextField userIDField = new JTextField();
    JTextField userEmailAddressField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    
    JLabel userIDLabel = new JLabel("User Name: ");
    JLabel userEmailAddress = new JLabel("Email Address: ");
    JLabel userPasswordLabel = new JLabel("Passcode: ");
    
    JButton SubmitButton = new JButton("Submit");

   
    SignupPage(){
              
        userIDLabel.setBounds(800,200,75,30);
        userIDField.setBounds(800,250,200,25);
        
        userEmailAddress.setBounds(800,300,200,30);
        userEmailAddressField.setBounds(800,350,200,25);
        
        userPasswordLabel.setBounds(800,400,400,30);
        userPasswordField.setBounds(800,450,200,25);
        
        SubmitButton.setBounds(1500, 700, 250, 100);
        SubmitButton.setFocusable(true);
        SubmitButton.addActionListener(this);
        SubmitButton.setIcon(icon1);
        
        frame.getContentPane().setBackground(Color.black);
        frame.setTitle("Welcome to Pandemic Managment System - Sign Up Page");
        frame.add(userIDLabel);
        frame.add(userIDField);
        frame.add(userPasswordLabel);
        frame.add(userPasswordField);
        frame.add(userEmailAddress);  
        frame.add(userEmailAddressField);
        frame.add(SubmitButton);
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1880, 1000);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == SubmitButton) {
            frame.dispose();
            Login l = new Login(null);
        }

    }
}