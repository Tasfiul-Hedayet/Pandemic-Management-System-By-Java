
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

public class PandemicUp implements ActionListener {

    ImageIcon icon = new ImageIcon("Icon.png");
    ImageIcon backgroundImage = new ImageIcon("corona.gif");
    ImageIcon home = new ImageIcon("home.gif");
    ImageIcon exit = new ImageIcon("exit.gif");

    JFrame frame2 = new JFrame();
    
    JLabel label = new JLabel();
    JLabel HomeTextLabel = new JLabel("Home");
    JLabel ExitTextLabel = new JLabel("Exit");
    JLabel TextLabel = new JLabel("Select Any");
    
    JButton BDButton = new JButton("Pandemic - Bangladesh Update");
    JButton WDButton = new JButton("Pandemic - Global Update");
    JButton HomeButton = new JButton();
    JButton ExitButton = new JButton();

    PandemicUp() {

        //JFrame frame = new JFrame();

        // (y, x, width, height)

        label.setBounds(450, 100, 100, 100);
        label.setIcon(backgroundImage);

        TextLabel.setBounds(400, 10, 800, 800);
        TextLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        TextLabel.setForeground(Color.white);

        // (y, x, width, height)

        // Bangladesh
        BDButton.setBounds(350, 450, 250, 50);
        BDButton.setFocusable(false);
        BDButton.addActionListener(this);

        // World
        WDButton.setBounds(350, 520, 250, 50);
        WDButton.setFocusable(false);
        WDButton.addActionListener(this);

        // home button
        HomeButton.setBounds(7, 5, 127, 127);
        HomeButton.setFocusable(false);
        HomeButton.addActionListener(this);
        HomeButton.setIcon(home);
        frame2.add(HomeButton);

        // homebutton text
        HomeTextLabel.setBounds(35, 2, 300, 300);
        HomeTextLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
        HomeTextLabel.setForeground(Color.green);
        frame2.add(HomeTextLabel);

        // exit button
        ExitButton.setBounds(1700, 800, 150, 150);
        ExitButton.setFocusable(false);
        ExitButton.addActionListener(this);
        ExitButton.setIcon(exit);
        frame2.add(ExitButton);

        // exitbutton text
        ExitTextLabel.setBounds(1740, 700, 150, 150);
        ExitTextLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        ExitTextLabel.setForeground(Color.red);
        frame2.add(ExitTextLabel);

        // panel
        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.black);
        blackPanel.setBounds(650, 300, 500, 500);
        blackPanel.setLayout(new BorderLayout());

        // frame
        frame2.getContentPane().setBackground(Color.black);
        frame2.setTitle("Pandemic Managment System - Pandemic Update News");
        frame2.add(TextLabel);
        frame2.add(BDButton);
        frame2.add(WDButton);
        frame2.add(label);
        frame2.setIconImage(icon.getImage());
        blackPanel.add(label);
        frame2.add(blackPanel);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(1880, 1000);
        frame2.setLayout(null);
        frame2.validate();
        frame2.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        // Bangladesh button
        if (e.getSource() == BDButton) {
            
            
            
            Desktop d = Desktop.getDesktop();
            URL l = null;
            
            try {
                
                l = new URL("https://corona.gov.bd/");
            } catch (MalformedURLException e1) {
                
                e1.printStackTrace();
            }
            try {
                d.browse(l.toURI());
            } catch (IOException | URISyntaxException e1) {
               
                e1.printStackTrace();
            }
        }

        // world button
         if (e.getSource() == WDButton) {
             
            
            Desktop d = Desktop.getDesktop();
            URL link = null;
            
            try {
                
                link = new URL("https://www.worldometers.info/coronavirus/");
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
            frame2.dispose();
            Menu menupage = new Menu();
        }

        // Exit Button
        if (e.getSource() == ExitButton) {
            frame2.dispose();
            System.exit(0);
        }
    }
}
