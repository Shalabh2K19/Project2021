import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MySweetProgram {

    public static void main(String[] args) throws FileNotFoundException //method
    {
        /*
        System.out.println("Hello World");
        Scanner in = new Scanner (System.in);
        */

        Scanner in = new Scanner (new File("students.txt"));

        while(in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
        /*
         String s = in.nextLine();
        System.out.println(s);
        */

        in.close();
    }
}


//class