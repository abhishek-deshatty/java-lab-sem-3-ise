package Q_10;
import java.util.Scanner;
import Q_10.ISE.*;

public class MainClass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ISE_Department ise=new ISE_Department();
        Faculty f[];
        System.out.println("Enter no of Faculty");
        int n=sc.nextInt();
        f=new Faculty[n];

        for(int i=0;i<n;i++){
            f[i]=new Faculty();
            System.out.println("-------------");
            System.out.println("Enter for Faculty "+(i+1));
            ise.readDe(f[i]);
            System.out.println("-------------");
        }
        System.out.println("-----------------");
        System.out.println("Now Displaying Faculty with Years of exp >=20");
        System.out.println("-----------------");
        for(int i=0;i<n;i++){
            if(f[i].YOE>=20){
                ise.printDe(f[i]);
                System.out.println("-------------");
            }
        }

        System.out.println("Enter 1.to know no.of designations of a particular faculty\n2.to know research proj done by a particular faculty");
        int ch=sc.nextInt();
        sc.nextLine();
        switch(ch){
            case 1:System.out.println("Enter Name");
                    String x=sc.nextLine();
                        for(int i=0;i<n;i++){
                            if(f[i].Name.equals(x))
                                ise.printnod(f[i]);
                        }
                    break;
            case 2:System.out.println("Enter Name");
                    x=sc.nextLine();
                        for(int i=0;i<n;i++){
                            if(f[i].Name.equals(x))
                                ise.printnord(f[i]);
                        }
                    break;
            default:System.out.println("Invalid choice");
        }
    }
}
