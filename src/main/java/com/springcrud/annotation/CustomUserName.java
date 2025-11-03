package com.springcrud.annotation;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.lang.annotation.*;
import java.lang.reflect.Field;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@NotBlank
@Min(5)@Max(15)
public @interface CustomUserName {
    String message() default "Длина имени пользователя должна быть от 5 до 15 символов!";
}
