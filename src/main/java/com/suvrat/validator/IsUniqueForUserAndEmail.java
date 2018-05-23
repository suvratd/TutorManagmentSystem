package com.suvrat.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = IsUniqueForUserAndEmailValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface IsUniqueForUserAndEmail {

	// DEFAULT COURSE
	public String value() default "user_name";

	// DEFAULT MSG
	public String message() default "User Name Already Exist";

	
	//DEFAULT
	public Class<?>[] groups() default {};
	public Class<? extends Payload>[] payload() default{};
	
	
}
