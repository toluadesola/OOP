package decagon.tolulope.ENCAPSULATION;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void looseHealth(int damage) {
        this.health -= damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
            //Reduce number of lives remaining for player
        }
    }

    public  int healthRemaining(){
        return health;
    }
}
