package _11Inheritence;
class TV{
    public void switchON(){System.out.println("TV is switched ON");}
    public void changeChannel(){System.out.println("TV channel is changed");}
}
class SmartTV extends TV{
    public void switchON(){System.out.println("SmartTV is switched ON");}
    public void changeChannel(){System.out.println("SmartTV channel is changed");}
    public void  smartBrowsing(){System.out.println("Smart TV is browsing");}

}
public class _6MethodOverridingExample{
    public static void main(String...args){
        //creating reference of super class and object of sub class
        TV t=new SmartTV();
        t.changeChannel();
        t.switchON();
        //t.smartBrowsing();
        //you can't get SmartBrowse method of sub class with reference of super class
        //because smart tv unique feature
        //only super class feature that present in sub class should be called when super class used to creare object of sub class
        
    }
    ///////////////////// Try to write example of cars and luxury car ///////////
}