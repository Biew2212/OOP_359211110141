package midterm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mt3_1 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader stdin =new BufferedReader(new InputStreamReader(System.in));
        int age;
        int check;
        int b=1;
        String i;
        do
        {
            do {
                System.out.print("Enter Year" + b + ":");
                i = stdin.readLine();
                check = Integer.parseInt(i);
                age = 2561 - check;

                System.out.print("Age"+b+":" + age);
                System.out.println(" ");
                b++;
            }
            while (b <= 3);
        }
        while (b == 1);
        System.out.println("Thank your.");
    }//main
}//class