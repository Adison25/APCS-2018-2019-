/*
 * AP CS MOOC
 * Term 2 - Assignment 1, Dashboard
 * A class which represents a car dashboard.
 */

public class Dashboard {

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

}