package ua.patterns;

public class HouseBlend extends Beverage {
  public HouseBlend() {
    description = "House blend coffee.";
  }

  @Override
  public float cost() {
    return .89f + super.cost();
  }
}
