package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Laptop lenovo = context.getBean("lenovo", Laptop.class); //Object Lenovo
        Laptop gigabyte = context.getBean("gigabyte", Laptop.class); // Object Gigabyte
        Laptop asus = context.getBean("asus", Laptop.class); // Object Asus

        System.out.println("Laptop name: " + lenovo.getName() + ". Video Card: " + lenovo.getVideoCard().getName()); // Lenovo details
        System.out.println("Laptop name: " + gigabyte.getName() + ". Video Card: " + gigabyte.getVideoCard().getName()); // Gigabyte details
        System.out.println("Laptop name: " + asus.getName() + ". Video Card: " + asus.getVideoCard().getName()); //Asus details
    }
}