package com.example.javaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pooja on 18/9/17.
 */
class MenuDemo implements ActionListener {
    JFrame f;
    JMenuBar mb;
    JMenu mn,mn1,mn2;
    JMenuItem i1, i2, i3,i4,i5,i6,i7,i8;
    JButton bt;
    JTextField tf;
    JTextArea ta;

    void menuFile() {
        f = new JFrame("MenuDemo");

        mb = new JMenuBar();
        mn = new JMenu("File");
        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Exit");
        mn.add(i1);
        mn.add(i2);
        mn.add(i3);
        mn1=new JMenu("SubMenu");
        i4=new JMenuItem("Item1");
        i5=new JMenuItem("Item2");
        mn1.add(i4);
        mn1.add(i5);
        mn.add(mn1);
        mb.add(mn);

//        f.setJMenuBar(mb);
//        f.setSize( 500, 500);
//        f.setLayout(null);
//        f.setVisible(true);


    }
    void menuEdit() {
        mn2=new JMenu("Edit");
        i6=new JMenuItem("Cut");
        i7=new JMenuItem("Copy");
        i8=new JMenuItem("Paste");
        mn2.add(i6);
        mn2.add(i7);
        mn2.add(i8);
        mb.add(mn);
        mb.add(mn2);


        ta=new JTextArea();
        ta.setBounds(150,50,200,100);
        f.add(ta);
        i6.addActionListener(this);
        i7.addActionListener(this);
        i8.addActionListener(this);
        f.setJMenuBar(mb);
        f.setSize( 500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    void buttonDemo()
    {
        bt=new JButton("Click");
        bt.setBounds(200,200,80,35);
        f.add(bt);

        tf=new JTextField();
        tf.setBounds(100,100,150,20);
        f.add(tf);

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome To javaSwing");
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==i6)
            ta.cut();
        if (e.getSource()==i8)
            ta.paste();
        if (e.getSource()==i7)
            ta.copy();
    }
}

public class SwingDemo {
    public static void main(String[] args) {
        MenuDemo m = new MenuDemo();
        m.menuFile();
        m.menuEdit();
//        ButtonDemo b=new ButtonDemo();
//        m.buttonDemo();
    }

}
