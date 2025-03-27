package DesignPatterns.Factory.ShapeFactory;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape: ");
        String shape1 = sc.nextLine();
        Shape sh1 = ShapeFactory.getShape(shape1);

        System.out.println("Enter another shape: ");
        String shape2 = sc.nextLine();
        Shape sh2 = ShapeFactory.getShape(shape2);

        sh1.draw();
        sh2.draw();
    }
}
