package _23Generics;
//defining generic class

public class _3demo 
{
    class Data<T>
    {
        private T obj;

        public void setData(T v)
        {
            obj=v;
        }
        public T getData()
        {
            return obj;
        }
    }

    public static void main(String[] args) {
        _3demo x=new _3demo();
        Data<String> d=x.new Data<>();
        d.setData(("hi"));

        System.out.println(d.getData());

    }
}
