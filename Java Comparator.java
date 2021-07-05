import java.util.*;

class Checker implements Comparator<Player>{

    public int compare(Player a, Player b) {
        // If 2 Players have the same score
        if(a.score == b.score){
            // Order alphabetically by name
            if(a.name.compareTo(b.name) < 0){
                return -1;
            }
            else if(a.name.compareTo(b.name) > 0){
                return 1;
            }
            return 0;
        }    
        
        // Otherwise, order higher score first   
        else if(a.score > b.score){
            return -1;
        }
        else if(a.score < b.score){
            return 1;
        }
        
        return 0;
    }
}

/** Alternative Approach:

    class Checker implements Comparator<Player>{

        public int compare(Player a, Player b) {
            // If 2 Players have the same score
            if(a.score == b.score){
                // Order alphabetically by name
                return a.name.compareTo(b.name);
            }    

            // Otherwise, order higher score first  
            return ((Integer) b.score).compareTo(a.score);
        }
    }

**/

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}