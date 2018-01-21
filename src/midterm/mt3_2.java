package midterm;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Scanner;

public class mt3_2 {
    static BufferedReader input = new BufferedReader
            (new InputStreamReader(System.in));
    static Scanner num = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String id = getID();
        String name = getName();
        float sl = getSalary();
        float ot = getOverTime();
        showDataInfo(id, name, sl, ot);
    }//main

    private static void showDataInfo(String id, String name, float sl, float ot) {
        System.out.println("--------------------------");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + sl + " Baht");
        System.out.println("OverTime : " + ot + " Baht");
        System.out.println("Taxable :" + earningsAndTaxes(sl, ot)+" %");
    }//showDataInfo

    private static String getID() throws IOException {
        System.out.print("Enter your ID: ");
        String id = input.readLine();
        return id;
    }//getID

    public static String getName() throws IOException {
        System.out.print("Enter your name: ");
        String name = input.readLine();
        return name;
    }//getName

    public static float getSalary() {
        System.out.print("Enter your Salary: ");
        float salary = num.nextFloat();
        return salary;
    }//getSalary

    public static float getOverTime() {
        System.out.print("Enter your Over Time: ");
        float overTime = num.nextFloat();
        return overTime;
    }//getOverTime

    private static int earningsAndTaxes(float i, float m) {
        float earnings = m + i;
        System.out.println("Income : " + earnings + " Baht");
        if (earnings >= 100000) {
            return 10;
        } else if (earnings >= 70000) {
            return 7;
        } else if (earnings>= 50000) {
            return 5;
        } else if (earnings >= 30000) {
            return 3;
        } else {
            return 1;
        }
    }//incomeAndTaxes
}//class