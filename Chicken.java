public class Chicken implements Edible {
  
  private int nutrition;

  public Chicken(int value){
    this.nutrition = value;
  }
  public String cluck(){
    return "Cluck off";
  }

  public int nutrition(){
    return this.nutrition;
  }
}