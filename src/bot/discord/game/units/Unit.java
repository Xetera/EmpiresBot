package bot.discord.game.units;

public class Unit {
  private String type;
  private int attack;
  private int defense;
  private int rangedDefense;
  private boolean isRanged;
  private int resourcesCarried;

  Unit(){
    this.type = "unknown";
    this.attack = 0;
    this.defense = 0;
    this.rangedDefense = 0;
    this.isRanged = false;
    this.resourcesCarried = 0;
  }

  Unit(String type. int attack, int defense, int rangedDefense, boolean isRanged, int resourcesCarried){
    this.type = type;
    this.attack = attack;
    this.defense = defense;
    this.rangedDefense = rangedDefense;
    this.isRanged = isRanged;
    this.resourcesCarried = resourcesCarried;
  }

  public int getAttack(){
    return this.attack;
  }

  public int getDefense(){
    return this.defense;
  }

  public int getRangedDefense(){
    return this.rangedDefense;
  }

  public boolean getIsRanged(){
    return isRanged;
  }

  public int getResourcesCarried(){
    return this.resourcesCarried;
  }

}
