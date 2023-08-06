package _19JavaLangPackage;
public class _5StringBufferBuilder {
    public static void main(String[]args){
        String s1=new String("Hello");
        StringBuffer sb=new StringBuffer("Hello");
        StringBuilder sb1=new StringBuilder("Hello");

        s1.concat("world");
        sb.append("World");
        sb1.append("World");

        System.out.println(s1);
        System.out.println(sb);
        System.out.println(sb1);
    }
}
