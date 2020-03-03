public class UltimatePlayer extends Person
{
 private static int jerseyNumber;
 private int jerseyID;
 private String position = "";
 
 public UltimatePlayer(String first, String last, String pos) 
 {
  super (first,last);
  if (pos.equals("handler") || pos.equals("cutter"))
  {
   position = pos;
  }
  else
  {
   position = "handler";
  }
  jerseyNumber ++;
  jerseyID = jerseyNumber;
 }
 public String getPosition()
 {
  return position;
 }
 public String toString()
 {
  return  super.toString() + "\n" +
    "   " + "Jersey #: " + jerseyID + "\n" +
    "   " + "Position: " + position;
 }
}