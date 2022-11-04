//HackerRank Subarrays
import java.util.*;
public class Main
{
    public static void Subarrays(int numbers[],int n) {
        int sum=0;
        int nons=0;
        for(int i=0;i<n;i++) { //FOR OUTER LOOP
            for(int j=i;j<n;j++) {
                 sum=0;
        for(int k=i;k<=j;k++) {
            sum+=numbers[k];
            
            }
           if (sum<0) {
                nons++;
            //System.out.print(sum + " ");
        }
         
        // System.out.println(sum + " ");
            }
        }
         System.out.println("number of negative sum = " + nons);  
        } 
    public static void main(String[] args) {
       Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int numbers[]=new int[n];
     for (int i=0;i<n;i++) {
        numbers[i]=S.nextInt(); }
        Subarrays(numbers,n);
    }
}
