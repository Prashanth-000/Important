import java.util.*;
public class student {
    String name;
    String usn;
    String branch;
    long phone;

    public student(String n,String u,String b,long p){
        name=n;
        usn=u;
        branch=b;
        phone=p;
    }

    public void display()
    {
        System.out.println("name:"+name);
        System.out.println("usn:"+usn);
        System.out.println("branch:"+branch);
        System.out.println("phone:"+phone);
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    student s[]=new student[100];
    int n,i,j;

    System.out.println("\nEnter the number of students");
    n=sc.nextInt();
    System.out.println("Enter name,usn,brach,phone\n");
    for(i=0;i<n;i++){
        System.out.println("Enter details of student:"+(i+1));
        String name=sc.next();
        String usn=sc.next();
        String branch=sc.next();
        long phone=sc.nextLong();
        s[i]=new student(name, usn, branch, phone);
    }
    System.out.println("\n**Enterd Student deatils**");
    
    for(j=0;j<n;j++){
         System.out.println("\nStudent:"+(j+1));
        s[j].display();
    }
}

};
