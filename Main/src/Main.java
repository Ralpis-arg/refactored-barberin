import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // we have to get the Client attributes first

        Scanner scanner = new Scanner(System.in);

        String name = "";
        String surName = "";
        String phoneNumber = "";

        System.out.println("Please, enter your name: ");
        name = scanner.nextLine();

        System.out.println("Enter your surname");
        surName = scanner.nextLine();

        System.out.println("Enter your phone number so we can contact you");
        phoneNumber = scanner.nextLine();


        //Client client = new Client(name, surName, phoneNumber);





        scanner.close();
        
    }
}
