public class Human implements Edible {
  
  private int nutrition;
  private String name;

  public Human(int value, String name){
    this.nutrition = value;
    this.name = name;
  }

  public String speak(){
    return "Hello, I am " + this.name + ". Please don't eat me Bear.";
  }

  public String swim(){
    return "swimming";
  }

  public int nutrition(){
    return this.nutrition;
  }
}