package com.suvrat.validator;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.suvrat.User;
import com.suvrat.database.getUserFromDB;

public class IsUniqueForUserAndEmailValidator implements ConstraintValidator<IsUniqueForUserAndEmail, String> {

	private String field_name;

	public void initialize(IsUniqueForUserAndEmail annotation_arg0) {
		// TODO Auto-generated method stub
		field_name = annotation_arg0.value();
	}

	public boolean isValid(String ValueByUser, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub

		List<User> u = getUserFromDB.name(ValueByUser, field_name);

		if (u.size() == 0) {
			return true;
		}

		return false;
	}

}
