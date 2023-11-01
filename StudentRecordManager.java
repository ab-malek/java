import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Helper{
    int id;
    String name;
    int[] marks;
    public Helper(int id,String name,int[] marks){
        System.out.println("ID " + id);
        System.out.println("Name "+name);
        System.out.println("Markd ");
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();

        System.out.println("Avereage :" + CalculateAverage(marks));

        System.out.println("Maximum numbres :"+maxi(marks));

        System.out.println("Minimum number :"+mini(marks));
    }


    public static double CalculateAverage(int[] marks){
        double age = 0;

        for(int i=0;i<marks.length;i++){
            age += marks[i];
        }

        age  = age/marks.length;

        return age;
    }

    public static int maxi(int[] marks){
        int mx = -4444;
        for (int mark : marks) {
            if (mark > mx) {
                mx = mark;
            }
        }

        return mx;
    }

    public static int mini(int[] marks){
        int mn = 100000;
        for(int mark : marks){
            if(mark<mn){
                mn = mark;
            }
        }

        return mn;
    }

}
