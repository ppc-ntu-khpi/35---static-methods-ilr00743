package test;

import java.util.Scanner;
import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        
        String encriptedString = Cipher(inputString);
        System.out.println("Encrypted string is: " + encriptedString);
        
        System.out.println("Encrypted string is: " + Cipher(encriptedString));
    }
}
