package Main;


import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.GridLayout;

public class TestBox extends JFrame {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                TestBox frame = new TestBox();
                frame.setVisible(true);
            }
        });
    }

    /**
     * Create the frame.
     */
    public TestBox() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 541, 334);
        setTitle("ThaiCreate.Com GUI Tutorial");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,3)); // GridLayout(rows, cols, hgap, vgap)

        panel.add(new JButton("Button 1"));
        panel.add(new JLabel("Label 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JLabel("Label 2"));

        getContentPane().add(panel);

    }


}
