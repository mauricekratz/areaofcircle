import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();
        input.close();

        System.out.println("The area of a circle of " + radius + " is " + Circle.getArea(radius));
    }
}
