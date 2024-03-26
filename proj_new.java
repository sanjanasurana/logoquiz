import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import java.awt.*;
public class proj_new implements ActionListener
{
    //JToggleButton b1,b2,b3,b4;
    JToggleButton b[] = new JToggleButton[16];
    JButton hint,submit, clear;
    JTextField t1,score_txt;
    String answer = "";
    JFrame f = new JFrame();
    JPanel panel = new JPanel();
    JPanel imgpanel = new JPanel();
    static ImageIcon icon1 = new ImageIcon();
    static ImageIcon icon2 = new ImageIcon(); //hint wala
    ImageIcon icon3 = new ImageIcon("C:/" +
            "Users/Admin/Pictures/Wallpapers/NYC2.jpg");

    //JLabel l = new JLabel(icon1);
    JLabel l = new JLabel();
    String s = "♡ ♡ ♡";

    JLabel score_lab = new JLabel();
    JLabel lives_lab = new JLabel("<html>Lives: <font color='red'>♡ ♡ ♡</font></html>");

    boolean sel = false;
    int score_new = ActionListenerExample.score;
    //String a[] = {"I","P","T","B","M","E","P","H","A","U","S","F","A","T","G","P"};
    static String levels[] = new String[16];

    static public String ans ;
    //int i[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
    //JLabel lives_lab = new JLabel();
//    int scores = 0;
    int lives = 3;
    JButton b_check = new JButton();
    void removeSel(JButton b_removal)
    {
        b_removal.setSelected(false);
    }
    void actionPerformedCheck() {
        System.out.println("hello");
        if ( ActionListenerExample.easy_b[0].isSelected())
        {
            levels = new String[]{"I","P","T","B","M","E","P","H","A","U","S","F","A","T","G","P"};
            ans = "PEPSI";
            removeSel(ActionListenerExample.easy_b[0]);
            b_check =  ActionListenerExample.easy_b[0];
            icon1 = new ImageIcon("Wallpapers/pepsi_1.png");
            icon2 = new ImageIcon("Wallpapers/pepsi_2.png");
        }
        else if ( ActionListenerExample.easy_b[1].isSelected())
        {
            levels = new String[]{"N","P","D","B","M","S","P","H","A","U","S","I","E","T","G","Y"};
            ans = "DISNEY";
            removeSel(ActionListenerExample.easy_b[1]);
            b_check =  ActionListenerExample.easy_b[1];
            icon1 = new ImageIcon("Wallpapers/Disney_1.png");
            icon2 = new ImageIcon("Wallpapers/Disney_2.png");

        }
        else if ( ActionListenerExample.easy_b[2].isSelected())
        {
            levels = new String[]{"E","Z","D","B","C","S","O","H","R","U","S","I","R","T","M","Y"};
            ans = "CHROME";
            removeSel(ActionListenerExample.easy_b[2]);
            b_check =  ActionListenerExample.easy_b[2];
            icon1 = new ImageIcon("Wallpapers/Chrome1.png");
            icon2 = new ImageIcon("Wallpapers/Chrome2.png");
        }
        else if ( ActionListenerExample.easy_b[3].isSelected())
        {
            levels = new String[]{"N","F","A","B","M","B","P","O","O","U","E","I","C","X","G","K"};
            ans = "FACEBOOK";
            removeSel(ActionListenerExample.easy_b[3]);
            b_check =  ActionListenerExample.easy_b[3];
            icon1 = new ImageIcon("Wallpapers/fb_1.png");
            icon2 = new ImageIcon("Wallpapers/fb_2.png");
        }else if ( ActionListenerExample.easy_b[4].isSelected())
        {
            levels = new String[]{"H","P","E","C","M","F","I","K","S","F","S","I","E","R","W","Q"};
            ans = "KFC";
            removeSel(ActionListenerExample.easy_b[4]);
            b_check =  ActionListenerExample.easy_b[4];
            icon1 = new ImageIcon("Wallpapers/kfc_1.png");
            icon2 = new ImageIcon("Wallpapers/kfc_2.png");
        }
        else if ( ActionListenerExample.medium_b[0].isSelected())
        {
            levels = new String[]{"Z","P","T","L","M","E","P","H","A","U","S","F","A","T","G","P"};
            ans = "APPLE";
            removeSel(ActionListenerExample.medium_b[0]);
            b_check =  ActionListenerExample.medium_b[0];
            icon1 = new ImageIcon("Wallpapers/Apple1.png");
            icon2 = new ImageIcon("Wallpapers/Apple2.png");
        }
        else if ( ActionListenerExample.medium_b[1].isSelected())
        {
            levels = new String[]{"N","P","D","L","M","S","P","H","A","U","S","I","E","T","G","Y"};
            ans = "LG";
            removeSel(ActionListenerExample.medium_b[1]);
            b_check =  ActionListenerExample.medium_b[1];
            icon1 = new ImageIcon("Wallpapers/LG1.png");
            icon2 = new ImageIcon("Wallpapers/LG2.png");
        }
        else if ( ActionListenerExample.medium_b[2].isSelected())
        {
            levels = new String[]{"G","Z","D","N","E","S","O","L","R","U","S","I","R","T","M","P"};
            ans = "PRINGLES";
            removeSel(ActionListenerExample.medium_b[2]);
            b_check =  ActionListenerExample.medium_b[2];
            icon1 = new ImageIcon("Wallpapers/Pringles1.png");
            icon2 = new ImageIcon("Wallpapers/Pringles2.png");
        }
        else if ( ActionListenerExample.medium_b[3].isSelected())
        {
            levels = new String[]{"N","F","A","B","M","B","P","O","O","U","E","I","C","U","G","K"};
            ans = "PUMA";
            removeSel(ActionListenerExample.medium_b[3]);
            b_check =  ActionListenerExample.medium_b[3];
            icon1 = new ImageIcon("Wallpapers/Puma1.png");
            icon2 = new ImageIcon("Wallpapers/Puma2.png");
        }else if ( ActionListenerExample.medium_b[4].isSelected())
        {
            levels = new String[]{"H","P","E","C","M","F","L","K","S","F","S","I","E","R","L","Q"};
            ans = "SHELL";
            removeSel(ActionListenerExample.medium_b[4]);
            b_check =  ActionListenerExample.medium_b[4];
            icon1 = new ImageIcon("Wallpapers/Shell1.png");
            icon2 = new ImageIcon("Wallpapers/Shell2.png");
        }
        else if ( ActionListenerExample.hard_b[0].isSelected())
        {
            levels = new String[]{"I","O","T","L","M","E","N","C","A","U","D","F","S","O","D","R"};
            ans = "MCDONALDS";
            removeSel(ActionListenerExample.hard_b[0]);
            b_check =  ActionListenerExample.hard_b[0];
            icon1 = new ImageIcon("Wallpapers/MCD1.png");
            icon2 = new ImageIcon("Wallpapers/MCD2.png");
        }
        else if ( ActionListenerExample.hard_b[1].isSelected())
        {
            levels = new String[]{"N","P","D","B","M","S","O","H","A","I","S","I","E","T","O","Y"};
            ans = "DOMINOS";
            removeSel(ActionListenerExample.hard_b[1]);
            b_check =  ActionListenerExample.hard_b[1];
            icon1 = new ImageIcon("Wallpapers/Dominos1.png");
            icon2 = new ImageIcon("Wallpapers/Dominos2.png");
        }
        else if ( ActionListenerExample.hard_b[2].isSelected())
        {
            levels = new String[]{"E","Z","D","R","C","S","O","F","R","U","S","I","R","A","M","Y"};
            ans = "FERRARI";
            removeSel(ActionListenerExample.hard_b[2]);
            b_check =  ActionListenerExample.hard_b[2];
            icon1 = new ImageIcon("Wallpapers/Ferrari1.png");
            icon2 = new ImageIcon("Wallpapers/Ferrari2.png");
        }
        else if ( ActionListenerExample.hard_b[3].isSelected())
        {
            levels = new String[]{"J","F","A","B","M","B","P","O","O","U","E","I","A","X","G","V"};
            ans = "JAVA";
            b_check =  ActionListenerExample.hard_b[3];
            removeSel(ActionListenerExample.hard_b[3]);
            icon1 = new ImageIcon("Wallpapers/Java1.png");
            icon2 = new ImageIcon("Wallpapers/Java2.png");
        }
        else if ( ActionListenerExample.hard_b[4].isSelected())
        {
            levels = new String[]{"L","N","E","C","M","F","I","K","S","F","S","I","E","H","W","L"};
            ans = "NIKE";
            b_check =  ActionListenerExample.hard_b[4];
            removeSel(ActionListenerExample.hard_b[4]);
            icon1 = new ImageIcon("Wallpapers/nike_1.png");
            icon2 = new ImageIcon("Wallpapers/nike_2.png");
        }
        else
        {

        }
    }
    void level() {
        imgpanel.setSize(400,400);
        imgpanel.setBackground(Color.decode("#F0CDC1"));
        f.add(imgpanel);
        imgpanel.setVisible(true);
//        l.setIcon(new ImageIcon(icon1.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
//        l.setAlignmentX(JLabel.NORTH);
        imgpanel.add(l);
        imgpanel.setLocation(0,0);
        panel.setBackground(Color.decode("#F0C1C1"));
        f.add(panel);
        panel.setSize(400,70);
        panel.setLocation(50,400);
        //submit.setFocusable(false);
        int level = 1;
        for (int x = 0;x<16;x++)
        {
            b[x]  = new JToggleButton("");
            panel.setVisible(true);
            panel.add(b[x]);
            b[x].addActionListener(this);
        }

        score_lab = new JLabel("Score: " + score_new);
        score_lab.setBounds(90,675,100,20);
        score_lab.setVisible(true);
        t1 = new JTextField();
        t1.setBounds(50,350,100,20);
        t1.setBorder(BorderFactory.createLineBorder(Color.red));
        t1.addActionListener(this);
        hint = new JButton("Hint");
        hint.setBounds(50, 600, 300,20);
        hint.addActionListener(this);

        submit = new JButton("Submit");
        submit.setBounds(500, 600, 150, 20);
        submit.addActionListener(this);

        clear = new JButton("Clear"); // Initialize clear button
        clear.setBounds(350, 600, 100, 20); // Set clear button bounds
        clear.addActionListener(this);

        f.add(t1);
        f.add(score_lab);
        f.add(hint);
        f.add(submit);
        f.add(clear);

        f.setSize(800, 800);
        f.setLayout(null);
        f.setVisible(true);
        t1.setEditable(false);
        //lives_lab.setText("Lives: ♡ ♡ ♡");
        //lives_lab.setForeground(Color.RED);
        lives_lab.setBounds(90, 650, 100, 20);
        lives_lab.setVisible(true);
        f.getContentPane().setBackground( Color.decode("#F0CDC1" ));
        f.add(lives_lab);

        loadLevel();
    }
    //    public void paint(Graphics g)
//    {
//        g.setFont(new Font(null, 1, 30));
//        g.setColor(Color.RED);
//        g.drawString(s,100,100);
//    }
    public void loadLevel() {

        clearall();

        answer = ""; // Reset answer
        t1.setText(""); // Clear text field
        for (int x = 0; x < 16; x++) {
            b[x].setText(levels[x]);
            b[x].setSelected(false);
            b[x].setEnabled(true);
        }
        l.setIcon(new ImageIcon(icon1.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
        l.setAlignmentX(JLabel.NORTH);
//        if(level == 1){
//            l.setIcon(new ImageIcon(icon1.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
//            l.setAlignmentX(JLabel.NORTH);
//        }
//        if (level == 2) {
//            l.setIcon(new ImageIcon(icon3.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
//            //l.setAlignmentX(JLabel.NORTH);
//            //lives=3;
//            imgpanel.repaint();
//            f.repaint();
//        }
    }
    public void updateScoreLabel() {
        score_lab.setText("Score: " + score_new);
    }

    public void clearall()
    {
        t1.setText("");
        answer = "";
        for (int x = 0; x < 16; x++) {
            //b[x].setEnabled(true);
            b[x].setSelected(false);
            b[x].setEnabled(true);
        }
    }
    public void actionPerformed(ActionEvent e) {

        for (int x = 0;x<16;x++)
        {
            if(e.getSource()==b[x])
            {
                if (b[x].isSelected()) {
                    answer += b[x].getText();
                    t1.setText(answer);
                    //b1.setLocation(50, 50);
                    //b[x].setEnabled(false);
                } else {
                    answer = answer.replaceFirst(b[x].getText(),"");
                    t1.setText(answer);
                    //b[x].setEnabled(true);
                    //b1.setLocation(50, 50);
                }
//                if(t1.getText().equals(ans))
//                {
//                    if(sel)
//                   {
//
//                        score += 50;
//                        updateScoreLabel();
//                        JOptionPane.showMessageDialog(f,"You passed but with hint");
//                    }
//                    else
//                    {
//                        score += 100;
//                        updateScoreLabel();
//                        JOptionPane.showMessageDialog(f,"You passed and scored 100 points");
//                    }
//                }
            }
        }
        if (e.getSource() == clear) {
//            t1.setText("");
//            answer = "";
//            for (int x = 0; x < 16; x++) {
//                //b[x].setEnabled(true);
//                b[x].setSelected(false);
//                b[x].setEnabled(true);
//            }
            clearall();
        }

        if (e.getSource() == hint) {
            f.remove(imgpanel);
            imgpanel.remove(l);
            l.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
            l.setAlignmentX(JLabel.NORTH);
            imgpanel.add(l);
            imgpanel.repaint();
            f.add(imgpanel);
            f.repaint();
            sel = true;
            hint.setEnabled(false);
        }

        if (e.getSource() == submit) { // clicked submit?
            if (t1.getText().equalsIgnoreCase(ans)) {

                if(sel)
                {

                    score_new += 50;
                    updateScoreLabel();
                    JOptionPane.showMessageDialog(f,"You passed but with hint");
                }
                else
                {
                    score_new += 100;
                    updateScoreLabel();
                    JOptionPane.showMessageDialog(f,"You passed and scored 100 points");
                }
                ActionListenerExample.score = score_new;
                clearWinLevels(b_check);
                b_check.setEnabled(false);
                JOptionPane.showMessageDialog(f, "Correct Answer! Proceeding to next level.");
                f.dispose();
//                level++; // Move to the next level
//                if (level > levels.length) {
//                    JOptionPane.showMessageDialog(f, "Congratulations! You've completed all levels.");
//                    // Handle game completion
//                } else {
//                    loadLevel(level); // Load the next level
//                }

            } else {

                lives--;
//                    s="";
//                    for (int x = 0;x<lives;x++)
//                    {
//                        s+="♡ ";
//                    }
//                    lives_lab.setText("Lives : "+s );
//                    lives_lab.setForeground(Color.RED);
                if(lives==1)
                {
                    lives_lab.setText("<html>Lives: <font color='red'>♡</font></html>");
                }
                if(lives==2)
                {
                    lives_lab.setText("<html>Lives: <font color='red'>♡ ♡</font></html>");
                }
                if (lives == 0) {
                    lives_lab.setText("Lives : "+ 0 );
                    lives_lab.setForeground(Color.RED);
                    JOptionPane.showMessageDialog(f, "Game Over:(");
                    System.exit(0);


                }
                clearall();

                JOptionPane.showMessageDialog(f, "Wrong Answer! Try again.");}
        }

        //t1.setText(""); // to clear everything
    }
    public void clearWinLevels(JButton but)
    {
        if (but == ActionListenerExample.easy_b[0])
            ActionListenerExample.button_check[0] =1;
        else if (but == ActionListenerExample.easy_b[1])
            ActionListenerExample.button_check[1] =1;
        else if (but == ActionListenerExample.easy_b[2])
            ActionListenerExample.button_check[2] =1;
        else if (but == ActionListenerExample.easy_b[3])
            ActionListenerExample.button_check[3] =1;
        else if (but == ActionListenerExample.easy_b[4])
            ActionListenerExample.button_check[4] =1;
        else if (but == ActionListenerExample.medium_b[0])
            ActionListenerExample.button_check[5] =1;
        else if (but == ActionListenerExample.medium_b[1])
            ActionListenerExample.button_check[6] =1;
        else if (but == ActionListenerExample.medium_b[2])
            ActionListenerExample.button_check[7] =1;
        else if (but == ActionListenerExample.medium_b[3])
            ActionListenerExample.button_check[8] =1;
        else if (but == ActionListenerExample.medium_b[4])
            ActionListenerExample.button_check[9] =1;
        else if (but == ActionListenerExample.hard_b[0])
            ActionListenerExample.button_check[10] =1;
        else if (but == ActionListenerExample.hard_b[1])
            ActionListenerExample.button_check[11] =1;
        else if (but == ActionListenerExample.hard_b[2])
            ActionListenerExample.button_check[12] =1;
        else if (but == ActionListenerExample.hard_b[3])
            ActionListenerExample.button_check[13] =1;
        else if (but == ActionListenerExample.hard_b[4])
            ActionListenerExample.button_check[14] =1;
    }


    public static void main(String[] args) {
        proj_new instance = new proj_new();
        instance.actionPerformedCheck();
        instance.level();
        System.out.println("Hello Wold");
    }
}

