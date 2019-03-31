package creational.builder.garage;

/*
 * Director
 */
public class Designer 
{
  private String[] blueprint = {"��", "�γ�", "��"};
  
  public void buildGarage(GarageBuilder builder) 
  {
  	for(int i = 0; i < blueprint.length; i++) 
  	{
      if (blueprint[i].equals("��"))
        builder.makeWall();
      else if (blueprint[i].equals("�γ�"))
        builder.makeRoof();
      else if (blueprint[i].equals("��"))
        builder.makeDoor();
    }
  }
}
