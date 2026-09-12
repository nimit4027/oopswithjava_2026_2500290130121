public class Constructor {
    int a;
    float b;
    String c;
    static int d;
    /*memory for d will not be given to each object but a single memory as it is associated with the class and objects will share it */
    Constructor(){
        System.out.println("Default constructor called");
    }
    Constructor(int x){
        this.a=x;
    }
    Constructor(int a,float b){
        this.a=a;
        this.b=b;
    }
    Constructor(int a,float b,String c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public static void main(String[] args){
        Constructor obj1=new Constructor();
        Constructor obj2=new Constructor(10);
        Constructor obj3=new Constructor(10,20.5f);
        Constructor obj4=new Constructor(10,20.5f,"Hello");
        System.out.println("Value of a in obj2: "+obj2.a + " of b "+obj2.b + " of c "+obj2.c);
        System.out.println("Value of a in obj3: "+obj3.a + " of b "+obj3.b + " of c "+obj3.c);
        System.out.println("Value of a in obj4: "+obj4.a + " of b "+obj4.b + " of c "+obj4.c);
    }
}