
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Edoc implements ActionListener {

    ImageIcon icon = new ImageIcon("Icon.png");
    ImageIcon home = new ImageIcon("home.gif");
    ImageIcon exit = new ImageIcon("exit.gif");
    ImageIcon icon1 = new ImageIcon("submit.gif");
    
    JFrame fram = new JFrame();
    JLabel label = new JLabel();
    JLabel HomeTextLabel = new JLabel("Home");
    JLabel ExitTextLabel = new JLabel("Exit");
    JLabel TextLabel = new JLabel("Click to get your online Doctor - ");
    JButton SubmitButton = new JButton();
    JButton HomeButton = new JButton("");
    JButton ExitButton = new JButton("");

    Edoc() {


        label.setBounds(400, 200, 1000, 500);
        label.setFont(new Font("Times New Roman", Font.ITALIC, 50));

        TextLabel.setBounds(600, 10, 500, 500);
        TextLabel.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        TextLabel.setForeground(Color.MAGENTA);

        // (y, x, width, height)
        // Age

        SubmitButton.setBounds(650, 350, 250, 100);
        SubmitButton.setFocusable(true);
        SubmitButton.addActionListener(this);
        SubmitButton.setIcon(icon1);

        
     // home button
        HomeButton.setBounds(7, 5, 127, 127);
        HomeButton.setFocusable(false);
        HomeButton.addActionListener(this);
        HomeButton.setIcon(home);
        fram.add(HomeButton);

        // homebutton text
        HomeTextLabel.setBounds(35, 2, 300, 300);
        HomeTextLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
        HomeTextLabel.setForeground(Color.green);
        fram.add(HomeTextLabel);

        // exit button
        ExitButton.setBounds(1700, 800, 150, 150);
        ExitButton.setFocusable(false);
        ExitButton.addActionListener(this);
        ExitButton.setIcon(exit);
        fram.add(ExitButton);

        // exitbutton text
        ExitTextLabel.setBounds(1740, 700, 150, 150);
        ExitTextLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        ExitTextLabel.setForeground(Color.red);
        fram.add(ExitTextLabel);
        

        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.black);
        blackPanel.setBounds(650, 300, 500, 500);
        blackPanel.setLayout(new BorderLayout());

        fram.getContentPane().setBackground(Color.black);
        fram.setTitle("Pandemic Managment System - Age");
        fram.add(TextLabel);
        fram.add(SubmitButton);
        fram.add(label);
        fram.setIconImage(icon.getImage());
        blackPanel.add(label);
        fram.add(blackPanel);
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fram.setSize(1880, 1000);
        fram.setLayout(null);
        fram.validate();
        fram.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        // malebutton
        if (e.getSource() == SubmitButton) {
            Desktop d = Desktop.getDesktop();
            URL l = null;

            try {
               
                l = new URL("https://www.doctorbangladesh.com/");
            } catch (MalformedURLException e1) {
                
                e1.printStackTrace();
            }

            try {
                
                d.browse(l.toURI());
            } catch (IOException | URISyntaxException e1) {
               
                e1.printStackTrace();
            }
        }
        
     // Home Button
        if (e.getSource() == HomeButton) {
            fram.dispose();
            Menu menupage = new Menu();
        }

       // Exit Button
      if (e.getSource() == ExitButton) {
           fram.dispose();
           System.exit(0);
       }
    }
}
