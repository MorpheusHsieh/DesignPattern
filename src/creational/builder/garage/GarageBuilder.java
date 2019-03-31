package creational.builder.garage;


/*
 * Abstract Builder
 */
public abstract class GarageBuilder 
{
  private  Designer builder;
  
  public abstract void makeWall();
  public abstract void makeDoor();
  public abstract void makeRoof();
  public abstract void printGarage();
  
  public Designer getBuilder() 
  {
  	return builder;
  }
}
