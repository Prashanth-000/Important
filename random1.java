import java.util.Random;
class randomnum extends Thread
{
    Random rand=new Random();
    int n;
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("Generated number"+(i+1)+":"+rand.nextInt(100));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

class squarnum extends Thread{
int n;
public squarnum(int a){
    n=a;
}
public void run(){
    for(int i=1;i<n;i++){
        System.out.println("Square of number"+i+"is"+(i*i));
    }
}

}

class reversenum extends Thread{
    int p,n,rev,rem;
    public reversenum(int a){
       p=n=a;
    }
    public void run(){
        while(n>0){
            rem=n%10;
            n=n/10;
            rev=rev*10+rem;
        }
        System.out.println("Reverse of "+p+"is"+rev);
    }
}

class cubenum extends Thread{
    int n;
    public cubenum(int a){
        n=a;
    }
    public void run(){
        for(int i=1;i<n;i++){
            System.out.println("cube of "+i+"is"+(i*i*i));
        }
    }
}

public class random1{
    public static void main(String[] args) {
        Thread t1=new randomnum();
        t1.run();
        Thread t2=new squarnum(5);
        t2.run(); 
        Thread t3=new reversenum(143);
        t3.run();
        Thread t4=new cubenum(5);
        t4.run();
    }
}
