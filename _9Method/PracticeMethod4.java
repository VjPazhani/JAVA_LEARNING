//difference between PracticeMethod2 And Practice Method3
package _9Method;
public class PracticeMethod4{
    //---------------- -------------------------- -----------------------------
    static int change(int a[],int index,int value){
        /*primitve datatypes variale value in formal parameter does not 
    change value in main method actual parameter
    -------------------important note -------
    but non primitve datatypes like array objects can change the value of
    actual parameter by formal parameter
        ============String is immutable==========
    */
        a[index]=value;
        return a[index];//this retrurn a object
    }
    //------------------------- --------------------------- --------------------------
    static int change1(int x,int value){
        x=value;
        System.out.println("The value x in method change1 is "+x);
        return x;
    }
    public static void main(String args[]){
        System.out.println("When You Pass primitive datatype it pass the primitve data so the value cannot be changed but when you pass array it pass by entire object");
        System.out.println("when you use object as a paraameter important note the actual paramter pass only reference to formal paremeter");
        System.out.println("now the formal parameter as a reference and it als o point the same objetc that actual parameter did");
        
        int a[]={2,6,8,9,10};
        System.out.println("printing Original array\n");
        for(int x:a){
            System.out.printf("%d,\t",x);
        }
        System.out.println("");
        change(a,2,50);

        System.out.println("printing Changed array\n");

        for(int x:a){
            System.out.printf("%d,\t",x);
        }
        System.out.println("");
        System.out.println("============ =============Understanding the Primitive datatype ===================== ");
        //working
        int x=20;
        change1(x,30);//value in called method
        System.out.println("The value 20 is not changed in main method "+x);
    

    }
}
