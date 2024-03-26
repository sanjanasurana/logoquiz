import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ActionListenerExample implements ActionListener {
    JTextField tf_user, tf_pass1, tf_pass2;
    JLabel label1, label2;
    JButton b1, b2, b3, b_next, b_back;
    static JButton easy_b[] = new JButton[5];

    static JButton medium_b[] = new JButton[5];
    static JButton hard_b[] = new JButton[5];

    //int but_check[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    JFrame f, f1, f2;
    String mode;
    String[] easyLevels = {"Easy Level 1", "Easy Level 2", "Easy Level 3", "Easy Level 4", "Easy Level 5"};
    String[] mediumLevels = {"Medium Level 1", "Medium Level 2", "Medium Level 3", "Medium Level 4", "Medium Level 5"};
    String[] hardLevels = {"Hard Level 1", "Hard Level 2", "Hard Level 3", "Hard Level 4", "Hard Level 5"};

    static int button_check[] = new int[15];
    static int score = 0;
    ActionListenerExample() {
        f = new JFrame("Username and Password");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel label_user = new JLabel("Username:");
        tf_user = new JTextField();
        JLabel label_pass1 = new JLabel("Password:");
        tf_pass1 = new JPasswordField();
        JLabel label_pass2 = new JLabel("Confirm Password:");
        tf_pass2 = new JPasswordField();

        panel.add(label_user);
        panel.add(tf_user);
        panel.add(label_pass1);
        panel.add(tf_pass1);
        panel.add(label_pass2);
        panel.add(tf_pass2);

        b_next = new JButton("Next");
        b_next.addActionListener(this);

        panel.add(new JLabel());
        panel.add(b_next);

        for (int i = 0; i < easy_b.length; i++) {
            easy_b[i] = new JButton("Button " + (i + 1));
        }
        for (int i = 0; i < medium_b.length; i++) {
            medium_b[i] = new JButton("Button " + (i + 1));
        }
        for (int i = 0; i < hard_b.length; i++) {
            hard_b[i] = new JButton("Button " + (i + 1));
        }
        f.add(panel);
        f.setSize(400, 200);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }



    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b_next) {
            if (!tf_pass1.getText().equals(tf_pass2.getText())) {
                JOptionPane.showMessageDialog(f, "Passwords don't match!");
            } else {
                JOptionPane.showMessageDialog(f, "Passwords matched!");
                showDifficultySelection();
            }
        } else if (e.getSource() == b1 || e.getSource() == b2 || e.getSource() == b3) {
            mode = e.getActionCommand();
            createLevelsScreen(mode);
        } else if (e.getSource() == b_back) {
            if (f2 != null && f2.isVisible()) {
                f2.setVisible(false);
                showDifficultySelection();
            } else if (f1 != null && f1.isVisible()) {
                f1.setVisible(false);
                showDifficultySelection();
            }
        }
        else if(e.getSource() == easy_b[0]  && button_check[0]!=1)
        {
            easy_b[0].setSelected(true);
            //button_check[0]=1;
            System.out.println("u chose 1st lvl");
            executeJavaFile("proj_finalll.java");
        }
        else if(e.getSource() == easy_b[1] && button_check[1]!=1)
        {
            easy_b[1].setSelected(true);
            //button_check[1]=1;
            System.out.println("u chose 2nd lvl");
            executeJavaFile("proj_finalll.java");
        }
        else if(e.getSource() == easy_b[2] && button_check[2]!=1)
        {
            easy_b[2].setSelected(true);
            //button_check[2]=1;
            System.out.println("u chose 3rd lvl");
            executeJavaFile("proj_finalll.java");
        }
        else if(e.getSource() == easy_b[3] && button_check[3]!=1)
        {
            easy_b[3].setSelected(true);
            //button_check[3]=1;
            System.out.println("u chose 4th lvl");
            executeJavaFile("proj_new.java");
        }else if(e.getSource() == easy_b[4] && button_check[4]!=1)
        {
            easy_b[4].setSelected(true);
            //button_check[4]=1;
            System.out.println("u chose 5th lvl");
            executeJavaFile("proj_finalll.java");
        }
        else if(e.getSource() == medium_b[0] && button_check[5]!=1)
        {
            medium_b[0].setSelected(true);
            //button_check[5]=1;
            System.out.println("u chose m1 lvl");
            executeJavaFile("proj_finalll.java");
        }
        else if(e.getSource() == medium_b[1] && button_check[6]!=1)
        {
            medium_b[1].setSelected(true);
            //button_check[6]=1;
            System.out.println("u chose m2 lvl");
            executeJavaFile("proj_finalll.java");
        }
        else if(e.getSource() == medium_b[2] && button_check[7]!=1)
        {
            medium_b[2].setSelected(true);
            //button_check[7]=1;
            System.out.println("u chose m3 lvl");
            executeJavaFile("proj_finalll.java");
        }
        else if(e.getSource() == medium_b[3] && button_check[8]!=1)
        {
            medium_b[3].setSelected(true);
            //button_check[8]=1;
            System.out.println("u chose m4 lvl");
            executeJavaFile("proj_finalll.java");
        }else if(e.getSource() == medium_b[4] && button_check[9]!=1)
        {
            medium_b[4].setSelected(true);
            //button_check[9]=1;
            System.out.println("u chose m5 lvl");
            executeJavaFile("proj_finalll.java");
        }
        else if(e.getSource() == hard_b[0] && button_check[10]!=1)
        {
            hard_b[0].setSelected(true);
            //button_check[10]=1;
            System.out.println("u chose h1 lvl");
            executeJavaFile("proj_finalll.java");
        }
        else if(e.getSource() == hard_b[1] && button_check[11]!=1)
        {
            hard_b[1].setSelected(true);
            //button_check[11]=1;
            System.out.println("u chose h2 lvl");
            executeJavaFile("proj_finalll.java");
        }
        else if(e.getSource() == hard_b[2] && button_check[12]!=1)
        {
            hard_b[2].setSelected(true);
            //button_check[12]=1;
            System.out.println("u chose h3 lvl");
            executeJavaFile("proj_finalll.java");
        }
        else if(e.getSource() == hard_b[3] && button_check[13]!=1)
        {
            hard_b[3].setSelected(true);
            //button_check[13]=1;
            System.out.println("u chose h4 lvl");
            executeJavaFile("proj_finalll.java");
        }
        else if(e.getSource() == hard_b[4] && button_check[14]!=1)
        {
            hard_b[4].setSelected(true);
            //button_check[14]=1;
            System.out.println("u chose h5 lvl");
            executeJavaFile("proj_finalll.java");
        }



        else {

//            JOptionPane.showMessageDialog(null, "You clicked on: " + e.getActionCommand());
            //executeJavaFile("proj_new.java");
        }
    }

    private void showDifficultySelection() {
        f.setVisible(false);
        JFrame difficultyFrame = new JFrame("Difficulty Selection");
        difficultyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        b1 = new JButton("Easy Levels");
        b1.setActionCommand("Easy");
        b1.setPreferredSize(new Dimension(150, 30));
        b2 = new JButton("Medium Levels");
        b2.setActionCommand("Medium");
        b2.setPreferredSize(new Dimension(150, 30));
        b3 = new JButton("Hard Levels");
        b3.setActionCommand("Hard");
        b3.setPreferredSize(new Dimension(150, 30));
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        label1 = new JLabel("You have selected easy levels");
        label2 = new JLabel("You have selected medium levels");
        JLabel label3 = new JLabel("You have selected hard levels");
        label1.setVisible(false);
        label2.setVisible(false);
        label3.setVisible(false);

        JPanel labelPanel = new JPanel(new GridLayout(1, 3));
        labelPanel.add(label1);
        labelPanel.add(label2);
        labelPanel.add(label3);

        panel.add(buttonPanel, BorderLayout.NORTH);
        panel.add(labelPanel, BorderLayout.CENTER);

        difficultyFrame.add(panel);
        difficultyFrame.setSize(600, 150);
        difficultyFrame.setLocationRelativeTo(null);
        difficultyFrame.setVisible(true);
    }

    private String[] getLevelsArray(String mode) {
        switch (mode) {
            case "Easy":
                System.out.println("Selected mode: Easy");
                return easyLevels;
            case "Medium":
                System.out.println("Selected mode: Medium");
                return mediumLevels;
            case "Hard":
                System.out.println("Selected mode: Hard");
                return hardLevels;
            default:
                System.out.println("Selected mode: Default");
                return easyLevels;
        }
    }
    private void createLevelsScreen(String mode) {
        f1 = new JFrame(mode + " Mode Levels");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(600, 400);
        f1.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        String[] levels = getLevelsArray(mode);
        switch(mode)
        {
            case "Easy":
                int e_iter = 0;
                for (String level : levels) {
                    easy_b[e_iter] = new JButton(level);
                    easy_b[e_iter].addActionListener(this);
                    if(button_check[e_iter]==1)
                        easy_b[e_iter].setEnabled(false);

                    panel.add(easy_b[e_iter]);
                    e_iter++;
                }
                break;
            case "Medium":
                int m_iter = 0;
                for (String level : levels) {
                    medium_b [m_iter] = new JButton(level);
                    medium_b [m_iter].addActionListener(this);
                    if(button_check[m_iter+5]==1)
                        medium_b[m_iter].setEnabled(false);
                    panel.add(medium_b [m_iter]);
                    m_iter++;
                }
                break;
            case "Hard":
                int h_iter = 0;
                for (String level : levels) {
                    hard_b [h_iter] = new JButton(level);
                    hard_b [h_iter].addActionListener(this);
                    if(button_check[h_iter+10]==1)
                        hard_b[h_iter].setEnabled(false);
                    panel.add(hard_b [h_iter]);
                    h_iter++;
                }
                break;
        }

//        for (String level : levels) {
//            JButton levelButton = new JButton(level);
//            levelButton.addActionListener(this);
//            panel.add(levelButton);
//        }
        b_back = new JButton("Back");
        b_back.addActionListener(this);
        panel.add(new JLabel());
        panel.add(b_back);

        f1.add(panel);
        f1.setVisible(true);
    }

    private void executeJavaFile(String name) {
        proj_new instance = new proj_new();
        instance.actionPerformedCheck();
        instance.level();
    }

    public static void main(String[] args) {
        new ActionListenerExample();
    }
}
