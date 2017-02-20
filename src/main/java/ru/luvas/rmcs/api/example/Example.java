package ru.luvas.rmcs.api.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Просто аннотация, чтобы IntelliJ IDEA не подсвечивала неиспользуемость классов.
 * Created by RINES on 20.02.17.
 */
@Retention(RetentionPolicy.SOURCE)
@Target(value = ElementType.TYPE)
public @interface Example {}
