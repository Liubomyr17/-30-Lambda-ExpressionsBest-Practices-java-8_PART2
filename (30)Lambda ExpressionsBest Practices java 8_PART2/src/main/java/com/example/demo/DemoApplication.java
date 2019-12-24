package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

//       Runnable r = new Runnable() {
//           @Override
//           public void run() {
//               System.out.println("My Task");
//           }
//       };

    Runnable r = () -> System.out.println("My Task");
    Thread thread = new Thread(r);
    thread.start();
    }
}
