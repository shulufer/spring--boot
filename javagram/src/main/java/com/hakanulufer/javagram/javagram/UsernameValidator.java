package com.hakanulufer.javagram.javagram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UsernameValidator implements ConstraintValidator<Username, String> {

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    Pattern pattern = Pattern.compile("[^a-z0-9 ]");
  Matcher matcher = pattern.matcher(value);
  boolean badCharacters = !matcher.find();
  return badCharacters;
  }

}
