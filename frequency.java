import java.util.Scanner;
class frequency{
      public static void main(String[]args){

            Scanner s = new Scanner(System.in);

            System.out.println("Enter the string: ");
            String str = s.nextLine();

            System.out.println("Enter the char to find frequency: ");
            char n = s.nextLine().charAt(0);
            
            int freq = 0;

            for(int i=0;i<str.length();i++)
            {
                  if(str.charAt(i)==n)
                  {
                        freq++;
                  }
            }

            System.out.println("Frequency: "+freq);
      }
}