package _9Method;

public class PracticeMethodCommandLineArguemets {
    //printing the commandline strings
    //String args[] means that arguements that are passed in command line must considered as string of array
    public static void main(String args[]){
        for(String S:args){

            System.out.println(S);
        }
    }
    /*Try this better understanding 
    public static void main(String args[]){
        for(int i=0;i<args.length;i++ ){
          System.out.println(args[i]);
        }
    } */
    
}
////----------------------important note to run this program--------------
/*To run this program and pass command-line arguments, you can execute the following command:



java _9Method.PracticeMethodCommandLineArguemets argument1 argument2 argument3

to run above command you should not run this in _9Method folder

Replace "argument1", "argument2", and "argument3" with the desired values. The program will print each argument on a separate line.a */
