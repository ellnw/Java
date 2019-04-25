package Mons;

import javax.swing.*;

import Gui.Name;
import Gui.Status;
import Main.Novice;
import Main.NoviceGui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Monster extends JPanel {

    ArrayList<String > nameMons = new ArrayList<String>();
    private JTextField sizeBox;
    private String name;
    Status sta = new Status();
    JButton btn1detail;
    JButton btn2detail;
    JButton btn3detail;
    JButton btn4detail;
    JPanel left = new JPanel();
    JPanel right = new JPanel();
    JPanel center = new JPanel();
    JPanel top = new JPanel();
    JPanel bottom = new JPanel();

    Novice novice = new Novice();



    public Monster(Novice novice){
        nameMons.add("Killbill");
        nameMons.add("Grakk");
        nameMons.add("Jjja");
        nameMons.add("Horn");
        this.novice = novice;

        // this section performs and displays the shuffle operation
        Collections.shuffle(nameMons);
        System.out.println("Results after shuffle operation:");
        for(String str: nameMons)
        {
            System.out.println(str);
        }

        System.out.println(nameMons);


        JList<String> list = new JList<>(nameMons.toArray(new String[0]));

        JScrollPane scrollPane = new JScrollPane(list);
        add(scrollPane, BorderLayout.CENTER);
//end message
         sizeBox();

// create border layout and populate
        setLayout(new BorderLayout(5,5));
        add(left, BorderLayout.WEST);
        add(right, BorderLayout.EAST);
        add(center, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);

// place series of grid layouts inside the border layout components
        left.setLayout(new GridLayout(4,1));
        right.setLayout(new GridLayout(5,2));

        center.setLayout(new BorderLayout(5,5));
        center.add(list,BorderLayout.CENTER);
        center.add(top,BorderLayout.NORTH);

        top.setLayout(new GridLayout(1,2,5,5));
        bottom.setLayout(new GridLayout(1,2,5,5));
        bottom.add(sizeBox);

        selectMons();
    }


    public void selectMons(){
        ActionListener westListener = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                switch ( e.getActionCommand() )
                {
                    case "Killbill":
                        int killbill = JOptionPane.showConfirmDialog(null, "Name: Killbill\n" + "HP: " + sta.gethpKillbill() +
                                "\nSP: " + sta.getSpKillbill() + "\nLevel: " + sta.getLevelKillbill(), "Killbill", JOptionPane.YES_NO_OPTION);

                        if (killbill == 0) { //The ISSUE is here
                           novice.attackKillbill();
                            NoviceGui m = new NoviceGui(novice,"");
                            m.load(m);
                            JFrame current = (JFrame) SwingUtilities.getWindowAncestor(sizeBox);
                            current.dispose();
                        } else {
                            System.out.print("Exit");
                        }
                        break;

                    case "Grakk":
                        int grakk = JOptionPane.showConfirmDialog(null, "Name: Grakk\n" + "HP: " + sta.gethpGrakk() +
                                "\nSP: " + sta.getSpGrakk() + "\nLevel: " + sta.getLevelGrakk(), "Grakk", JOptionPane.YES_NO_OPTION);

                        if (grakk == 0) { //The ISSUE is here
                            novice.attackGrakk();
                            NoviceGui m = new NoviceGui(novice,"");
                            m.load(m);
                            JFrame current = (JFrame) SwingUtilities.getWindowAncestor(sizeBox);
                            current.dispose();

                        } else {
                            System.out.print("Exit");
                        }
                        break;

                    case "Jjja":
                        int jjja = JOptionPane.showConfirmDialog(null, "Name: Jjja\n" + "HP: " + sta.gethpJjja() +
                                "\nSP: " + sta.getSpJjja() + "\nLevel: " + sta.getLevelJjja(), "Jjja", JOptionPane.YES_NO_OPTION);

                        if (jjja == 0) { //The ISSUE is here
                            novice.attackJjja();
                            NoviceGui m = new NoviceGui(novice,"");
                            m.load(m);
                            JFrame current = (JFrame) SwingUtilities.getWindowAncestor(sizeBox);
                            current.dispose();
                        } else {
                            System.out.print("Exit");
                        }
                        break;

                    case "Horn":
                        int horn = JOptionPane.showConfirmDialog(null, "Name: Horn\n" + "HP: " + sta.gethpHorn() +
                                "\nSP: " + sta.getSpHorn() + "\nLevel: " + sta.getLevelHorn(), "Horn", JOptionPane.YES_NO_OPTION);

                        if (horn == 0) { //The ISSUE is here
                            novice.attackHorn();
                            NoviceGui m = new NoviceGui(novice,"");
                            m.load(m);
                            JFrame current = (JFrame) SwingUtilities.getWindowAncestor(sizeBox);
                            current.dispose();
                        } else {
                            System.out.print("Exit");
                        }
                        break;
                }
            }
        };

        ButtonGroup westGroup = new ButtonGroup();
        btn1detail = new JButton("Killbill");
        westGroup.add(btn1detail);
        btn1detail.addActionListener(westListener);

        btn2detail = new JButton("Grakk");
        westGroup.add(btn2detail);
        btn2detail.addActionListener(westListener);

        btn3detail = new JButton("Jjja");
        westGroup.add(btn3detail);
        btn3detail.addActionListener(westListener);

        btn4detail = new JButton("Horn");
        westGroup.add(btn4detail);
        btn4detail.addActionListener(westListener);


        right.add(btn1detail);
        right.add(btn2detail);
        right.add(btn3detail);
        right.add(btn4detail);

    }




    public void sizeBox(){
        sizeBox = new JTextField("All Monster = " + nameMons.size() , JTextField.CENTER);
        sizeBox.setEditable(false);  // ensures that the list text cannot be edited in the panel
        sizeBox.setOpaque(true);
        sizeBox.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        sizeBox.setFont(new Font("Serif", Font.BOLD, 14));
    }



    public void load(){
        JFrame frame = new JFrame("MonsterList");
        Monster content  = new Monster(novice);
        frame.setContentPane(content);
        frame.pack();
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,300);
        frame.setLocation(75,50);
        frame.setVisible(true);
    }

    public void attackMonster(){
        System.out.println("Monster around you");
        System.out.println("Select attack Monster: [1]  [2]  [3]  [4]");
    }

//    public static void main(String[] args){
//        Monster loads = new Monster();
//        loads.load();
//
//
//    }



}
