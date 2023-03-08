/* HashMap Example */





import java.util.*;

class Main {
    public static void main(String[] args) { 
        String[] names = { "Ram", "Naresh", "Vani", "Rahim" };
        String[] games = { "Cricket", "Football", "Tennis", "Cricket" };
        // Write your code here
        
        Scanner sc=new Scanner(System.in);
        
        String[] userInput=sc.nextLine().split(" ");
        
        
        
        
        
        HashMap<String,String> players=new HashMap<>();
        players.put(userInput[0],userInput[1]);
        int arrSize=names.length;
        for(int i=0;i<arrSize;i++){
            
            String key=names[i];
            String value=games[i];
            
            players.put(key,value);
        }
        
        
      ArrayList<String> playersWithGames=new ArrayList<>(players.keySet());
      
   
      Collections.sort(playersWithGames);
      
       for(String s:playersWithGames){
          String sport=players.get(s);
          System.out.printf("%s:%s\n", s,sport);
      }
       // Collections.sort(players);
        
       
        
        
    }
}