class A implements Runnable{
    public void run(){
        try{
            for(int i=0;i<=10;i++){
                Thread.sleep(1000);
                System.out.println("Good Morning");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class B implements Runnable{
    public void run(){
        try{
            for(int j=0;j<=10;j++){
                Thread.sleep(2000);
                System.out.println("Hello");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class C implements Runnable{
    public void run(){
        try{
            for(int k=0;k<=10;k++){
                Thread.sleep(3000);
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
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        Thread t3=new Thread(c);
        t1.start();
        t2.start();
        t3.start();
    }
}