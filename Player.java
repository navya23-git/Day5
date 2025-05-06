public class Player{
public static int totalPlayers=0;
String playerName;
public static void main(String args[]){
Player p=new Player();
p.playerName="virat";
totalPlayers++;
Player p1=new Player();
p1.playerName="dhoni";
totalPlayers++;
System.out.println(" Total players:"+totalPlayers);
}}