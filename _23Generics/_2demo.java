package _23Generics;
//program to understand the generic
@SuppressWarnings("unchecked")

public class _2demo<T> 
{
    T data[] = (T[]) new Object[3];
    public static void main(String[] args) throws Exception
    {
        _2demo<Integer> gd=new _2demo<>();
        gd.data[0]=20;
        gd.data[1]=30;
        //gd.data[2]="String";
        Integer str=gd.data[0];
        System.out.println(str);
    }
}
