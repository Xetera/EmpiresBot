package bot.discord.game;

import bot.discord.game.resources.Food;
import bot.discord.game.resources.Stone;
import bot.discord.game.resources.Wood;

public class Game {
    // main logic for the game that discord users will be interacting with

    /*
    * Every new server is going to start by making a new instance of this class which will
    * end up getting stored in a database, most likely mySQL just because it's easy.
    * Not sure how we're going to serialize this data but we'll come up with something.
    * */
    private int population;
    private Food food;
    private Wood wood;
    private Stone stone;

    Game(){
        population = 0;
        food = new Food();
        wood = new Wood();
        stone = new Stone();
    }

    @Override
    public String toString(){
        return String.format("population:%s\n", population);
    }
}
