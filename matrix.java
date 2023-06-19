import java.util.Scanner;
public class matrix {
      public static void main(String[]args){
            Scanner s = new Scanner(System.in);

            System.out.println("Enter row and column of first matrix: ");
            int r1 = s.nextInt();
            int c1 = s.nextInt();

            System.out.println("Enter row and column of second matrix: ");
            int r2 = s.nextInt();
            int c2 = s.nextInt();

            if(c1 != r2)
                  System.out.println("Matrix multiplication not possible");
            else
            {
                  int a[][] = new int[10][10];
                  int b[][] = new int[10][10];
                  int c[][] = new int[10][10];

                  for(int i=0;i<r1;i++){
                        for(int j=0;j<c1;j++){
                              System.out.println("Enter the ["+i+"]["+j+"] of first matrix:");
                              a[i][j]=s.nextInt();
                        }
                  }

                  for(int i=0;i<r2;i++){
                        for(int j=0;j<c2;j++){
                              System.out.println("Enter the ["+i+"]["+j+"] of second matrix:");
                              b[i][j]=s.nextInt();
                        }
                  }

                  for(int i=0;i<r1;i++){
                        for(int j=0;j<c2;j++){
                              c[i][j]=0;
                              for(int k=0;k<c1;k++){
                                    c[i][j]+=a[i][k]*b[k][j];
                              }
                              System.out.print(c[i][j]+" ");
                        }
                        System.out.println();
                  }
            }
      }
}
