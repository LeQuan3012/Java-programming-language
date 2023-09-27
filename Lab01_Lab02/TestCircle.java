
package com.mycompany.bai2_th1;


public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
        Circle c3 = new Circle(5.0);
        Circle c4 = new Circle(1.2);
        System.out.println(c3.toString());
        System.out.println(c4.toString()); // explicit call
        System.out.println(c4); // println() calls toString() implicitly, same as above
        System.out.println("Operator '+' invokes toString() too: " + c4); // '+' invokes toString() too

    }
}
