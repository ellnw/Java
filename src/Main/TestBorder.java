package Main;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.*;
import java.awt.BorderLayout;

public class TestBorder extends JFrame {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                TestBorder frame = new TestBorder();
                frame.setVisible(true);
            }
        });
    }

    /**
     * Create the frame.
     */
    public TestBorder() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setTitle("ThaiCreate.Com GUI Tutorial");

        getContentPane().setLayout(new BorderLayout(0, 0));

        JLabel name = new JLabel("Name ");
        getContentPane().add(name, BorderLayout.PAGE_START);

        JLabel hp = new JLabel("HP: ");
        getContentPane().add(hp, BorderLayout.CENTER);

        JLabel sp = new JLabel("SP ");
        getContentPane().add(sp, BorderLayout.PAGE_START);



//        button = new JButton("Button 2 (CENTER)");
//        button.setPreferredSize(new Dimension(200, 100));
//        getContentPane().add(button, BorderLayout.CENTER);
//
//        button = new JButton("Button 3 (LINE_START)");
//        getContentPane().add(button, BorderLayout.LINE_START);
//
//        button = new JButton("Long-Named Button 4 (PAGE_END)");
//        getContentPane().add(button, BorderLayout.PAGE_END);
//
//        button = new JButton("5 (LINE_END)");
//        getContentPane().add(button, BorderLayout.LINE_END);


    }
}







