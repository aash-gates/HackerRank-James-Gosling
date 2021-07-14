import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
 public static void main(String[] args) {
  Scanner st = new Scanner(System.in);
  LinkedList < Integer > LL = new LinkedList < Integer > ();
  int n = st.nextInt();
  for (int i = 0; i < n; i++) {
   int p = st.nextInt();
   LL.add(p);
  }
  int q = st.nextInt();
  while (q--> 0) {
   st.nextLine();
   String s = st.nextLine();
   if (s.equals("Insert")) {
    int index = st.nextInt();
    int num = st.nextInt();
    LL.add(index, num);
   } else {
    int num = st.nextInt();
    LL.remove(num);
   }
  }

  Iterator itr = LL.iterator();
  while (itr.hasNext()) {
   System.out.print(itr.next() + " ");
  }
  System.out.println("\n");
 }
}