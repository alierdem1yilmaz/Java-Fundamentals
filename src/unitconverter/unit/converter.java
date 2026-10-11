package unitconverter.unit;
import java.util.Scanner;
public class converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value you want to convert: ");
        double value = in.nextDouble();
        in.nextLine();               // consumes the leftover "\n"
        System.out.println("Enter the unit you want to convert from (e.g., m, cm): ");
        String fromUnit = in.nextLine();

        System.out.println("Enter the unit you want to convert to (e.g., m, cm): ");
        String toUnit = in.nextLine();
        if (fromUnit.equals("m") && toUnit.equals("cm")) {
            double result = value * 100;
            System.out.println(value + " " + fromUnit + " is equal to " + result + " " + toUnit);
        } else if (fromUnit.equals("cm") && toUnit.equals("m")) {
            double result = value / 100;
            System.out.println(value + " " + fromUnit + " is equal to " + result + " " + toUnit);
        } else if (fromUnit.equals("km") && toUnit.equals("miles")) {
            double result = value * 0.621371;
            System.out.println(value + " " + fromUnit + " is equal to " + result + " " + toUnit);
        } else if (fromUnit.equals("miles") && toUnit.equals("km")) {
            double result = value * 1.609344;
            System.out.println(value + " " + fromUnit + " is equal to " + result + " " + toUnit);
        } else if (fromUnit.equals("RPM") && toUnit.equals("m/s")) {
            System.out.println("What is the diameter of the wheel? ");
            double diameter = in.nextDouble();
            double result = (value * 2 * 3.14 * diameter) / 60;
            System.out.println(value + " " + fromUnit  + " with its wheel diameter " + diameter + " cm " + " is equal to " + result + " " + toUnit);
        } else if (fromUnit.equals("m/s") && toUnit.equals("RPM")) {
            System.out.println("What is the diameter of the wheel? ");
            double diameter = in.nextDouble();
            double result = (value * 60) / (2 * 3.14 * diameter);
            System.out.println(value + " " + fromUnit + " is equal to " + result + " " + toUnit);
        } else {
            System.out.print("Sorry, I cannot convert from " + fromUnit + " to " + toUnit);
        }
        in.close();
        
    }
}
