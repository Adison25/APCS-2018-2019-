/*
 * AP CS MOOC
 * Term 2 - Assignment 2, Part 1: Boxcar
 * A class which represents a single car on a freight train.
 */

public class Boxcar
{
    // Variables that will be initialized in the Boxcar constructors.
    private String cargo = "";
    private int numUnits;
    private boolean repair;

    // Default constructor that sets the boxcar to "gizmos", 5, and false.
    public Boxcar()
    {
        cargo = "gizmos";
  numUnits = 5;
  repair = false;
    }


    // This constructor sets the cargo variable to the parameter c, but only if
    // c is "gizmos", "gadgets", "widgets", or "wadgets". The constructor ignores
    // the case of of the value in c. If c holds any value other than
    // "gizmos", "gadgets", "widgets", or "wadgets", the constructor sets cargo
    // to "gizmos". The numUnits variable is set to the parameter u. If u is less than
    // 0 or higher than the maximum capacity of 10 units, numUnits is set to 0. The repair
    // variable is set to the parameter r. If repair is true, numUnits is set to 0
    // no matter what value is stored in the u parameter.
 
    public Boxcar(String c, int u, boolean r)
    {
  if (c.equals("gizmos"))
  {
   cargo = c;
  }
  else if (c.equals("gadgets"))
  {
   cargo = c;
  }
  else if (c.equals("widgets"))
  {
   cargo = c;
  }
  else if (c.equals("wadgets"))
  {
   cargo = c;
  }
  else 
  {
   cargo = "gizmos"; 
  }
  
  if (u > 0 && u <= 10)
  {
   numUnits = u;
  }
  else 
  {
   numUnits = 0;
  }
  
  if (repair == true)
  {
   numUnits = 0;
  }
    }

    // The toString method returns a String with the Boxcar in the format:
    // 5 gizmos    in service
    // 10 widgets    in service
    // 0 gadgets    in repair
    //
    // Notice there is one space in between the number of units and the cargo
    // and a tab between the value for cargo and "in repair"/"in service"
    public String toString()
    {
  String display = "";
  if (repair == false)
  {
   display = "in service";
  }
  else
  {
   display = "in repair";
  }
        return  numUnits + "  " + cargo + "\tin " + display + "\n" +
    numUnits + "  " + cargo + "\tin " + display + "\n" +
    numUnits + "  " + cargo + "\tin " + display + "\n";
    }

    // This method adds 1 to the number of units in the BoxCar. The maximum
    // capacity of a boxcar is 10 units. If increasing the number of units
    // would go beyond the maximum, keep numUnits at the max capacity.
    // If the repair variable is true, then numUnits may only be set to 0.
 
    public void loadCargo() 
 {
        numUnits ++;
  if (numUnits > 10)
  {
   numUnits = 10;
  }
    }

    // The getCargo method returns the cargo of the boxcar.
    public String getCargo()
    {
        /* missing code (don't forget to update the return statement) */
        return cargo;
    }

    // The setCargo method sets the cargo type of the boxcar. The cargo variable is
    // set to c only if c is "gizmos", "gadgets", "widgets", or "wadgets".
    // The method ignores the case of of the value in c. If c holds any value other than
    // "gizmos", "gadgets", "widgets", or "wadgets" (ignoring case), the method sets cargo
    // to "gizmos".
    public void setCargo(String c)
    {
        if (c.equals("gizmos"))
  {
   cargo = c;
  }
  else if (c.equals("gadgets"))
  {
   cargo = c;
  }
  else if (c.equals("widgets"))
  {
   cargo = c;
  }
  else if (c.equals("wadgets"))
  {
   cargo = c;
  }
  else 
  {
   cargo = "gizmos"; 
  }
    }

    // The isFull method returns true if numUnits is equal to 10, false otherwise.
    public boolean isFull()
    {
        /* missing code (don't forget to update the return statement) */
  
  if (numUnits == 10)
  {
   return true;
  }
  else
  {
   return false;
  }
    }

    // The callForRepair method sets the variable repair to true, and numUnits to 0.
    public void callForRepair()
    {
        repair = true;
  numUnits = 0;
    }
}
