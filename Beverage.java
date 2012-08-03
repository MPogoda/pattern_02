package ua.patterns;

public abstract class Beverage {
  String description;
  private int soy;
  private int whip;
  private int mocha;
  private int milk;

  private static float COST_OF_SOY   = .05f;
  private static float COST_OF_WHIP  = .15f;
  private static float COST_OF_MOCHA = .10f;
  private static float COST_OF_MILK  = .10f;

  public Beverage() {
    soy   = 0;
    whip  = 0;
    milk  = 0;
    mocha = 0;
  }

  public String getDescription() {
    return description;
  }

  public float cost() {
    return COST_OF_MILK * hasMilk() + COST_OF_MOCHA * hasMocha()
         + COST_OF_WHIP * hasWhip() + COST_OF_SOY   * hasSoy();
  }

  public final int hasMilk() {
    return milk;
  }

  public final int hasWhip() {
    return whip;
  }

  public final int hasMocha() {
    return mocha;
  }

  public final int hasSoy() {
    return soy;
  }

  public final void addMilk() {
    ++milk;
  }

  public final void addWhip() {
    ++whip;
  }

  public final void addMocha() {
    ++mocha;
  }

  public final void addSoy() {
    ++soy;
  }
}
