# Практична робота "Створення і використання статичних методів"
## Завдання №17: Зашифрувати задану фразу шифром XOR за заданим словом-ключем
### Exercise.java
```java
package domain;
/**
 * A class that represent an exercise
 * @author Illia_R
 */
public class Exercise {
    
    /**
     * Method that encrypts entered string
     * @param inputString entered string
     * @return encrypted string
     */
    public static String Cipher(String inputString)
    {
        char key = 'L';
        
        String outputString = "";
        
        int length = inputString.length();
        
        for(int i = 0; i < length; i++)
        {
            outputString += Character.toString((char)(inputString.charAt(i)^key));
        }
        System.out.println(outputString);
        return outputString;
    }
}
```
### TestResult.java
```java
package test;

import java.util.Scanner;
import domain.Exercise;

public class TestResult {
    public static void main(String[] args){
        System.out.println("Enter the string: ");
        
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
       
        System.out.println("Encrypted string:");
        String encriptedString = Cipher(inputString);
        
        System.out.println("Decrypted string:");
        Cipher(encriptedString);
    }
}
```
### Результат роботи програми
![](https://github.com/ppc-ntu-khpi/35---static-methods-ilr00743/blob/master/solution/Screenshot_1.png)

