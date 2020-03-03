public class Captain extends UltimatePlayer
{
 private boolean type;
 
 public Captain(String first, String last, String pos, boolean type)
 {
  super(first,last,pos);
  if (super.getPosition().equals("handler"))
  {
   type = true;
  }
  else
  {
   type = false;
  }
 }
 public String toString()
 {
  String side = "";
  if (type == true)
  {
   side = "offense";
  }
  else
  {
   side = "defense";
  }
  return  super.toString() + "\n" +
    "   " + "Captain: " + side;
 }
 
}