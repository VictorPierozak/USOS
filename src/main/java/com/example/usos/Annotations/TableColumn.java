package com.example.usos.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TableColumn {
    public String columnName() default  "";
    public int columnNum() default 0;
}
