package com.anish.main;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.anish.model.User;

public class MainClass 
{

	public static void main(String[] args)
	{
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        
        //It validates bean instances
        Validator validator = factory.getValidator();
        User u=new User();
        
        Set<ConstraintViolation<User>> constraintViolations = validator.validate(u);
        
        //Show errors
        if (constraintViolations.size() > 0) {
            for (ConstraintViolation<User> violation : constraintViolations) {
                System.out.println(violation.getMessage());
            }
        } else {
            System.out.println("Valid Object");
        }
        	// TODO Auto-generated method stub
	}
}
