package creational.abstract_factory.house;

public class Main 
{
  public static void main(String[] args) 
  {
    House houseForHome = new House();
  
    //���o���Фl�[�J�@�Ǯa�γí�
    houseForHome.addFurniture(new HomeFactory());
    System.out.println();
    
    //���o���Фl�[�J�@�ǿ줽�í�
    House houseForOffice = new House();
    houseForOffice.addFurniture(new OfficeFactory());
  }
}