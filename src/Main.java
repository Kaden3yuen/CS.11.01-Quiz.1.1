import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Kaden
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your first name: ");
        String firstName = scanner.next();
        System.out.println("Enter your favourite food: ");
        String favouriteFood = scanner.next();
        scanner.close();
        System.out.println("First name: " + firstName);
        System.out.println("Your age : " + age);
        System.out.println("Favourite food : " + favouriteFood);







    }

}
