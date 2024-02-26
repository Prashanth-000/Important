import java.util.Scanner;
public class fact {
    public static void main(String args[]){
        System.out.println("Enter a no negative number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factfor=1;
        for(int i=1;i<=n;i++){
            factfor*=i;
        }
        System.out.println("Forloop:"+factfor);
        int factforeach=1;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=i+1;
        }
        for(int j:a){
            factforeach*=j;
        }
        System.out.println("Factforeach:"+factforeach);
        int factwhile=1;
        int m=1;
        while(m<=n){
            factwhile*=m;
            m=m+1;
        }
        System.out.println("Fact while:"+factwhile);
        int factdowhile=1;
        int p=1;
        do{
            factdowhile*=p;
            p=p+1;
        }
        while(p<=n);
        System.out.println("Fact do while:"+factdowhile);
    }
}
