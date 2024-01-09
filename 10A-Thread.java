class A extends Thread{
    public void run(){
        try{
            for(int i=0;i<=10;i++){
                sleep(1000);
                System.out.println("Good Morning");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class B extends Thread{
    public void run(){
        try{
            for(int j=0;j<=10;j++){
                sleep(2000);
                System.out.println("Hello");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class C extends Thread{
    public void run(){
        try{
            for(int k=0;k<=10;k++){
                sleep(3000);
                System.out.println("Welcome");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class Main{
    public static void main(String args[]){
        A a=new A();
        B b=new B();
        C c=new C();
        a.start();
        b.start();
        c.start();
    }
}