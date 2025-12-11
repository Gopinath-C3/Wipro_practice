// Write a program that takes input from the user and creates an object of a class named 'Person'. The 'Person' class should have two member variables: 'name' and 'age'. The program should prompt the user to enter their name and age, create a 'Person' object with the entered values, and then display the name and age of the person.


import java.util.Scanner;

public class Person {
    // Define the 'Person' class with 'name' and 'age' attributes
    String name;
    int age;

    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read input values
        String name = sc.nextLine();
        int age = sc.nextInt();

        // Create Person object
        Person p = new Person();
        p.name = name;
        p.age = age;

        // Display output
        System.out.println("Name: " + p.name);
        System.out.println("Age: " + p.age);

        sc.close();
}
}