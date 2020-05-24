package param.pam;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        String peselString = new String();
        System.out.println("podaj pesel: ");
        peselString = scanner.nextLine();
        Set<ConstraintViolation<String>> violations = validator.validate(peselString);
        scanner.close();

    }
}
