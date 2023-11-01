public class Main{

    public static void main(String[] args){


        try{
            int[] ar = new int[4];

            ar[4] = 5;

        }
        catch (ArrayIndexOutOfBoundsException e){
           System.out.println(e);
           System.out.println("Malke");
        }
    }
}
