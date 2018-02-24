package bot.discord.game.buildings;

public class Wall extends Building{
  int defense;

  public Wall(){
    this.defense = 0;
    super("wall", 20, 2);
  }

  public Wall(int defense){
    this.defense = defense;
    super("wall", 20, 2);
  }

//returns defense total
  public int defenseAmount(){
    return defense;
  }

  @Override
  public void upgrade(int experience){
    this.experience += experience;
    if (this.experience >= this.expNeeded){
      this.experience = this.experience - this.expNeeded;
      this.expNeeded = this.level * this.expPerLevel;
      this.level += 1;
      if (this.level < 6){
        this.defense += 4;
      } else if (this.level < 11) {
        this.defense += 5;
      } else if (this.level < 16) {
        this.defense += 6;
      } else {
        this.defense += 7;
      }
    }
  }

}
