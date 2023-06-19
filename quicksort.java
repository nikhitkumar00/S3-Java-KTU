public class quicksort{

      public static int partition(int a[], int beg, int end){
            int pivot = a[end];
            int i = beg;

            for(int j=beg;j<end;j++){
                  if(a[j]<pivot){
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                        i++;
                  }
            }
            int temp=a[i];
            a[i]=a[end];
            a[end]=temp;
            return i;
      }

      public static void print(int a[]){
            for(int i=0;i<a.length;i++){
                  System.out.print(a[i]+" ");
            }
            System.out.println();
            System.out.println();
      }

      public static void quick(int a[],int beg, int end){
            if(beg<end){
                  int p = partition(a,beg,end);
                  quick(a,beg,p-1);
                  quick(a,p+1,end);
            }
      }

      public static void main(String[]args){
            int a[] = {9,8,7,6,5,4,3,2,1};
            int n = a.length;
            System.out.println("Before sorting: ");
            print(a);
            System.out.println("After sorting: ");
            quick(a,0,n-1);
            print(a);
      }
}