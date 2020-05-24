package param.pam;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = PeselValidator.class)

public @interface Pesel {
    public String somePesel() default "";
    String message() default "Invalid pesel";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
