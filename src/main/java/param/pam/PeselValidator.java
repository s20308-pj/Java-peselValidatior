package param.pam;

public class PeselValidator {
    static boolean control(String pesel) {
        int suma = 0;
        int[] test = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};
        for (int i = 0; i < 11; i++) {
            suma += (test[i] * pesel.codePointAt(i));
            System.out.println(suma);
        }
        if (suma % 10 == 0) {
            return true;
        } else {
            return false;
        }

    }

}
