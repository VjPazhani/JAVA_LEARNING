//program for jaged array
//In Jagged array row array act as a reference for arrays;
package _8Array;
public class _12IntroJaggedArray3{
    public static void main(String ... args){
        //jagged array declaration 
        int a[][];
        a=new int[4][];
        a[0]= new int[3]; //intializing the size to index of row array and it act as a reference of arrays
        a[1]= new int[4];
        a[2]= new int[6];
        a[3]= new int[5]; 
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){ //Important size declaration 'a[i].length'
                System.out.printf("%d\t",a[i][j]); //suppose if I print this I'll get zeroes only but u will try to understand the working of this
            }
            System.out.println("");
        }




    }
}