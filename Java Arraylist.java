import java.io.*;
import java.util.*;



public class Solution {

    public static void main(String[] args) 
    {

      Scanner scan = new Scanner(System.in);
      ArrayList[] list= new ArrayList[20002];
      int n;
      n=scan.nextInt();
      for(int i=1;i<=n;i++)
      {

          list[i]=new ArrayList();
          int x=scan.nextInt();

          for(int j=1;j<=x;j++)
          {
              int val=scan.nextInt();
              list[i].add(val);

          }
      }
      int q=scan.nextInt();

      for(int i=1;i<=q;i++)
      {
              int x,y;
              x=scan.nextInt();
              y=scan.nextInt();
              try
              {
                System.out.println(list[x].get(y-1));
              }catch(Exception e)
              {
                  System.out.println("ERROR!");
              }
      }
    }
}