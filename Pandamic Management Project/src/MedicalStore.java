

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


class MedicalStorelist {
    String name;
    String divison;
    String area;
    String number;

    public MedicalStorelist(String cn, String s, String f, String r) {
        this.name = cn;
        this.divison = s;
        this.area = f;
        this.number = r;
    }

    public String toString() {
        return this.name + " " + this.divison + " " + this.area + " " + this.number + "\n";
    }
}

public class MedicalStore extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    int n;
    
    MedicalStorelist List[] = new MedicalStorelist[n];

    String path = "C://Users//User//eclipse-workspace//Pandamic Management Project/src/Med.txt";

    Container con2 = getContentPane();

    ImageIcon home = new ImageIcon("home.gif");
    ImageIcon exit = new ImageIcon("exit.gif");
    
    JTextField searchBox = new JTextField();
    JLabel HomeTextLabel = new JLabel("Home");
    JLabel ExitTextLabel = new JLabel("Exit");
    
    JButton searchButton = new JButton("Search");
    JButton resetButton = new JButton("Refresh");
    JButton HomeButton = new JButton();
    JButton ExitButton = new JButton();
    
    
    DefaultTableModel model = new DefaultTableModel();
    JTable courseTable = new JTable(model);
    JScrollPane scroll = new JScrollPane(courseTable);

    MedicalStore() {

        this.setTitle("Pandemic Managment System - MedicalStore");
        this.setSize(1880, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\eclipse-workspace\\Pandamic Management Project\\Icon.png"));
        
        countLines();
        Load();

        LoadTable();

        Init();
        addActionEvent();
    }

    public void Init() {
        
        con2.setLayout(null);
        con2.setBackground(Color.black);
        scroll.setBounds(672, 200, 500, 200);
        con2.add(scroll);

        searchBox.setBounds(700, 100, 250, 25);
        searchBox.setToolTipText("Search here");
        searchBox.setFont(new Font("San Francisco", Font.PLAIN, 16));
        con2.add(searchBox);

        searchButton.setBounds(950, 100, 95, 25);
        searchButton.setBackground(new Color(41, 232, 242));
        searchButton.setFont(new Font("San Francisco", Font.BOLD, 17));
        con2.add(searchButton);

        resetButton.setBounds(1047, 100, 95, 25);
        resetButton.setBackground(new Color(41, 232, 242));
        resetButton.setFont(new Font("San Francisco", Font.BOLD, 17));
        con2.add(resetButton);
        
     // homebutton text
        HomeTextLabel.setBounds(35, 2, 300, 300);
        HomeTextLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
        HomeTextLabel.setForeground(Color.green);
        con2.add(HomeTextLabel);
        
     // home button
        HomeButton.setBounds(7, 5, 127, 127);
        HomeButton.setFocusable(false);
        HomeButton.addActionListener(this);
        HomeButton.setIcon(home);
        con2.add(HomeButton);
        
     // exitbutton text
        ExitTextLabel.setBounds(1740, 700, 150, 150);
        ExitTextLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        ExitTextLabel.setForeground(Color.red);
        con2.add(ExitTextLabel);
        
        
     // exit button
        ExitButton.setBounds(1700, 800, 150, 150);
        ExitButton.setFocusable(false);
        ExitButton.addActionListener(this);
        ExitButton.setIcon(exit);
        con2.add(ExitButton);
        
   
    }

    public void addActionEvent() {
        searchButton.addActionListener(this);
        resetButton.addActionListener(this);
        HomeButton.addActionListener(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == searchButton) {
            String text = searchBox.getText();
            model.setRowCount(0); // clear table contents

            for (int i = 0; i < n; i++) {
                if (text.equalsIgnoreCase(List[i].name) || text.equalsIgnoreCase(List[i].divison)
                        || text.equalsIgnoreCase(List[i].area) || text.equalsIgnoreCase(List[i].number)) {
                    model.addRow(new Object[] {List[i].name, List[i].divison, List[i].area,
                            List[i].number });
                } else if (text.equals("")) {
                    model.addRow(new Object[] { List[i].name, List[i].divison, List[i].area,
                            List[i].number });
                }
            }
        }
        if (e.getSource() == resetButton) {
            if (!searchBox.equals("")) {
                model.setRowCount(0); // clear table contents
                model.setColumnCount(0);
                searchBox.setText("");
                LoadTable();
            }
        }
        
     // Home Button
        if (e.getSource() == HomeButton) {
            this.dispose();
            Menu menupage = new Menu();
        }
        // Exit Button
        if (e.getSource() == ExitButton) {
            this.dispose();
            System.exit(0);
        }
        
    }

    public int countLines() {
        int count = 0;
        try {
            Scanner get = new Scanner(new File(path));

            while (get.hasNextLine()) {
                get.nextLine();
                count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        n = count;
        List = new MedicalStorelist[n];

        return count;
    }

    public void Load() {
        try {

            Scanner get = new Scanner(new File(path));
            String line, arr[];

            for (int i = 0; i < n; i++) {
                line = get.nextLine();
                arr = line.split(" ");
                List[i] = new MedicalStorelist(arr[0], arr[1], arr[2], arr[3]);
            }
        } catch (Exception ep) {
            System.out.println("ERROR 404! File-Not-Found");
            // ep.printStackTrace();
        }
    }

    public void LoadTable() {
        
        // add header
        model.addColumn("Store Name");
        model.addColumn("Division");
        model.addColumn("Area");
        model.addColumn("Contact No");
        

        // add data
        for (int i = 0; i < n; i++) {
            model.addRow(new Object[] { List[i].name, List[i].divison, List[i].area,
                    List[i].number });
        }

    }
}