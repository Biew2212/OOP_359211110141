package ooplab3;
//0-49 = F
//50-59 = D
//60-69 = C
//70-79 = B
//80-100 = A

import java.util.Scanner;

public class CalGrade {

    public static void main(String[] args) {
 //   Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter youe score90 : ");
        int score = scanner.nextInt();
        // test condition
        if (score<=49)
            System.out.println("Your grage is F");
        else if (score<=59)
            System.out.println("Your grage is D");
        else if (score<=69)
            System.out.println("Your grage is C");
        else if (score<79)
            System.out.println("Your grage is B");
        else
            System.out.println("Your grage is A");




    }//main


}//class
