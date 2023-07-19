//always prepare and study pdf in resources
package _13Interfaces;
class Phone{
    void call(){System.out.println("Phone call");}
    void sms(){System.out.println("Phone sms");}
}
interface Icamera{
    void photoclick();
    void recordVideo();
}
interface Imusicplayer{
    void play();
    void stop();
}
class Smartphone extends Phone implements Icamera,Imusicplayer{
    public void photoclick(){System.out.println("Take Photo");}
    public void recordVideo(){System.out.println("Take Video");}
    public void play(){System.out.println("Play the music");}
    public void stop(){System.out.println("Stop the music");}
}
public class DemoForInterface {
    public static void main(String...args){
        Smartphone s = new Smartphone();
        Phone p=s;//you can use smartphone as a phone
        Icamera c=s;//you can use smartphone as a camera
        Imusicplayer m=s;//you can use smartphone as a musicplayer
        System.out.println("======== =========== ========");
        System.out.println("Print the smartphone properties");
        s.call();
        s.sms();
        s.play();
        s.stop();
        s.photoclick();
        s.recordVideo();
        System.out.println("======== =========== ========");
        System.out.println("Print the Phone properties using it reference to smartphone object it can only print the phone properties");
        //sometimes i use my smartphone as phone
        //so i refer my smartphone as phone
        p.call();
        p.sms();
        System.out.println("======== =========== ========");
        System.out.println("Print the Icamera properties using it reference to smartphone object it can only print the phone properties");
        //sometimes i use my smartphone as camera
        //so i refer my smartphone as camera
        c.recordVideo();
        c.photoclick();
        System.out.println("======== =========== ========");
        System.out.println("Print the Imusicplayer properties using it reference to smartphone object it can only print the phone properties");
        m.play();
        m.stop();
        System.out.println("======== =========== ========");



    }
}
