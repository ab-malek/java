

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mara extends JFrame implements ActionListener {

    JMenuBar menubar;
    JMenu file,edit,help;
    JMenuItem savefile,loadfile,exitfile;
    mara(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,500);
        this.setLayout(new FlowLayout());

        menubar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        menubar.add(file);
        menubar.add(edit);
        menubar.add(help);

        savefile = new JMenuItem("Save");
        loadfile = new JMenuItem("Load");
        exitfile = new JMenuItem("Exit");
        file.add(savefile);
        file.add(loadfile);
        file.add(exitfile);

        savefile.addActionListener(this);

        this.setJMenuBar(menubar);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == savefile){
            System.out.println("You saved a file");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        new mara();
    }
