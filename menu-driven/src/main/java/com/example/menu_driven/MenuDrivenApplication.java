package com.example.menu_driven;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.menu_driven.Service.MathService;

@SpringBootApplication
public class MenuDrivenApplication implements CommandLineRunner {

    @Autowired
    private MathService mathService;

	public static void main(String[] args) {
		SpringApplication.run(MenuDrivenApplication.class, args);
	}

    @Override
    public void run(String... args) {
        int choice = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            while(choice != 4){
                System.out.println("Main Menu");
                System.out.println("1. Factorial");
                System.out.println("2. Fibonacci");
                System.out.println("3. Palindrome");
                System.out.println("4. Exit");
                System.out.println("Enter your choice: ");
                choice = scanner.nextInt();
                switch(choice){
                    case 1:
                        System.out.print("Enter the number : ");
                        int factNum = scanner.nextInt();
                        System.out.println(factNum + " of factorial = " + mathService.calculateFact(factNum));
                        break;
                    case 2:
                        System.out.print("Enter the number : ");
                        int fiboNum = scanner.nextInt();
                        System.out.println("Fibonacci : " + mathService.calculateFibo(fiboNum));
                        break;
                    case 3:
                        System.out.print("Enter the word: ");
                        String word = scanner.next();
                        System.out.println("Palindrome : " + mathService.isPalindrome(word));
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice! Please try again.");            
                }
            }
        }
        
    }

}
