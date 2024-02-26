import java.util.Scanner;

class pstaff {
    String name;
    String id;
    long phone;
    int salary;

Scanner sc = new Scanner(System.in);
public void getdata(){
System.out.println("Enter employee name:");
name=sc.next();
System.out.println("Enter id");
id=sc.next();
System.out.println("Phone number");
phone=sc.nextLong();
System.out.println("salary");
salary=sc.nextInt();
}
public void display(){
System.out.println("Name:"+name);
System.out.println("id:"+id);
System.out.println("Phone number:"+phone);
System.out.println("Salary:"+salary);
}
}

class teaching extends pstaff {
    String field;
    int n;
    Scanner sc = new Scanner(System.in);
    public void getdata() {
        super.getdata();
        System.out.println("Enter the domine");
        field = sc.next();
        System.out.println("Enter number of publication");
        n= sc.nextInt();
    }
    public void display() {
        super.display();
        System.out.println("Field:" + field);
        System.out.println("Number of publications:"+n);
    }
}

class tech extends pstaff{
    String skill;
    public void getdata(){
    super.getdata();
    System.out.println("Enter skill");
    skill=sc.next();
    }
    public void display(){
        super.display();
        System.out.println("Skill:"+skill);
    }

}

class contract extends pstaff{
    int period;
    public void getdata(){
    super.getdata();
    System.out.println("Enter period");
    period=sc.nextInt();     
    }

    public void display(){
    super.display();
    System.out.println("Period:"+period);
    }
}

public class Staff {
public static void main(String[] args) {
    teaching s1=new teaching();
    tech s2=new tech();
    contract s3=new contract();
    System.out.println("Enter the details of teaching staff");
    s1.getdata();
    System.out.println("\nEnter the details of technical staff");
    s2.getdata();
    System.out.println("\nEnter the details of contract staff");
    s3.getdata();
    System.out.println("\nDetails of teaching staff");
    s1.display();
    System.out.println("\nDetails of technical staff");
    s2.display();
    System.out.println("\nDetails of contract staff");
    s3.display();
}
}
