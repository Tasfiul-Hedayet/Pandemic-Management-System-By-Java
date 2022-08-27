
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

public class LoadingPage implements ActionListener{

    ImageIcon icon1 = new ImageIcon("Icon.png");
    ImageIcon next = new ImageIcon("Next.gif");
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JButton NextButton = new JButton("");
    
    
    LoadingPage(){
        
        ImageIcon icon = new ImageIcon("loading.gif");
        
        JLabel label = new JLabel();
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.LEFT);   
     
        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.black);
        blackPanel.setBounds(650, 300, 500, 500);
        blackPanel.setLayout(new BorderLayout());
        
        //(y, x, width, height)
        
        NextButton.setBounds(1500, 700, 110, 110);
        NextButton.setFocusable(false);
        NextButton.addActionListener(this);
        NextButton.setIcon(next);
        
      
        frame.getContentPane().setBackground(Color.black);
        frame.setTitle("Welcome to Pandemic Managment System - Loading Page");
        frame.add(NextButton);
        frame.setIconImage(icon1.getImage()); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1880, 1000);
        frame.setLayout(null);    
        frame.validate();
        frame.setVisible(true);
        blackPanel.add(label);
        frame.add(blackPanel);    
     
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == NextButton) {
            frame.dispose();
            IDandPasswords idandPasswords = new IDandPasswords();
            Login login = new Login(idandPasswords.getLoginInfo());

        }
    }
}
