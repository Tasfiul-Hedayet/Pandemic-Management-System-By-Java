
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;
import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.lang.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Vaccine_Intro extends JFrame implements ActionListener {

    ImageIcon icon = new ImageIcon("Icon.png");
    ImageIcon backgroundImage = new ImageIcon("Vac.gif");
    ImageIcon home = new ImageIcon("home.gif");
    ImageIcon exit = new ImageIcon("exit.gif");

    JFrame frame1 = new JFrame();
    JLabel label = new JLabel();
    JLabel HomeTextLabel = new JLabel("Home");
    JLabel ExitTextLabel = new JLabel("Exit");
    JLabel TextLabel = new JLabel("Details about vaccine - ");
    JButton WVButton = new JButton("Vaccine of current pandemic");
    JButton BVButton = new JButton("Vaccine registration");
    JButton HomeButton = new JButton();
    JButton ExitButton = new JButton();

    Vaccine_Intro() {

       // JFrame frame = new JFrame();

        // (y, x, width, height)

        label.setBounds(450, 100, 100, 100);
        label.setIcon(backgroundImage);

        TextLabel.setBounds(300, 10, 800, 800);
        TextLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        TextLabel.setForeground(Color.white);

        // (y, x, width, height)

        // Bangladesh
        WVButton.setBounds(300, 450, 300, 50);
        WVButton.setFocusable(false);
        WVButton.addActionListener(this);
        WVButton.setForeground(Color.red);

        // World
        BVButton.setBounds(300, 520, 300, 50);
        BVButton.setFocusable(false);
        BVButton.addActionListener(this);
        BVButton.setForeground(Color.red);

        
     // home button
        HomeButton.setBounds(7, 5, 127, 127);
        HomeButton.setFocusable(false);
        HomeButton.addActionListener(this);
        HomeButton.setIcon(home);
        frame1.add(HomeButton);

        // homebutton text
        HomeTextLabel.setBounds(35, 2, 300, 300);
        HomeTextLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
        HomeTextLabel.setForeground(Color.green);
        frame1.add(HomeTextLabel);

        // exit button
        ExitButton.setBounds(1700, 800, 150, 150);
        ExitButton.setFocusable(false);
        ExitButton.addActionListener(this);
        ExitButton.setIcon(exit);
        frame1.add(ExitButton);

        // exitbutton text
        ExitTextLabel.setBounds(1740, 700, 150, 150);
        ExitTextLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        ExitTextLabel.setForeground(Color.red);
        frame1.add(ExitTextLabel);

        

        // panel
        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.black);
        blackPanel.setBounds(680, 5, 1000, 800);
        blackPanel.setLayout(new BorderLayout());

        // frame
        frame1.getContentPane().setBackground(Color.black);
        frame1.setTitle("Pandemic Managment System - Vaccination Info");
        frame1.add(label);
        frame1.add(TextLabel);
        frame1.add(BVButton);
        frame1.add(WVButton);
        frame1.setIconImage(icon.getImage());
        blackPanel.add(label);
        frame1.add(blackPanel);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(1880, 1000);
        frame1.setLayout(null);
        frame1.validate();
        frame1.setVisible(true);


    }

    public void actionPerformed(ActionEvent e) {


        // vaccine update news button

        if (e.getSource() == WVButton) {
            Desktop d = Desktop.getDesktop();
            URL l = null;

            try {
               
                l = new URL("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwjJlsK4pL3wAhUCkMIKHcz_BOcYABAAGgJ0bQ&ae=2&ohost=www.google.com&cid=CAESQOD2ytvjKMzK3zJX3uvjVpTe-Vq_3Vyfbqua7UuVLfXYN4bkcBD7AEz8SGXR9I4ofqOEwcUeV5lUIHD09F9Ajng&sig=AOD64_21UarQj7FRRhKc5e3acOpWXSZwOQ&q&nis=1&adurl&ved=2ahUKEwifx7m4pL3wAhWWaCsKHV2AB6UQ0Qx6BAgDEAE");
            } catch (MalformedURLException e1) {
                
                e1.printStackTrace();
            }

            try {
                
                d.browse(l.toURI());
            } catch (IOException | URISyntaxException e1) {
               
                e1.printStackTrace();
            }
        }

        // vaccine registration news
         if (e.getSource() == BVButton) {
            
            Desktop d = Desktop.getDesktop();
            URL link = null;

            try {
               
                link = new URL("https://corona.gov.bd/corona_surokkha");
            } catch (MalformedURLException e1) {
                
                e1.printStackTrace();
            }

            try {
                d.browse(link.toURI());
                
            } catch (IOException | URISyntaxException e1) {
                
                e1.printStackTrace();
            }
        }
         
      // Home Button
         if (e.getSource() == HomeButton) {
             frame1.dispose();
             Menu menupage = new Menu();
         }

        // Exit Button
       if (e.getSource() == ExitButton) {
            frame1.dispose();
            System.exit(0);
        }
    }
}
