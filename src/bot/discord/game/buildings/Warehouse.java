package bot.discord.game.buildings;

public class Warehouse extends Building{

  int maxResources;

  public Warehouse(){
    maxResources = 1000;
    super("warehouse", 30, 2);
  }

  public int max(){
    return maxResources;
  }

  @Override
  public void upgrade(int experience){
    this.experience += experience;
    if (this.experience >= this.expNeeded){
      this.experience = this.experience - this.expNeeded;
      this.expNeeded = this.level * this.expPerLevel;
      this.level += 1;
    }
    maxResources += this.level * 100;
  }

}
