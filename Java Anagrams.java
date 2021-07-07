import java.util.Scanner;

public class Solution {

     private static int[] frequency = new int[26];

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        for (char c : a.toCharArray()) {
            frequency[(int) c - 97]++;
        }
        for (char c : b.toCharArray()) {
            frequency[(int) c - 97]--;
        }
        
        boolean anagrams = true;
        for (int i : frequency) {
            if (i != 0) {
                anagrams = false;
                break;
            }
        }
        return anagrams;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}