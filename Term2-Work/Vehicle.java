public class Vehicle

{
 private int location;
 
 public Vehicle()
 {
  this (0);
 }
 public Vehicle(int loc)
 {
  if (loc >= -20 && loc <= 20)
  {
   location = loc;
  }
 }
 void forward()
 {
  if (location > -20 && location < 20)
  {
   location += 1;
  }
 }
 void backward()
 {
  if (location > -20 && location <= 20)
  {
   location -= 1;
  }
 }
 int getLocation()
 {
  return location;
 }
 public String toString()
 {
  String at = "";
  for (int i = -20; i < location; i++)
  {
   at += " ";
  }
  at += "@";
  return at;
  
 }
 
}