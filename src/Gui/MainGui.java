package Gui;




import Main.Novice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MainGui {
    private JPanel mainForm;
    private JButton Exit;
    private JButton Start;
    private JLabel welcome;
    private JFrame frame = new JFrame();




    public MainGui(){
        welcome.setFont(new Font(" ",0,75));
        Start.setFont(new Font("",0,30));
        Exit.setFont(new Font("",0,30));

        Start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Name a = new Name();
                a.load(a);
                JFrame current = (JFrame) SwingUtilities.getWindowAncestor(mainForm);
                current.dispose();
            }
        });
        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame current = (JFrame) SwingUtilities.getWindowAncestor(mainForm);
                current.dispose();
            }
        });

    }

    public void load(MainGui load){
        frame.setPreferredSize(new Dimension(600,350));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(load.mainForm);
        frame.pack();
        frame.setVisible(true);

    }


    public static void main(String[] args){
        MainGui loads = new MainGui();
        loads.load(loads);

    }
}


//        list1.addListSelectionListener(new ListSelectionListener() {
////            @Override
////            public void valueChanged(ListSelectionEvent e) {
////                String selected = (String) list1.getSelectedValue();
////                if (selected == "sdfsdf") {
////                    lis1.setText("Welcome");
////                }
////                else
////                    lis2.setText("Ellnw");
////            }
////        });

