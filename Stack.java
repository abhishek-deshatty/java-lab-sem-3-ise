import java.util.Scanner;
class Stack{
    int top;
    int size;
    int stk[];
    static Scanner sc=new Scanner(System.in);
    
    Stack(int s){
        top=-1;
        this.size=s;
        stk=new int[size];
    }

    void push(int n){
        if(top==size -1)
            System.out.println("Stack is FULL");
        else{
            top++;
            stk[top]=n;
            System.out.println(stk[top] + "  is inserted into the Stack");
        }
    }

    int pop(){
        if(top==-1)
            return -1;
        else{
            return stk[top--];
        }
    }

    void display(){
        System.out.println("Displaying Stack");
        if(top!=-1){
        for(int i=0;i<=top;i++){
            System.out.print(stk[i]+" \t");
        }
        System.out.println(" ");
        }
        else{
            System.out.println("Nothing in Stack!!");
        }
    }
    public static void main(String[] args){
        System.out.println("Enter the size of Stack");
        int s=sc.nextInt();
        Stack s1=new Stack(s);
        while(true){
            System.out.println("Enter 1.Push\t2.Pop\t3.Display\t4.exit");
            int ch=sc.nextInt();
            int item;
                switch(ch){
                    case 1:System.out.println("Enter integer to be inserted");
                            item=sc.nextInt();
                            s1.push(item);
                            break;
                    case 2: int temp=s1.pop();
                            if(temp!=-1)
                                System.out.println(temp+" is poped from Stack");
                            else
                                System.out.println("Stack Underflow");
                            break;
                    case 3:s1.display();
                            break;
                    case 4:System.exit(0);
                    default:System.out.println("Invalid entry");
                }
            }
    }
}