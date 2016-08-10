import static org.junit.Assert.*;
import org.junit.*;

public class BearTest{
  Bear bear;
  Salmon salmon;
  Human human;
  Chicken chicken;

  @Before 
  public void before() {
    bear = new Bear("Baloo");
    salmon = new Salmon(3); 
    human = new Human(15, "Malcolm");
    chicken = new Chicken(5);
  }

  @Test
  public void hasName(){
    assertEquals( "Baloo", bear.getName() ); 
  }

  @Test
  public void bellyStartsEmpty(){
    assertEquals(0, bear.foodCount());
  }

  @Test
  public void canEatSalmon(){
    bear.eat(salmon, "Monday");
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void canEatHuman(){
    bear.eat(human, "Monday");
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void canEatChicken(){
    bear.eat(chicken, "Monday");
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void canThrowUpChicken(){
    bear.eat(chicken, "Monday");
    Edible food = bear.throwUp();
    Chicken original = (Chicken) food;
    assertEquals("Cluck off",original.cluck());
  }

  @Test
  public void shouldEmptyBellyAfterSleeping(){
    bear.eat(salmon, "Monday");
    bear.sleep();
    assertEquals(bear.foodCount(), 0);
  }

  @Test
  public void canThrowUp(){
    bear.eat(salmon, "Monday");
    Edible food = bear.throwUp();
    Salmon original = (Salmon) food;
    assertEquals("swimming",original.swim());
  }

  @Test
  public void canTotalNutrition(){
    bear.eat(salmon, "Monday");
    bear.eat(human, "Monday");
    bear.eat(human, "Monday");
    bear.eat(human, "Monday");
    bear.eat(chicken, "Monday");
    assertEquals(53,bear.totalNutrition());
  }

  @Test
  public void canTotalNutritionAfterThrowUp(){
    bear.eat(salmon, "Monday");
    bear.eat(human, "Monday");
    bear.eat(human, "Monday");
    bear.eat(human, "Monday");
    bear.eat(chicken, "Monday");
    bear.throwUp();
    assertEquals(50,bear.totalNutrition());
  }

  @Test
  public void canCountNumbersOfDifferentFoods(){
    bear.eat(salmon, "Monday");
    bear.eat(human, "Monday");
    bear.eat(human, "Monday");
    bear.eat(human, "Monday");
    bear.eat(chicken, "Monday");
    assertEquals(3,bear.foodTypeCount(human));
  }

  @Test
  public void canCountFoodByDay(){
    bear.eat(salmon, "Monday");
    bear.eat(human, "Tuesday");
    bear.eat(human, "Monday");
    bear.eat(human, "Monday");
    bear.eat(chicken, "Monday");
    assertEquals(4,bear.dayCount("Monday"));
    assertEquals(1,bear.dayCount("Tuesday"));
  }
}
