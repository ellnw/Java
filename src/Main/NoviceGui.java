package Main;

import Mons.Monster;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class NoviceGui extends JFrame {
    private JPanel Name;
    private JLabel showName;
    private JLabel hp;
    private JLabel sp;
    private JLabel level;
    private JLabel weapon;
    private JLabel killMonster;
    private JLabel job;
    private  JButton monster;
    private JButton bag;
    private JButton clas;
    private JTextPane command;
    private Novice novice;
    private String name;
    Bag b = new Bag();





    public NoviceGui(Novice nov,String data){
        novice = nov;
        Name = new JPanel();
        name = data;
        showName = new JLabel();
        hp = new JLabel();
        sp = new JLabel();
        level = new JLabel();
        weapon = new JLabel();
        monster = new JButton();
        bag = new JButton();
        job = new JLabel();
        command = new JTextPane();
        killMonster = new JLabel();
        clas = new JButton();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 541, 334);
        Name.setLayout(new GridLayout(5,3));
        setTitle("MMORPG GAME");

        showName.setText("Name: "  + name);
        hp.setText("HP: " + novice.hp);
        sp.setText("SP: " + novice.sp);
        level.setText("LEVEL: " + novice.level);
        weapon.setText("WEAPON: Sword");
        monster.setText("Monster around you");
        clas.setText("Class");
        killMonster.setText("Kill Monster: " + novice.killMonster);
        bag.setText("Open Bag");
        job.setText("Job: " + novice.clas);

        Name.add(showName);
        Name.add(hp);
        Name.add(sp);
        Name.add(level);
        Name.add(weapon);
        Name.add(job);
        Name.add(killMonster);
        Name.add(monster);
        Name.add(bag);
        Name.add(clas);

        monster.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Monster m = new Monster(novice);
                m.load();
                JFrame current = (JFrame) SwingUtilities.getWindowAncestor(Name);
                current.dispose();


            }
        });


        bag.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b.loadBag();
            }
        });

        clas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(novice.level >=3){
                    ChangeClass chClass = new ChangeClass(novice);
                    chClass.load(chClass);
                    JFrame current = (JFrame) SwingUtilities.getWindowAncestor(Name);
                    current.dispose();
                }
                else
                    JOptionPane.showMessageDialog(null,"Level should than 5","Warning",JOptionPane.WARNING_MESSAGE);
            }
        });



    }



    public void load(NoviceGui loads){
        JFrame frame = new JFrame("start");
        frame.setContentPane(loads.Name);
        frame.pack();
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        frame.setLocation(5,5);
        frame.setVisible(true);

    }

//    public static void main(String[] args) {
//        Novice novice = new Novice();
//        NoviceGui loads = new NoviceGui(novice,"");
//        loads.load(loads);
//    }
}
