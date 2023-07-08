package _9Method;

import java.util.Scanner;

public class ValidateStringAndAge {
    static boolean validateStringAndAge(String name){
        return name.matches("[a-zA-z\\s]+");//go through the string concept for better understanding
    }
    static boolean validateStringAndAge(int age){
        return (age>=3 && age<=15);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to validate: ");
        String name =  sc.nextLine();
        System.out.println("");
        System.out.println("========= ============= ============");

        if(validateStringAndAge(name)==true){
            System.out.println("The Given name is correct formation");
        }
        else{
            System.out.println("Not in valid formation try another name");

        }
        System.out.println("========= ============= ============");

        System.out.println("Enter the name to age: ");
        int age =sc.nextInt();
        sc.close();
        System.out.println("");
        System.out.println("========= ============= ============");
        if(validateStringAndAge(age)==true){
            System.out.println("Congratulations!! Student age is  eligible for joing in the higher studies");

        }
        else{
            System.out.println("Oops!! Student age is not eligible for joing in the higher studies");

        }
        System.out.println("========= ============= ============");

        
    }
    
}
