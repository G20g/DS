package Annotations;


import java.lang.annotation.*;
import java.lang.reflect.*;

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface MyAnnotation{
        int value();
    }

    //Applying annotation  
    public class GettingAnnotations {
        @MyAnnotation(value=10)
        public void sayGettingAnnotations(){System.out.println("GettingAnnotations annotation");}
    }

    //Accessing annotation  
    class TestCustomAnnotation1{
        public static void main(String args[])throws Exception{

            GettingAnnotations h=new GettingAnnotations();
            Method m=h.getClass().getMethod("sayGettingAnnotations");

            MyAnnotation manno=m.getAnnotation(MyAnnotation.class);
            System.out.println("value is: "+manno.value());
        }}
