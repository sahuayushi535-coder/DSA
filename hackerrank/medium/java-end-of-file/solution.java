import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt();
         for(int k=0;k<q;k++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;

            for (int i = 0; i < n; i++) {
                sum += (1 << i) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
