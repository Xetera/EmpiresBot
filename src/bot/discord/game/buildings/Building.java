package bot.discord.game.buildings;

public abstract class Building {
  //name of the building
  private String name;
  //its current level
  private int level;
  //max level it can be
  private int cap;
  //current experience
  private int experience;
  //total experience needed to level up
  private int expNeeded;
  //how much expNeeded scales by per level
  private int expPerLevel;

  Building(){
    this.name = "unknown";
    this.level = 0;
    this.cap = 0;
    this.experience = 0;
    this.expNeeded = 0;
    this.expPerLevel = 0;
  }

  Building(String name, int newCap, int expPerLevel){
    this.name = name;
    this.level = 0;
    this.cap = newCap;
    this.experience = 0;
    this.expNeeded = 100;
    this.expPerLevel = expPerLevel;
  }

//adds experience to the Building
//increases its level if experience is greater than or equal to expNeeded
  public void upgrade(int experience){
    this.experience += experience;
    if (this.experience >= this.expNeeded){
      this.experience = this.experience - this.expNeeded;
      this.expNeeded = this.level * this.expPerLevel;
      this.level += 1;
    }
  }

}
