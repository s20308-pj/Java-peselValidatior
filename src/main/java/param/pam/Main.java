package param.pam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String peselString = new String();
        System.out.println("podaj pesel: ");
        peselString = scanner.nextLine();
        scanner.close();
        if (11 == peselString.length() && PeselValidator.control(peselString)) {
            System.out.println("pesel prawidłowy");
        } else {
            System.out.println("pesel bledny");
        }

    }
}
