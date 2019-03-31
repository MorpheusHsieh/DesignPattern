package creational.builder.garage;


/*
 * Concrete Builder
 */
public class CheapBuilder extends GarageBuilder 
{
  private String _cheapGarage = "便宜車庫 = ";
  
  public void makeWall() {
      _cheapGarage = _cheapGarage + "四個木牆 ";
  }
  
  public void makeRoof() {
      _cheapGarage = _cheapGarage + "一個木屋頂 ";
  }
  
  public void makeDoor() {
      _cheapGarage = _cheapGarage + "一個木門 ";
  }
  
  // 這只是顯示成品而已
  public void printGarage() {
      System.out.println("成品: " + _cheapGarage);
  }
}
