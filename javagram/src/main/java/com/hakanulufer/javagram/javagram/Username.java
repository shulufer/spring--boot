package com.hakanulufer.javagram.javagram;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy =  { UsernameValidator.class })
public @interface Username {

  String message() default "INVALID cHRACTER";
  Class<?>[] groups() default {};
  Class<? extends Payload>[] payload() default {};





}
