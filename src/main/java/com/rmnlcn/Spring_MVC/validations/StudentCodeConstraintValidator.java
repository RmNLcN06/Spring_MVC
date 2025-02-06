package com.rmnlcn.Spring_MVC.validations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StudentCodeConstraintValidator implements ConstraintValidator<StudentCode, String> {

    private String studentPrefix;

    @Override
    public void initialize(StudentCode theStudentCode) {
        studentPrefix = theStudentCode.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {

        boolean result = theCode.startsWith(studentPrefix);
        return result;
    }
}
