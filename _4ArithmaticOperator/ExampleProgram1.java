package _4ArithmaticOperator;


public class ExampleProgram1 {
    public static void main (String args[]){
    int x=4,y=5,z,z1;

    //run it for understanding
    z = 3 * x++ + 2 * ++y;
    z1 = 3 * ++x + 2 * ++y;
    System.out.println(z);
    System.out.println(z1);
    
}
}
/*In the given code, we have two expressions:

    z = 3 * x++ + 2 * ++y;
    z1 = 3 * ++x + 2 * ++y;

Let's evaluate each expression step by step:

    z = 3 * x++ + 2 * ++y;
        x++ means that the current value of x (4) is used in the expression, and then x is incremented to 5.
        ++y means that y is incremented by 1 before being used in the expression. Since y is currently 5, it becomes 6.
        Evaluating the expression: z = 3 * 4 + 2 * 6;
            3 * 4 is 12.
            2 * 6 is 12.
            Adding the results: 12 + 12 = 24
        Therefore, z is assigned the value 24.

    z1 = 3 * ++x + 2 * ++y;
        ++x means that x is incremented by 1 before being used in the expression. Since x is now 5, it becomes 6.
        ++y means that y is incremented by 1 before being used in the expression. Since y is currently 6, it becomes 7.
        Evaluating the expression: z1 = 3 * 6 + 2 * 7;
            3 * 6 is 18.
            2 * 7 is 14.
            Adding the results: 18 + 14 = 32
        Therefore, z1 is assigned the value 32. */
