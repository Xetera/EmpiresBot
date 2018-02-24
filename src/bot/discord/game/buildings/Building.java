
public abstract class Building {
  private String name;
  private int level;
  private int cap;
  private int experience;
  private int expNeeded;
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
    this.expNeeded = 0;
    this.expPerLevel = expPerLevel;
  }

  public void upgrade(int experience){
    this.experience += experience;
    if (this.experience >= this.expNeeded){
      this.experience = this.experience - this.expNeeded;
      this.expNeeded = this.level * this.expPerLevel;
      this.level += 1;
    }
  }

}
