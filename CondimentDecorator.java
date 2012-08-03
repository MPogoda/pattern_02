package ua.patterns;

public abstract class CondimentDecorator extends Beverage {
  private Beverage beverage;

  public CondimentDecorator(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription();
  }

  @Override
  public float cost() {
    return beverage.cost();
  }
}
