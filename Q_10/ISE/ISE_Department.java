package Q_10.ISE;

import Q_10.*;
import java.util.Scanner;
public class ISE_Department implements Department{
    Scanner sc=new Scanner(System.in);

    class AgeException extends Exception{
        AgeException(String msg){
            super(msg);
        }
    }
    public void readDe(Faculty f){
        System.out.println("Enter Name");
        f.Name=sc.nextLine();
        System.out.println("Enter Designation");
        f.Designation=sc.nextLine();
        System.out.println("Enter Age");
        f.Age=sc.nextInt();
        try{
            if(f.Age>58)
                throw new AgeException("Age is above 58");
        }
        catch(AgeException e){
            System.out.println(e);
        }
        System.out.println("Enter YOE");
        f.YOE=sc.nextInt();
        System.out.println("Enter Joining Date");
        sc.nextLine();
        f.Joining=sc.nextLine();
        System.out.println("Enter SubH");
        f.subH=sc.nextLine();
        System.out.println("Enter No of designation");
        f.nod=sc.nextInt();
        System.out.println("Enter no. of research project done");
        f.nord=sc.nextInt();
    }

    public void printDe(Faculty f){
        System.out.print("Name "+f.Name+"\nDesignation "+f.Designation+"\nAge "+f.Age+"\nYOE "+f.YOE+"\nJoining Date "+f.Joining+"\nSubH "+f.subH+"\nNOD "+f.nod+"\nNord "+f.nord+"\n");
    }

    public void printnod(Faculty f){
        System.out.println("The no of designation of Faculty are "+f.nod);
    }

    public void printnord(Faculty f){
        System.out.println("The no of rearch proj done are "+f.nord);
    }
}