import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

class mara extends JFrame implements ActionListener{
    JButton button1,button2;
    mara() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);

        button1 = new JButton("Red");
        button1.addActionListener(this);
        button2 = new JButton("Green");
        button2.addActionListener(this);


        this.add(button1);
        this.add(button2);
        this.setVisible(true);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button1){
                this.getContentPane().setBackground(Color.red);
            }
            if(e.getSource() == button2){
                this.getContentPane().setBackground(Color.green);
            }
    }
}

public class Main{

    public static void main(String[] args){
        new mara();
    }

}
