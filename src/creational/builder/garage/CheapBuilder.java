package creational.builder.garage;


/*
 * Concrete Builder
 */
public class CheapBuilder extends GarageBuilder 
{
  private String _cheapGarage = "�K�y���w = ";
  
  public void makeWall() {
      _cheapGarage = _cheapGarage + "�|�Ӥ��� ";
  }
  
  public void makeRoof() {
      _cheapGarage = _cheapGarage + "�@�Ӥ�γ� ";
  }
  
  public void makeDoor() {
      _cheapGarage = _cheapGarage + "�@�Ӥ�� ";
  }
  
  // �o�u�O��ܦ��~�Ӥw
  public void printGarage() {
      System.out.println("���~: " + _cheapGarage);
  }
}
