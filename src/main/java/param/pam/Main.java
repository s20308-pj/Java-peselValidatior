package param.pam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String peselString = new String();
        System.out.println("podaj pesel: ");
        Scanner scanner = new Scanner(System.in);
        peselString = scanner.nextLine();
        if (PeselValidator.control(peselString)){
            System.out.println("pesel prawidłowy");
        } else {
            System.out.println("pesel bledny");
        };

    }
}
