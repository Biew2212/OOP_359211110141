package ooplab9;

public class Car {
    private String brand;
    private String coloe;
    private Engine engine; // has-a relation
    //toString
    //constructor


    public Car(String brand, String coloe, Engine engine) {
        this.brand = brand;
        this.coloe = coloe;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", coloe='" + coloe + '\'' +
                ", engine=" + engine +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColoe() {
        return coloe;
    }

    public void setColoe(String coloe) {
        this.coloe = coloe;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}//class

