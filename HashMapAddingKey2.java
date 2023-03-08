import java.util.*;


class Main {
    public static void main(String[] args) { 
        
        String[] names = {"Ram","Naresh","Vani","Rahim","Deepak"};
        String[] games = {"Cricket","Football","Tennis","Cricket","Boxing"};
        // Write your code here
        HashMap<String,String> players=new HashMap<>();
        for(int i=0;i<names.length;i++){
            players.put(names[i],games[i]);
        }
        
        
        Scanner sc=new Scanner(System.in);
        String[] userInput=sc.nextLine().split(" ");
        
        players.put(userInput[0],userInput[1]);
        
        ArrayList<String> playersWithSports=new ArrayList<>(players.keySet());
        Collections.sort(playersWithSports);
        
        
        for(String s:playersWithSports){
            String sport=players.get(s);
            
            System.out.printf("%s:%s\n",s,sport);
            
        }
        
      // System.out.println(players);
        
    }
}