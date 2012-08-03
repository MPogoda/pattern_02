package ua.patterns;

public class DarkRoast extends Beverage {
  public DarkRoast() {
    description = "Dark roast coffee.";
  }

  @Override
  public float cost() {
    return .99f;
  }
}
