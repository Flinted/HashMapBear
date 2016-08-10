import java.util.*;

public class Bear{
  
  private String name;
  private ArrayList<Edible> belly;
  private HashMap<String,Integer> journal;

  public Bear(String name){
    this.name = name;
    this.belly = new ArrayList<Edible>();
    this.journal = new HashMap<String,Integer>();
    journal.put("Monday", 0);
    journal.put("Tuesday", 0);
    journal.put("Wednesay", 0);
    journal.put("Thursday", 0);
    journal.put("Friday", 0);
    journal.put("Saturday", 0);
    journal.put("Sunday", 0);
  }

  public String getName(){
    return this.name;
  }

  public int foodCount(){
    return belly.size();
  }

  public int foodTypeCount(Edible type){
    int count = 0;
    for(Edible item : belly){
      if(item == type){
        count++;
      }
    }
  return count;
  }

  public void eat(Edible edible, String day){
    belly.add(edible);
    // int count = (int) journal.get(day);
    // count++;
    // journal.put(day, count);
    journal.put(day, journal.get(day) + 1);
  }

  public int dayCount(String day){
    return journal.get(day);
  }

  public void sleep(){
    belly.clear();
  }

  public int totalNutrition(){
    int total = 0;
    for(Edible item : belly){
      total += item.nutrition();
    }
    return total;
  }

  public Edible throwUp(){
    if(foodCount() > 0){
      return belly.remove(0);
    }
    return null;
  }

}
