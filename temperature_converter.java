

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mara extends JFrame implements ActionListener {

    JPanel p1,p2,p3;
    JLabel fl,cl;
    JTextField ctx,ftx;
    JButton bt;
    mara(){
        this.setSize(400,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3,1));

        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        fl = new JLabel("Enter ferenheight temprerature : ");
        ftx = new JTextField(10);
        p1.add(fl);
        p1.add(ftx);

        p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        cl = new JLabel("Temperature in celcius : ");
        ctx = new JTextField(10);
        p2.add(cl);
        p2.add(ctx);

        p3 = new JPanel();
        p3.setLayout(new FlowLayout());

        bt = new JButton("Convert");
        p3.add(bt);
        bt.addActionListener(this);

        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bt){
            double f = Double.parseDouble(ftx.getText());
            double c = ((f-32)*5)/9;
            ctx.setText(String.format("%.2f",c));
        }
    }
}


public class Main {
    public static void main(String[] args) {
        new mara();
    }
}
