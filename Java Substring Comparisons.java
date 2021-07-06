import java.util.*;
import java.io.*;

class Solution{ 
    public static void main(String []args){ 
          Scanner in = new Scanner(System.in);
          String s = in.nextLine();
          String outmin = "",outmax = "";
          int k = in.nextInt();
          for(int i=0;i<s.length()-k+1;i++){
              String w = "";
              for(int j=i;j<i+k;j++)
              	w+=s.charAt(j);
              if(i==0){
              	outmin=w;outmax=w;
              }
              else{
                  if(w.compareTo(outmin)<0)
                  	outmin=w;
                  if(w.compareTo(outmax)>0)
                  	outmax=w;
              }

          }
          System.out.println(outmin);
          System.out.println(outmax);
    }
}