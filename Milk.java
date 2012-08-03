package ua.patterns;

public class Milk extends CondimentDecorator {
  public Milk(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", Milk";
  }

  @Override
  public float cost() {
    return 0.15f + super.cost();
  }
}
