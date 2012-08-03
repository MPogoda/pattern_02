package ua.patterns;

public class EspressWithWhip extends Beverage() {
  public EspressWithWhip() {
    description = "Espresso coffee with whip";
  }

  @Override
  public float cost() {
    return 1.24;
  }
}
