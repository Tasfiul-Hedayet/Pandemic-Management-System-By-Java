
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GenderSelection implements ActionListener {

    ImageIcon icon = new ImageIcon("Icon.png");
    ImageIcon exit = new ImageIcon("exit.gif");

    JFrame frame4 = new JFrame();
    JLabel label = new JLabel();
    JLabel ExitTextLabel = new JLabel();
    JLabel TextLabel = new JLabel("Select Gender - ");
    JButton MaleButton = new JButton("Male");
    JButton FemaleButton = new JButton("Female");
    JButton ExitButton = new JButton("Exit");

    GenderSelection() {


        label.setBounds(400, 200, 1000, 500);
        label.setFont(new Font("Times New Roman", Font.ITALIC, 50));

        TextLabel.setBounds(670, 10, 500, 500);
        TextLabel.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        TextLabel.setForeground(Color.MAGENTA);

        // (y, x, width, height)
        // male

        MaleButton.setBounds(650, 297, 200, 25);
        MaleButton.setFocusable(false);
        MaleButton.addActionListener(this);

        // female
        FemaleButton.setBounds(650, 350, 200, 25);
        FemaleButton.setFocusable(false);
        FemaleButton.addActionListener(this);

        // exit button
        ExitButton.setBounds(1700, 800, 150, 150);
        ExitButton.setFocusable(false);
        ExitButton.addActionListener(this);
        ExitButton.setIcon(exit);

        // exitbutton text
        ExitTextLabel.setBounds(1740, 700, 150, 150);
        ExitTextLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        ExitTextLabel.setForeground(Color.red);

        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.black);
        blackPanel.setBounds(650, 300, 500, 500);
        blackPanel.setLayout(new BorderLayout());

        frame4.getContentPane().setBackground(Color.black);
        frame4.setTitle("Pandemic Managment System - Gender");
        frame4.add(TextLabel);
        frame4.add(MaleButton);
        frame4.add(FemaleButton);
        frame4.add(ExitTextLabel);
        frame4.add(ExitButton);
        frame4.add(label);
        frame4.setIconImage(icon.getImage());
        blackPanel.add(label);
        frame4.add(blackPanel);
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.setSize(1880, 1000);
        frame4.setLayout(null);
        frame4.validate();
        frame4.setVisible(true);
 

    }

    public void actionPerformed(ActionEvent e) {

        // exit button
        if (e.getSource() == ExitButton) {
            frame4.dispose();
            System.exit(0);
        }
        
        //malebutton
        if (e.getSource() == MaleButton) {
            frame4.dispose();
            Edoc age = new Edoc();
        }
        
        //female button
        if (e.getSource() == FemaleButton) {
            frame4.dispose();
            Edoc age = new Edoc();

        }
    }
}
