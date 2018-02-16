package ooplab9;



public class Person {
    private String name;
    private int age;
    private Adderss adderss;
    private Job job;

    public Person(String name, int age, Adderss nakhornsithammarat, Job teacher) {
        this.name = name;
        this.age = age;
        this.adderss = adderss;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adderss=" + adderss +
                ", job=" + job +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adderss getAdderss() {
        return adderss;
    }

    public void setAdderss(Adderss adderss) {
        this.adderss = adderss;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}//class
