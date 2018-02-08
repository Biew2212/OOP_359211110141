package ooplab8;

import javafx.scene.shape.Shape;

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

   // @Override
    public double findArea() {
        return 3.14*(r*r);
    }
}//class