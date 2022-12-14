package Assignments;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.Color;
import java.awt.FlowLayout;

class MyFramer extends JFrame implements ActionListener {
    JButton button;

    MyFramer() {
        super.setTitle("My Colors");

        button = new JButton("COLOR");
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(button);
        getContentPane().setBackground(Color.RED);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            Color background = getContentPane().getBackground();
            if (background.equals(Color.RED)) {
                getContentPane().setBackground(Color.GREEN);
            } else if (background.equals(Color.GREEN)) {
                getContentPane().setBackground(Color.BLUE);
            } else if (background.equals(Color.BLUE)) {
                getContentPane().setBackground(Color.GRAY);
            } else if (background.equals(Color.GRAY)) {
                getContentPane().setBackground(Color.RED);
            } else {
                getContentPane().setBackground(Color.RED);
            }
        }
    }
}
public class ColorCycle_59 {
    public static void main(String[] args) {
        MyFramer frame;
        frame = new MyFramer();
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}

