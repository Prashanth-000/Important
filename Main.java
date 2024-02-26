//package 1
package cc;
import java.util.*;

public class curencyc {
    double inr, dollar, euro, yen;
    Scanner sc = new Scanner(System.in);

    public void dollartorupee() {
        System.out.println("Enter dollar");
        dollar = sc.nextDouble();
        inr = dollar * 81.83;
        System.out.println("rupee:" + inr);
    }

    public void rupeetodollar(){
        System.out.println("rupee");
        inr=sc.nextDouble();
        dollar=inr/81.83;
        System.out.println("dollar:"+dollar);
    }

    public void eurotorupee() {
        System.out.println("Enter euro");
        euro = sc.nextDouble();
        inr = euro * 79.06;
        System.out.println("rupee:" + inr);
    }

    public void rupeetoeuro(){
        System.out.println("rupee");
        inr=sc.nextDouble();
        euro=inr/79.06;
        System.out.println("euro:"+euro);
    }
    public void yentorupee() {
        System.out.println("Enter yen");
        yen = sc.nextDouble();
        inr = yen*0.57;
        System.out.println("rupee:" + inr);
    }

    public void rupeetoyen(){
        System.out.println("rupee");
        inr=sc.nextDouble();
        yen=inr/0.57;
        System.out.println("yen:"+yen);
    }
}

//package 2
package dc;
import java.util.*;

public class distancec {
    double m,km,mile;
    Scanner sc=new Scanner(System.in);
    public void mtokm(){
        System.out.println("enter meters:");
        m=sc.nextDouble();
        km=m/1000;
        System.out.println("km:"+km);
    }
    public void kmtom(){
        System.out.println("enter km");
        km=sc.nextDouble();
        m=km*1000;
        System.out.println("meters:"+m);
    }
    public void miletokm(){
        System.out.println("enter miles");
        mile=sc.nextDouble();
        km=mile*1.6;
        System.out.println("km:"+km);
    }
    public void kmtomile(){
        System.out.println("enter km");
        km=sc.nextDouble();
        mile=km/1.6;
        System.out.println("mile:"+mile);
    }
    
}

//package 3

package tc;
import java.util.*;
public class timec {
    float sec,min,hour;
    Scanner sc=new Scanner(System.in);
    public void mintosec(){
        System.out.println("enter minutes");
        min=sc.nextFloat();
        sec=min*60;
        System.out.println("seconds:"+sec);
    }

    public void sectomin(){
        System.out.println("Enter seconds");
        sec=sc.nextFloat();
        min=sec/60;
        System.out.println("minutes:"+min);
    }
    public void hourtomin(){
        System.out.println("Enter seconds");
        hour=sc.nextFloat();
        min=hour*60;
        System.out.println("minutes:"+min);
    }
    public void mintohour(){
        System.out.println("Enter min");
        min=sc.nextFloat();
        hour=min/60;
        System.out.println("hours:"+hour);
    }
}


//Main class

import cc.*;
import dc.*;
import tc.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        curencyc c1 = new curencyc();
        distancec c2 = new distancec();
        timec c3 = new timec();
        System.out.println("Curency conversion");
        c1.rupeetodollar();
        c1.dollartorupee();
        c1.rupeetoeuro();
        c1.eurotorupee();
        c1.rupeetoyen();
        c1.yentorupee();
        System.out.println("Distance conversion");
        c2.mtokm();
        c2.kmtom();
        c2.kmtomile();
        c2.miletokm();
        System.out.println("Time conversion");
        c3.mintosec();
        c3.sectomin();
        c3.mintohour();
        c3.hourtomin();

    }

}
