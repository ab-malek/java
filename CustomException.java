
import javax.swing.*;
import java.awt.*;

// For outof range 2147483647

class negative extends Exception {
    negative(String e){
        super(e);
    }
}
public class Main{

    public static void main(String[] args){


        try{
            int a = -5;

            if(a<0){
                throw new negative("Number is negative");
            }

        }
        catch (negative e){
           System.out.println(e.getMessage());
           System.out.println("Malke");
        }
    }
}
