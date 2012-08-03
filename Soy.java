package ua.patterns;

public class Soy extends CondimentDecorator {
  public Soy(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", Soy";
  }

  @Override
  public float cost() {
    return 0.05f + super.cost();
  }
}
