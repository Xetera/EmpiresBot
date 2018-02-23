package bot.discord.game.resources;

// we don't instantiate this class, it's just
// a template for other classes
public abstract class Resource {
    // not sure if the name thing here is necessary tbh
    private String name;
    private int total;
    private int cap;
    // not sure how this income thing is going
    // to work out since we can't set an interval
    // or anything like that
    private int income;

    Resource(String name){
        this.name   = name;
        this.total  = 0;
        this.cap    = 0;
        this.income = 0;
    }

    // getters and setters for the total amount
    // we want to be using these methods to manipulate
    // resources, instead of trying to change them directly.
    public void add(int amount){
        int newAmount = this.total += amount;
        if (newAmount > this.cap)
            return;
        this.total = newAmount;
    }

    public void spend(int amount) {
        int newAmount = this.total -= amount;
        if (newAmount < 0)
            return;
        this.total = newAmount;
    }

    public void setCap(int cap){
        this.cap = cap;
    }

    public void addCap(int cap){
        this.cap += cap;
    }

    // overriding the default method for turning something into
    // a string so we can see the string representation when
    // we do resource.toString(); without accessing the
    // `total` variable of the class
    @Override
    public String toString(){
        return this.name + " : " +  this.total;
    }
}
