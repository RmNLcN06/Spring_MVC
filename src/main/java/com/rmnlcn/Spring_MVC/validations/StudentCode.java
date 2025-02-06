package com.rmnlcn.Spring_MVC.validations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = StudentCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface StudentCode {

    // define default student code
    public String value() default "STUD";

    // define default error message
    public String message() default "must start with STUD";

    // define default groups can group related constraints
    public Class<?>[] groups() default {};

    // define default payloads : provide custom details about validation failure (severity level, error code, etc)
    public Class<? extends Payload>[] payload() default {};
}
