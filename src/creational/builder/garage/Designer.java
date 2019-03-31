package creational.builder.garage;

/*
 * Director
 */
public class Designer 
{
  private String[] blueprint = {"Àð", "«Î³»", "ªù"};
  
  public void buildGarage(GarageBuilder builder) 
  {
  	for(int i = 0; i < blueprint.length; i++) 
  	{
      if (blueprint[i].equals("Àð"))
        builder.makeWall();
      else if (blueprint[i].equals("«Î³»"))
        builder.makeRoof();
      else if (blueprint[i].equals("ªù"))
        builder.makeDoor();
    }
  }
}
