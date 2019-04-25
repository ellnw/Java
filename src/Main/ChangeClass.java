package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeClass {

    private JPanel chClass;
    private JButton priestClass;
    private JButton wizardClass;
    private JLabel text;
    private Novice nov = new Novice();


    public ChangeClass(Novice novice){
        chClass = new JPanel();
        priestClass = new JButton();
        wizardClass = new JButton();
        text = new JLabel();
        nov = novice;

        chClass.setLayout(new GridLayout(3,2));
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setFont(new Font("",0,50));
        text.setText("Select Class");
        priestClass.setText("Priest");
        wizardClass.setText("Wizard");

        chClass.add(text);
        chClass.add(priestClass);
        chClass.add(wizardClass);

        priestClass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String clasname = priestClass.getText();
                nov.clas = clasname;
                NoviceGui ne = new NoviceGui(nov," ");
                ne.load(ne);
                JFrame current = (JFrame) SwingUtilities.getWindowAncestor(chClass);
                current.dispose();
            }
        });

        wizardClass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String clasname = wizardClass.getText();
                nov.clas = clasname;
                NoviceGui ne = new NoviceGui(nov," ");
                ne.load(ne);
                JFrame current = (JFrame) SwingUtilities.getWindowAncestor(chClass);
                current.dispose();
            }
        });


    }

    public void load(ChangeClass ch){
        JFrame frame = new JFrame("Changeclass");
        frame.setContentPane(ch.chClass);
        frame.pack();
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        frame.setLocation(5,5);
        frame.setVisible(true);

    }



}
