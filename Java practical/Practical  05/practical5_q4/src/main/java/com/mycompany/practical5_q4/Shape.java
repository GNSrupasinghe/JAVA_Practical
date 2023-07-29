
 
package com.mycompany.practical5_q4;



abstract class Shape {
    // Abstract method to calculate the area (must be implemented by subclasses)
    public abstract double calculateArea();

    // Non-abstract method to display the area
    public void display() {
        double area = calculateArea();
        System.out.println("The area of the shape is: " + area);
    }
}

