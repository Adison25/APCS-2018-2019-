import java.util.ArrayList;

public class UltimateTeam
{
 private ArrayList<UltimatePlayer> players = new ArrayList<UltimatePlayer>();
 private ArrayList<Coach> coaches = new ArrayList<Coach>();
 
 public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches)
 {
  this.players = players;
  this.coaches = coaches;
 }
 public String getCutters()
 {
  String listCutters = "";
  for (int i = 0; i < players.size(); i++)
  {
   if (players.get(i).getPosition().equals("cutter"))
   {
    listCutters += players.get(i) + "\n";
   }
  }
  return listCutters;
 }
 public String getHandlers()
 {
  String listHandlers = "";
  for (int i = 0; i < players.size(); i++)
  {
   if (players.get(i).getPosition().equals("handler"))
   {
    listHandlers += players.get(i) + "\n";
   }
  }
  return listHandlers;
 }
 public String toString()
 {
  String displayP = "";
  String displayC = "";
  for (UltimatePlayer x: players)
  {
   displayP += x + "\n";
  }
  for (Coach y: coaches)
  {
   displayC += y + "\n";
  }
  return "COACHES" + "\n" + displayC + "\n" + "PLAYERS" + "\n" + displayP;
 }
}