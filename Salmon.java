public class Salmon implements Edible {
  
  private int nutrition;

  public Salmon(int value){
    this.nutrition = value;
  }

  public String swim(){
    return "swimming";
  }

  public int nutrition(){
    return this.nutrition;
  }
}