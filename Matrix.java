import java.util.Scanner;
class Matrix{
    int rows;
    int columns;
    int array[][];
    static Scanner sc = new Scanner(System.in);
    Matrix(int rows,int columns){
        this.rows = rows;
        this.columns = columns;
        array = new int[rows][columns];
    }
    void getInput(){
        for(int i=0;i<rows;i++)
            for(int j=0;j<columns;j++)
                array[i][j] = sc.nextInt();
    }
    int matrixMul(Matrix m1,Matrix m2){
        int flag =0;
        if(m1.columns != m2.rows){
            flag =1;
            return flag;
        }
        else{
            for(int i=0;i<m1.rows;i++)
                for(int j=0;j<m2.columns;j++)
                    for(int k=0;k<m1.columns;k++)
                        array[i][j] += m1.array[i][k] * m2.array[k][j];
            return flag;
        }
    }


    void printMatrix(){
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++)
                System.out.print(array[i][j]+" ");
            System.out.println();
        }
    }


    public static void main(String[] args){
        int r,c;
        //For matrix 1.
        System.out.println("For matrix 1");
        System.out.print("Enter the no of rows:\t");
        r = sc.nextInt();
        System.out.print("Enter the no of columns:\t");
        c = sc.nextInt();


        Matrix m1 = new Matrix(r,c);
        System.out.println("Enter the elements of the matrix");
        m1.getInput();




        //For matrix 2.
        System.out.println("For matrix 2");
        System.out.print("Enter the no of rows:\t");
        r= sc.nextInt();
        System.out.print("Enter the no of columns:\t");
        c= sc.nextInt();


        Matrix m2 = new Matrix(r,c);
        System.out.println("Enter the elements of the matrix");
        m2.getInput();
        Matrix m3 = new Matrix(m1.rows,m2.columns);
       int flag = m3.matrixMul(m1,m2);


        //Printing the matrices.
        System.out.println("The First matrix is");
        m1.printMatrix();


        System.out.println("The Second matrix is");
        m2.printMatrix();


        if(flag == 0){
            System.out.println("The multiplication of two matrices is");
            m3.printMatrix();
        }
        else{
            System.out.println("The multiplication of the two matrices is not possible");
        }
    }
}