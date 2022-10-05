package no.data;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        Parrot parrot = new Parrot();
        System.out.println("Hello world!");
    }
}