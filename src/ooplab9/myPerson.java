package ooplab9;

public class myPerson {
    public static void main(String[] args) {
      Person person = new Person("Kannika Khanankhlai",22,
        new Adderss("20","Nakhornsithammarat",
              "20190"),
                new Job("Teacher",20000));
                System.out.println(person.toString());


    }//main
}//class
