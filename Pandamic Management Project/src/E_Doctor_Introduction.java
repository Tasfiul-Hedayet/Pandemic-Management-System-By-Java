
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;


public class E_Doctor_Introduction implements ActionListener{
    
        ImageIcon icon = new ImageIcon("Icon.png");
        ImageIcon icon1 = new ImageIcon("Next.gif");
        
        
        JFrame frame = new JFrame();
        JLabel labelText = new JLabel("Welcome to E-Doctor");
        JLabel labelicon = new JLabel();
        JLabel label = new JLabel();
        JLabel DevelperTextNameLabel = new JLabel("Developed by Team 3");
        JButton NextButton = new JButton("");
        
        E_Doctor_Introduction(){
        
        label.setIcon(icon);//create a icone 
        
        labelText.setHorizontalAlignment(JLabel.CENTER);//align icon in center
        labelText.setVerticalAlignment(JLabel.CENTER);//align icon in center

        
        labelText.setBounds(400, 200, 1000, 500);
        labelText.setFont(new Font("Times New Roman", Font.ITALIC, 50));
        labelText.setForeground (Color.red);
        
        
        DevelperTextNameLabel.setBounds(710, 280, 500, 500);
        DevelperTextNameLabel.setFont(new Font("Times New Roman", Font.ITALIC, 50));
        DevelperTextNameLabel.setForeground (Color.green);
        
        NextButton.setBounds(1500, 700, 110, 110);
        NextButton.setFocusable(false);
        NextButton.addActionListener(this);
        NextButton.setIcon(icon1);
        
        
        
        frame.setResizable(true);
        frame.getContentPane().setBackground(Color.black);
        frame.setTitle("Pandemic Management System - E-Doctor");
        frame.add(label);
        frame.add(labelText);
        frame.add(DevelperTextNameLabel);
        frame.add(labelicon);
        frame.add(NextButton);
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1880, 1000);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == NextButton) {
                  frame.dispose();
                  WaitingPage waitingpage = new WaitingPage();
                }           
        }
}

