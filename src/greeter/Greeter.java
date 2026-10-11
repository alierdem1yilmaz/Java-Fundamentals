package greeter;

import java.util.Scanner;
public class Greeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = in.nextLine();
        System.out.print("Your birth year: ");
        int birthYear = in.nextInt();
        int age = 2026 - birthYear;
        System.out.println("Hello, " + name + "! You are turning " + age + "this year.");

        if (age >= 18) {
            System.out.println("You are an adult, and you can vote.");
        } else {
            System.out.println("You are a minor, unfortunately you cannot vote.");
        }
        in.close();
    }
}