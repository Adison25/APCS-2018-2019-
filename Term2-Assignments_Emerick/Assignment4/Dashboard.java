/*
 * AP CS MOOC
 * Term 2 - Assignment 1, Dashboard
 * A class which represents a car dashboard.
 */

public class Dashboard implements Comparable {

    private int odometer;
    private int speedometer;
    private String checkEngine;

    public Dashboard() {
  this(0,0);
    }

    public Dashboard(int o, int s) {
  checkEngine = "Off";
        if (o >= 0 && o <= 99999)
  {
   odometer = o;
  }
  else
  {
   checkEngine = "On";
   odometer = 0;
  }
  if (s >= 0 && s <= 100)
  {
   speedometer = s;
  }
  else
  {
   checkEngine = "On";
   speedometer = 0;
  }
    }

    public String toString() 
 {
  String display = "";
  if (odometer < 10)
  {
   display = "0000" + odometer; 
  }
  else if(odometer < 100)
  {
   display = "000" + odometer;
  }
  else if(odometer < 1000)
  {
   display = "00" + odometer;
  }
  else if(odometer < 10000)
  {
   display = "0" + odometer;
  }
  else if(odometer < 100000)
  {
   display = "" + odometer;
  }
        return  "Speedometer: " + speedometer + " MPH" + "\n" +
    "Odometer: " + display + "\n" +
    "Check Engine: " + checkEngine;
    }

    public void accelerate() 
 {
  speedometer += 1;
        if (speedometer > 100)
  {
   speedometer = 0; 
   checkEngine = "On";
  } 
    }

    public void drive(int n) 
 {
        if (n >= 0 && n <= 720)
  {
   int miles = (speedometer * n)/60;
   odometer += miles;
   if (odometer > 99999)
   {
    odometer = 0;
    checkEngine = "On";
   }
  }
    }
 
 public int compareTo(Object other)
 {
  Dashboard temp = (Dashboard) other;
  
  //Testing Odometer
  
  if (this.odometer > temp.odometer)
  {
   return 1;
  }
  else if (this.odometer < temp.odometer)
  {
   return -1;
  }
  
  
  //Testing Speedometer
  else if (this.speedometer > temp.speedometer)
  {
   return 1;
  }
  else if (this.speedometer < temp.speedometer)
  {
   return -1;
  }
  
  //Testing CheckEngine
  else if (this.checkEngine.equals("On") && temp.checkEngine.equals("Off"))
  {
   return 1;
  }
  else if (this.checkEngine.equals("Off") && temp.checkEngine.equals("On"))
  {
   return -1;
  }
  else
  {
   return 0;
  }
 }
 
 public String race(Dashboard other, int acc1, int acc2)
 {
  int stall_1 = 0;
  int stall_2 = 0;
  for (int i = 0; i < acc1; i++)
  {
   this.speedometer ++;
   if (this.speedometer > 100)
   {
    stall_1 ++;
    this.accelerate();
    break;
   }
  } 
  for (int i = 0; i < acc2; i++)
  {
   other.speedometer ++;
   if (other.speedometer > 100)
   {
    stall_2 ++;
    other.accelerate();
    break;
   }
  }
  //Return statement
  String statement = "";
  if (stall_1 == 0 && stall_2 == 0)  //if both don't stall
  {
   if (this.speedometer == other.speedometer)
   {
    statement = "\n" + this.toString() + "\n\n" + other.toString() + "\n\n" + "It's a tie!";
   }
   else if (this.speedometer > other.speedometer)
   {
    statement = "\n" + this.toString() + "\n\n" + other.toString() + "\n\n" + "Car 1 has won the race!";
   }
   else 
   {
    statement = "\n" + this.toString() + "\n\n" + other.toString() + "\n\n" + "Car 2 has won the race!";
   }
  }
  else if (stall_1 == 0 && stall_2 == 1) //if car2 stalls
  {
   statement = "Second car stalled out!" + "\n\n" + this.toString() + "\n\n" + other.toString() + "\n\n" + "Car 1 has won the race!";
  }
  else if (stall_1 == 1 && stall_2 == 0) //if car1 stalls
  {
   statement = "First car stalled out!" + "\n\n" + this.toString() + "\n\n" + other.toString() + "\n\n" + "Car 2 has won the race!";
  }
  else if (stall_1 == 1 && stall_2 == 1)  //if both cars stall
  {
   statement ="First car stalled out!" + "\n" + "Second car stalled out!" + "\n\n" + this.toString() + "\n\n" + other.toString() + "\n\n" + "It's a tie!"; 
  }
  return statement;
 }
 
 public String difference(Dashboard other)
 {
  int milesLeft = 0;
  int minutesLeft = 0;
  String statement = "";
  if (this.odometer > other.odometer)
  {
   milesLeft = this.odometer - other.odometer;
   minutesLeft = (int)((1.0*milesLeft/other.speedometer) * 60);
   statement = "Second car will need to drive for " + minutesLeft + " minutes to catch first car."; 
   
  }
  else
  {
   milesLeft = other.odometer - this.odometer;
   minutesLeft = (int)((1.0*milesLeft/this.speedometer) * 60);
   statement = "First car will need to drive for " + minutesLeft + " minutes to catch second car.";
  }
  return statement; 
  
 }

}