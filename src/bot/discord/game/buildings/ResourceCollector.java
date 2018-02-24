package bot.discord.game.buildings;

public class ResourceCollector extends Building{

  public ResourceCollector(){
    //change ints later
    super("resource collector", 30, 2);
  }

  public ResourceCollector(String resource){
    //change ints later
    super(resource, 30, 2);
  }

//returns how much of a resource is collected
  public int collect(){
    //100 per level
    return 100 * super.level;
  }

}
