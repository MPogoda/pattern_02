package ua.patterns;

public abstract class Beverage {
  String description;

  public String getDescription() {
    return description;
  }

  public abstract float cost();
}
