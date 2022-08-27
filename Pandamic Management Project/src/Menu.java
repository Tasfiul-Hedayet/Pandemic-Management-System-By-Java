
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Menu implements ActionListener {

    ImageIcon icon1 = new ImageIcon("Icon.png");
    ImageIcon menu = new ImageIcon("menu.png");
    ImageIcon exit = new ImageIcon("exit.gif");

    JFrame frame = new JFrame();
    
    JLabel labelicon = new JLabel();
    JLabel label = new JLabel();
    JLabel ExitTextLabel = new JLabel();
    
    JButton EDocButton = new JButton("E-Doctor");
    JButton BbankButton = new JButton("Blood Bank");
    JButton ICUButton = new JButton("ICU");
    JButton MedButton = new JButton("Medicine Store");
    JButton VacButton = new JButton("Vaccination");
    JButton PUpButton = new JButton("Pandemic Update");
    JButton ExitButton = new JButton("Exit");

    Menu() {

        // label.setIcon(icon);//create a icone
        label.setBounds(200, 0, 2300, 1000);
        label.setIcon(menu);

        // e-doctor
        EDocButton.setBounds(390, 450, 100, 50);
        EDocButton.setFocusable(false);
        EDocButton.addActionListener(this);

        // blood bank
        BbankButton.setBounds(875, 450, 100, 50);
        BbankButton.setFocusable(false);
        BbankButton.addActionListener(this);

        // ICU
        ICUButton.setBounds(1315, 450, 100, 50);
        ICUButton.setFocusable(false);
        ICUButton.addActionListener(this);

        // Medicine
        MedButton.setBounds(385, 770, 120, 50);
        MedButton.setFocusable(false);
        MedButton.addActionListener(this);

        // Vaccine
        VacButton.setBounds(870, 770, 110, 50);
        VacButton.setFocusable(false);
        VacButton.addActionListener(this);

        // Pandemic update
        PUpButton.setBounds(1315, 770, 140, 50);
        PUpButton.setFocusable(false);
        PUpButton.addActionListener(this);

        // exit button
        ExitButton.setBounds(1700, 800, 150, 150);
        ExitButton.setFocusable(false);
        ExitButton.addActionListener(this);
        ExitButton.setIcon(exit);

        // exitbutton text
        ExitTextLabel.setBounds(1740, 700, 150, 150);
        ExitTextLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        ExitTextLabel.setForeground(Color.red);

        // frame
        frame.setResizable(true);
        frame.getContentPane().setBackground(Color.black);
        frame.setTitle("Pandemic Management System - Home");
        frame.add(EDocButton);
        frame.add(BbankButton);
        frame.add(ICUButton);
        frame.add(MedButton);
        frame.add(VacButton);
        frame.add(PUpButton);
        frame.add(ExitTextLabel);
        frame.add(ExitButton);
        frame.add(label);
        frame.add(labelicon);
        frame.setIconImage(icon1.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1880, 1000);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == EDocButton) {
            frame.dispose();
            E_Doctor_Introduction ed = new E_Doctor_Introduction();
        }

        else if (e.getSource() == BbankButton) {
            frame.dispose();
            BloodBank bb = new BloodBank();
            new BloodBank().setVisible(true);

        }

        else if (e.getSource() == ICUButton) {            
            frame.dispose();
            ICU icu = new ICU();
            new ICU().setVisible(true);
        }
        
        else if (e.getSource() == MedButton) {
            frame.dispose();
            MedicalStore med = new MedicalStore();
            new MedicalStore().setVisible(true);

        }
        else if (e.getSource() == VacButton) {
            frame.dispose();
            Vaccine_Intro vc = new Vaccine_Intro();
        }
        else if (e.getSource() == PUpButton) {
            frame.dispose();
            PandemicUp Pup = new PandemicUp();
        }
        else if (e.getSource() == ExitButton) {
            frame.dispose();
            System.exit(0);
        }

    }
}
