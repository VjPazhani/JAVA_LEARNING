package _21IOStreams;
import java.io.*;
import java.util.Scanner;

class Customer implements Serializable
{
     String CusId;
    String name;
     String phoneno;
    static int count=1;
    public  Customer(){}
    public  Customer(String n,String p)
    {
            CusId="c"+count;
            count++;
            name=n;
            phoneno=p;
    }
    public String toString()
    {
        return "\nCustomer Details"+
                "\nCustomerId: "+CusId+
                "\nName: "+name+
                "\nPhoneNo: "+phoneno;
    }
}
/*
 * 1.readin customer list
 * public class StudentChallenge2 
{
    public static void main(String[] args) throws Exception
    {
        
        
        Customer list[]={new Customer("Raj","9751811266"),new Customer("Smith","9736457686"),new Customer("Virat","638529435892357")};
        
        FileOutputStream fos=new FileOutputStream("/home/vjpazhani/JAVA/Myjava/My/customer.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.write(list.length);

        for(Customer x:list)
        {
            oos.writeObject(x);
        }
        oos.close();
        fos.close();
    }
}
 */
public class StudentChallenge2 
{
    public static void main(String[] args) throws Exception
    {
        
        
        
        FileInputStream fos=new FileInputStream("/home/vjpazhani/JAVA/Myjava/My/customer.txt");
        ObjectInputStream oos=new ObjectInputStream(fos);

        java.util.Scanner sc=new java.util.Scanner(System.in);
        int length=oos.readInt();
        Customer List[]=new Customer[length]; 

        for(int i=0;i<length;i++)
        {
            List[i]=(Customer)oos.readObject();
        }
        System.out.println("Enter the Customer");
        String name1=sc.nextLine();
        sc.close();
        for(int i=0;i<length;i++)
        {
            if(name1.equalsIgnoreCase(List[i].name));
                System.out.println(List[i]);
        }
        oos.close();
        fos.close();
    }
}
