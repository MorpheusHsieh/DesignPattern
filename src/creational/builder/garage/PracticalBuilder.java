package creational.builder.garage;

/*
 * ConcreteBuilder 
 */
public class PracticalBuilder extends GarageBuilder 
{
  private String _practicalGarage = "��Ψ��w = ";

  public void makeWall() {
    _practicalGarage = _practicalGarage + "�|�Ӥ��d�� ";
  }
  
  public void makeRoof() {
    _practicalGarage = _practicalGarage + "�@���K�γ� ";
  }
  
  public void makeDoor() {
    _practicalGarage = _practicalGarage + "�@�ӹq�ʪ� ";
  }
  
  // �o�u�O��ܦ��~�Ӥw
  public void printGarage() {
    System.out.println("���~: " + _practicalGarage);
  }
}
