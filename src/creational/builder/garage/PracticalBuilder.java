package creational.builder.garage;

/*
 * ConcreteBuilder 
 */
public class PracticalBuilder extends GarageBuilder 
{
  private String _practicalGarage = "實用車庫 = ";

  public void makeWall() {
    _practicalGarage = _practicalGarage + "四個水泥牆 ";
  }
  
  public void makeRoof() {
    _practicalGarage = _practicalGarage + "一個鐵屋頂 ";
  }
  
  public void makeDoor() {
    _practicalGarage = _practicalGarage + "一個電動門 ";
  }
  
  // 這只是顯示成品而已
  public void printGarage() {
    System.out.println("成品: " + _practicalGarage);
  }
}
