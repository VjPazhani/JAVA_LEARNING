//coffee machine
package _15StaticAndFinal;
    class CoffeeMachine{
        private float waterqty;
        private float milkqty;
        private float cofeeqty;
        private float sugarqty;

    static private CoffeeMachine my = null;

    
    private CoffeeMachine(){
        cofeeqty=1;
        milkqty=1;
        waterqty=1;
        sugarqty=1;
    }
    public void fillWater(float qty)
    { 
        waterqty=qty;
    }
    public void fillSugar(float qty)
    { 
        sugarqty=qty;
    }
    public float getCoffee(){
        return 0.5f;
    }
    static CoffeeMachine getInstance(){
        if(my==null)
            my=new CoffeeMachine();
        return my;
    }
}
public class _4SingletonClass {
    public static void main(String[]args){
        CoffeeMachine m1=CoffeeMachine.getInstance();
        CoffeeMachine m2=CoffeeMachine.getInstance();
        CoffeeMachine m3=CoffeeMachine.getInstance();

        System.out.println(m1+" "+m2+" "+m3);
        if(m1==m2 && m1==m3)
            System.out.println("Same");


    }
    
}
