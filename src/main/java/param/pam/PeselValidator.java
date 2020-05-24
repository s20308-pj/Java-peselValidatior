package param.pam;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PeselValidator implements ConstraintValidator<Pesel, String> {



    @Override
    public boolean isValid(String pesel, ConstraintValidatorContext constraintValidatorContext) {
        int suma;
        final int PESEL_LENGHT = 11;
        suma = 0;
        final int[] TEST_NUMBER = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};
        for (int i = 0; i < 11; i++) {
            suma += (TEST_NUMBER[i] * pesel.charAt(i));
            System.out.println(suma);
        }
        return suma%10==0 && PESEL_LENGHT == pesel.length();
    }
}
