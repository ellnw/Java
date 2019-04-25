package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Main.Novice;
import Main.NoviceGui;

public class Name {

    private JPanel NamePanel;
    private JButton startButton;
    private JTextField add;


    public Name() {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (add.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter Your Name", "Name", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    String dok = add.getText();
                    Novice nov = new Novice();
                    NoviceGui n = new NoviceGui(nov,dok);
                    n.load(n);
                    JFrame current = (JFrame) SwingUtilities.getWindowAncestor(NamePanel);
                    current.dispose();
                }
            }
        });
    }

    public void load(Name ui){
        JFrame frame = new JFrame("Name");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(ui.NamePanel);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);

    }



}
