package lab;
import java.util.Scanner;

public class PrimitiveDatatype {
    public static void main(String[] args) {
        System.out.println("Primitive Datatypes");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the bytes:");
        byte bytes = sc.nextByte();

        System.out.println("Enter the shorts:");
        short shorts = sc.nextShort();

        System.out.println("Enter the integer:");
        int integer = sc.nextInt();

        System.out.println("Enter the long value:");
        long longValue = sc.nextLong();

        System.out.println("Enter the float value:");
        float floatValue = sc.nextFloat();

        System.out.println("Enter the double value:");
        double doubleValue = sc.nextDouble();

        System.out.println("Enter the char:");
        char character = sc.next().charAt(0);

        System.out.println("Enter the boolean:");
        boolean boolValue = sc.nextBoolean();

        // Display the entered values
        System.out.println("Bytes: " + bytes);
        System.out.println("Shorts: " + shorts);
        System.out.println("Integer: " + integer);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Char: " + character);
        System.out.println("Boolean: " + boolValue);
    }
}
