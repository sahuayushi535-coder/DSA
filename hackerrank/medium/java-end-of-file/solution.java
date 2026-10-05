import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int LineNumber=1;
         while(sc.hasNext()){
            
         String str=sc.nextLine();
         System.out.println(LineNumber + " " +str);
         LineNumber++;
         }
    }
}
