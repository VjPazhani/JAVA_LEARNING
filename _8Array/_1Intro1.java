package _8Array;

public class _1Intro1 {
    public static void main(String args[]){
        //numerous type s of declaring array
        int a[] = new int [10];
        int b[] = {1,2,3,4,5};
        int c[];
        c=new int [12];
        int []d=new int[10];
        //can i print the array without using foe loop
        int e[] = new int[10];
            System.out.println(e);  // it print [I
            System.out.println("");

            System.out.println("============ ================ ===========");
        float f[] = new float[10];
            System.out.println(f);   // it print [F
            System.out.println("============ ================ ===========");


        //we can find the array using a.lenth that length means property
        System.out.println(d.length);
            System.out.println("============ ================ ===========");

        //changing the single value in array 
        c[2] = 8;
            System.out.println(c[2]);
            System.out.println("============ ================ ===========");

        //for each is used for traversing the forward order but it does not traverse in reverse order
        //Disadvantage in for each loop it does not change the array element
        //it uses the print the position of the values
        for(int x :a){
            System.out.println(x);
            
        }
        System.out.println("============ ================ ===========");

        for(int x :a){
            System.out.println(x++);
            
        }
        System.out.println("============ ================ ===========");

        //for loop is used for traversing in order both forward and reverse order
        //It can used to change the value
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
            
        }
            System.out.println("============ ================ ===========");

        //change array value
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]++);
            
        }
        System.out.println("============ ================ ===========");

        //next time I print the b array in for each loop it display the modified results
        for(int x:b){
            System.out.println(x);
        }

    }
    
}
