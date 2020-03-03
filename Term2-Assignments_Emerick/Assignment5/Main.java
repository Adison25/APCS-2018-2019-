import java.util.*;

public class Main {

  public static void main (String[] args) {
 
 GameWheel test = new GameWheel();
 
 ArrayList<PrizeCard> player1 = new ArrayList<PrizeCard>(5);
 ArrayList<PrizeCard> player2 = new ArrayList<PrizeCard>(5);

 //System.out.println(test.getprizeCards().get(0)));
 
 int x = 0;
 int x1 = 0;
 int total = 0;
 int total2 = 0;
 while (x < 5)
 {
  PrizeCard whatIgot = test.spinWheel();
  if (!player1.contains(whatIgot))
  {
   player1.add(whatIgot);
   x++;
  }
 }
 while (x1 < 5)
 {
  PrizeCard whatIgot1 = test.spinWheel();
  if (!player2.contains(whatIgot1))
  {
   player2.add(whatIgot1);
   x1++;
  }
 }
 
 for (int i = 0; i < 5; i++)
 {
  total += player1.get(i).getPrizeAmount();
  total2 += player2.get(i).getPrizeAmount();
  //System.out.println (test.player1(i));
 }
 String output = "";
 String output2 = "";
 for (int z = 0; z < 5; z++) //printing it out 
 {
  output += player1.get(z) + "\n";
  output2 += player2.get(z) + "\n";
 }
 
 System.out.println("Player 1 Total: $" + total);
 System.out.println (output);
 System.out.println ("Player 2 Total: $" + total2);
 System.out.println (output2);
 if (total > total2)
 {
  System.out.println ("Player 1 won by $" + (total-total2));
 }
 else
 {
  System.out.println ("Player 2 won by $" + (total2-total));
 }
 
  }
}
