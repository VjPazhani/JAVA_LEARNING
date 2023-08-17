package _23Generics;
@SuppressWarnings("unchecked")
class MyArray<S>
{
    S A[] =(S[]) new Object[10];
    int length =0;

    public void append(S v)
    {
        A[length++]=v;
    }
    public void display()
    {
        for(int i=0;i<length;i++){
            System.out.println(A[i]);
        }
    }
}
public class _4demo {
     
    public static void main(String[] args) {
        //MyArray<Integer> my=new MyArray<>();
        MyArray<String> my=new MyArray<>();

        //my.append(10);
        //my.append(20);
        //my.append(50);
        my.append("Hi");
        my.append("bye");
        my.append("Stay in present");
        my.display();
    }
}
