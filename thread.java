public class thread {
      public static void main(String[]args){
            odd o = new odd();
            even e = new even();
            o.start();
            try{
                  o.join();
            }
            catch(Exception f){
                  System.out.println("Exception occured");
            }
            e.start();
      }
}