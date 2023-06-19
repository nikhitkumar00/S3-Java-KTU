import java.util.Scanner;
public class manualexception {
      public static void main(String[]args){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 10: ");
            int n = s.nextInt();
            try{
                  if( n<1 || n>10)
                  {
                        throw new numberexception();
                  }
            }
            catch(numberexception e){
                  System.out.println(e.getMessage());
            }
      }
}