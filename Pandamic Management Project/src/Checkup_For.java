
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Checkup_For implements ActionListener {

    ImageIcon icon = new ImageIcon("Icon.png");
    ImageIcon exit = new ImageIcon("exit.gif");
    
    
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JLabel TextLabel = new JLabel("Who is the checkup for? Click");
    JLabel ExitTextLabel = new JLabel();
    JButton MyselfButton = new JButton("Myself");
    JButton SomeoneButton = new JButton("Someone");
    JButton ExitButton = new JButton("Exit");
    
    Checkup_For() {

        label.setBounds(400, 200, 1000, 500);
        label.setFont(new Font("Times New Roman", Font.ITALIC, 50));

        TextLabel.setBounds(600, 10, 500, 500);
        TextLabel.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        TextLabel.setForeground(Color.MAGENTA);

        // (y, x, width, height)
        // myself

        MyselfButton.setBounds(650, 297, 200, 25);
        MyselfButton.setFocusable(false);
        MyselfButton.addActionListener(this);

        // Someone else
        SomeoneButton.setBounds(650, 350, 200, 25);
        SomeoneButton.setFocusable(false);
        SomeoneButton.addActionListener(this);

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

        frame.getContentPane().setBackground(Color.black);
        frame.setTitle("Pandemic Managment System - Checkup For");
        frame.add(TextLabel);
        frame.add(MyselfButton);
        frame.add(SomeoneButton);
        frame.add(ExitTextLabel);
        frame.add(ExitButton);
        frame.add(label);
        frame.setIconImage(icon.getImage());
        blackPanel.add(label);
        frame.add(blackPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1880, 1000);
        frame.setLayout(null);
        frame.validate();
        frame.setVisible(true);
 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //myself
        if (e.getSource() == MyselfButton) {
            frame.dispose();
            GenderSelection genderselection = new GenderSelection();
        }
        //someone button
        if (e.getSource() == SomeoneButton) {
            frame.dispose();
            GenderSelection genderselection = new GenderSelection();
        }
        //exit button
        if (e.getSource() == ExitButton) {
            frame.dispose();
            System.exit(0);
        }
    }
}
