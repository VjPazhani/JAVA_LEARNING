package _19JavaLangPackage;
//enum is used for defining own datatype

enum Dept  
{
//enum inherited from enum class
    CS("Rohit","Block A"), IT("Root","Block B"),CIVIL("Kholi","Block C"),ECE("Smith","Block D"); 
    
    private String head;
    private String location;

    private Dept(String head,String loc)
    {
        this.head=head;
        this.location=loc;
    }

    public String getHeadname()
    {
        return head;
    }
    public String getLocationName()
    {
        return location;
    }

   /* 
    CS,IT,CIVIL,ECE; //all these constants are should be capital because these are final
    
        //enum can have constructer but it should br privste or default
    private Dept()
    {
        System.out.println(this.name());
    }
    public void display()
    {
        System.out.println(this.name()+ " " +this.ordinal());

    }
   */ 

    private Dept()
    {
        System.out.println(this.name());
    }
    public void display()
    {
        System.out.println(this.name()+ " " +this.ordinal());

    }
}

public class _7EnumDemo {
     public static void main(String[] args) {
        
        //Dept d=Dept.CIVIL;
        /*
            ordinal()
            name()
            System.out.println(d.name());
        Dept list[]= Dept.values();

        for(Dept x:list)
            System.out.println(x);
         */
        //enum are basically used in switch case
        Dept d=Dept.CIVIL;
        d.display();

        /*switch(d){
            case CS: System.out.println("Head : Rohit \nBlock: A");
                     break;

            case IT: System.out.println("Head : Root \nBlock: B");
                     break;
            
            case CIVIL: System.out.println("Head : Smith \nBlock: c");
                        break;

            case ECE: System.out.println("Head : Kholi \nBlock: D");
                        break;
        }
        */
        System.out.println(d.getHeadname());
        System.out.println(d.getLocationName());

        
    }
}
