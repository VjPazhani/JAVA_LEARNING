package _9Method.ProblemSolvingCommandLineArguements;

public class SumOfNumbersInCommandLine {
    //we know that the command line arguements only accepts string of array
    //so we pass the numbers that also consider as stirng so we have converet as double
    //There is a class called Double and have method "parse.Double"
    public static void main(String args[]){
        int s=0;
        //use for loop use for understand the concept of for each loop
        for(String x:args){
            //if we pass string with number it throws error called number format error occur 
            //to overcome this we condition below
            if(x.matches("[0-9\\.]+")){        s+=Double.parseDouble(x);

            }
        }
        System.out.println("Sum is " +s);
    }
}
