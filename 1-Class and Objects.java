//java program to demonstrate class and objects...

class Box{
    int w=2,l=2,b=2;
    void writedata(){
        System.out.println("The volume of the box is"+w*l*b);
    }
}
public class Main{
    public static void main(String args[]){
        Box obj=new Box();
        obj.writedata();
    }
}


//1-No return type and no parameter

class A{
    int l=10,b=20;
    void display(){
        System.out.println(l);
        System.out.println(b);
    }
}
public class Main{
    public static void main(String args[]){
        A obj=new A();
        obj.display();
    }
}


//2-with return type and without parameter

class A{
    int l=10,b=20;
    int display(){
        return(l*b);
    }
}
public class Main{
    public static void main(String args[]){
        A obj=new A();
        int x=obj.display();
        System.out.println(x);
    }
}


//3-No return type with parameter

class A{
    void display(int u,int v){
        System.out.println(u);
        System.out.println(v);
    }
}
public class Main{
    public static void main(String args[]){
        A obj=new A();
        obj.display(10,20);
    }
}


//4-With return type and parameter
class A{
    int display(int i,int j){
        return(i*j);
    }
}
public class Main{
    public static void main(String args[]){
        A obj=new A();
        int x=obj.display(10,20);
        System.out.println(x);
    }
}