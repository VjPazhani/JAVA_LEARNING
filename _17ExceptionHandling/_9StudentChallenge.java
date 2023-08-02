package _17ExceptionHandling;
//Stack is a data structure which is work on LIFO(Last in First out) actually it is implemented using array and elements are insertes LIFO fashion
//Actually there will be a pointer(Index pointer) called Top =-1[right now stack is empty] 
//if try to delete the elemants from empty stack it will be exeception
//if insert the value in stack so increase the top pointer
//when we say that the stack is full only if the Top = size-1;
class StackOverflowException extends Exception{
    public String toString(){
        return "Stack is full and OverFlow";
    }
}

class StackUnderflowException extends Exception{
    public String toString(){
        return "Stack is Underflow";
    }
}
class Stack{
    private int size;
    private int top=-1;
    private int s[];
    public Stack(int sz){
        size=sz;
        s=new int[sz];
    }
    public void push(int x) throws StackOverflowException {
       // System.out.println("Default Top value is "+top);
        if(top==size-1)
            throw new StackOverflowException();
        top++;
        s[top]=x;
    }
    public int pop() throws StackUnderflowException {
        int x=-1;
        if(top==-1)
            throw new StackUnderflowException();
       x=s[top];
            top--;
        return x;
    }
}
public class _9StudentChallenge {
    public static void main(String []args){
        Stack st=new Stack(5);
        try{
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            st.push(5);
            //st.push(6);
        }
        catch(StackOverflowException S){
            System.out.println(S);
        }
        /*try{
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            
        }
        catch(StackUnderflowException S){
            System.out.println(S);
        }*/
        


    }
    
}
