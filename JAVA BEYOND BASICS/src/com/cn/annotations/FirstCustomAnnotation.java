package com.cn.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)          //retain till runtime
@Target(ElementType.TYPE)						
@Inherited                                   //this will inherit the annotation in all subclasses 
public @interface FirstCustomAnnotation {
 String author_name();
 String bookType();
}
