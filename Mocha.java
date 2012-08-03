package ua.patterns;

public class Mocha extends CondimentDecorator {
  public Mocha(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", Mocha";
  }

  @Override
  public float cost() {
    return 0.2f + super.cost();
  }
}
