import java.util.Scanner;
class complex{
    static Scanner sc = new Scanner(System.in);
    int a;
    int b;
complex(){
    a = 0;
    b =0;
}
void getInput(){
    System.out.println("Enter the real part of the complex number");
    a = sc.nextInt();
    System.out.println("Enter the imaginary part of the complex number");
    b = sc.nextInt();
}
complex sum_c(complex c1,complex c2){
    complex c3 = new complex();
    c3.a = c1.a + c2.a;
    c3.b = c1.b + c2.b;
    return c3;
}
complex diff_c(complex c1,complex c2){
    complex c3 = new complex();
    c3.a = c1.a - c2.a;
    c3.b = c1.b - c2.b;
    return c3;
}
complex mul_c(complex c1, complex c2){
    complex c3 = new complex();
    c3.a = (c1.a * c2.a) - (c1.b * c2.b);
    c3.b = (c1.a * c2.b) + (c2.a * c1.b);
    return c3;
}
public static void main(String[] args){
    System.out.println("1. Addition of two complex numbers");
    System.out.println("2. Subtraction of two complex numbers");
    System.out.println("3. Multiplication of two complex numbers");
    System.out.println("4. Exit!");
    complex c1 = new complex();
    complex c2 = new complex();
    System.out.println("Enter the first complex number");
    c1.getInput();
    System.out.println("Enter the second complex number");
    c2.getInput();
    complex compute = new complex();
    while(true){
        System.out.println("Enter your choice");
        int ch = sc.nextInt();
        switch(ch){
        case 1:compute = compute.sum_c(c1,c2);
                System.out.println("The sum of "+c1.a + " +i" + c1.b + " and"+c2.a + " +i" + c2.b +" is "+compute.a + " +i" + compute.b);
                break;
        case 2:compute = compute.diff_c(c1,c2);
                System.out.println("The diff of "+c1.a + " +i " + c1.b + " and"+c2.a + " +i " + c2.b +" is "+compute.a + " +i (" + compute.b +")" );
                break;
        case 3:compute = compute.mul_c(c1,c2);
                System.out.println("The Multiplication of "+c1.a + " +i " + c1.b + " and"+c2.a + " +i " + c2.b +" is "+compute.a + " +i (" + compute.b+")"  );
                break;
        case 4:System.exit(0);
                break;
        default:System.out.println("Invalid choice");
                break;
        }
    }
    }
}