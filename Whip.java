package ua.patterns;

public class Whip extends CondimentDecorator {
  public Whip(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", Whip";
  }

  @Override
  public float cost() {
    return 0.1f + super.cost();
  }
}
