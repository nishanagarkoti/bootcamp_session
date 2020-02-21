package MultithreadCodes;

class demo{
    void printID(){
        synchronized(this){
            for(int i=1;i<5;i++){
                System.out.println(i);
                try{
                    Thread.sleep(500);
                }catch(Exception e){ e.printStackTrace();}
            }
        }
    }
}
class Thread1 extends Thread{
    demo d;
    Thread1(demo d){
        this.d=d;
    }
    public void run(){
        d.printID();
    }
}
class Thread2 extends Thread{
    demo d;
    Thread2(demo d){
        this.d=d;
    }
    public void run(){
        d.printID();
    }
}

public class ques3{
    public static void main(String args[]){
        demo obj = new demo();
        Thread1 t1=new Thread1(obj);
        Thread2 t2=new Thread2(obj);
        t1.start();
        t2.start();
    }
}