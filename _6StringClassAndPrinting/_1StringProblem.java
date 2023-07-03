//Program to check wheather the email id gmail or not
//Also program to extract the username and domain name

package _6StringClassAndPrinting;

public class _1StringProblem {
    public static void main(String args[]){
        String str1 = "program@gmail.com";
        int i=str1.indexOf('@');
        String userName = str1.substring(0,i);
        String domainName = str1.substring(i+1,str1.length());
        System.out.println("The username  "+userName);
        System.out.println("The domainname "+domainName);
        System.out.println(domainName.startsWith("gmail"));




    }
    
}
