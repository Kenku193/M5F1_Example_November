package org.example;

import org.example.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class App {
    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(App.class, args);

//        Customer customer = context.getBean(CustomerService.class).get(1L);
//        System.out.println();
//        System.out.println("1 " + customer);
//
//        customer.setPassword("AnotherSomeNewPassword");
//        System.out.println("2 " + customer);
//
//        context.getBean(CustomerService.class).update(customer);
//
//        Customer updatedCustomer = context.getBean(CustomerService.class).get(1L);
//        System.out.println("3 " + updatedCustomer);

    }
}
