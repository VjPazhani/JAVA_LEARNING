/*program must accept two integers X and Y 
as the number of books and price of each book as the input.
 The program must print the total price of the amount after applying the discount based on the below conditions:
-If the number of books is greater than or equal to 2 and less than or equal to 4, then 10 percent is discounted from the total price of the books.
-If the number of books is 5, then 20 percent is discounted from the total price of the books.
-If the number of books is more than 5, then 50 percent is discounted from the total price of the books.
-No discount is applied if none of the conditions matches. */
package _9Method.ProblemSolvingUsingVarArgs;
import java.util.*;
public class  Discount {
    static double discount(int books,double price){
         double totalPrice= books*price;
        if(books>=2 && books<=4){
            double discount_price= totalPrice-((10.0/100.0)*totalPrice); //note that 10.0/100.0 is important1
            return discount_price;

        }
        else if(books==5){
            double discount_price= totalPrice-((20.0/100.0)*totalPrice);
            return discount_price;
        }
        else if(books>5){
            double discount_price= totalPrice-((50.0/100.0)*totalPrice);
            return discount_price;
        }
        else{
            return totalPrice;
        }
        
        
    }
    public static void main(String ...args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the No.of.books: ");
        int books = sc.nextInt();
        System.out.println("");
        System.out.printf("Enter the Price of books: ");
        double price = sc.nextDouble();
        sc.close();
        System.out.println("");
        System.out.println("The total_price of books is "+discount(books,price));


        
    }

    
}
