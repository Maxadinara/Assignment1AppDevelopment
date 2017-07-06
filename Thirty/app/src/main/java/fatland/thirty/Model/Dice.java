package fatland.thirty.Model;
import java.util.Random;

/**
 * Created by Mattias Hansen on 2017-07-06.
 * This class is to represent a dice.
 * Taking in the number of sides of the dice and controling if the dice is allowed to be rolled.
 */

public class Dice {

    private int diceSide;
    private boolean rollable = false;
    Random roller;

    /**
     * Constructure that takes in the number of sides of the diece. If it is allowed to be rolled
     * and a Random object to use for rolling.
     * @param diceSide
     * @param rollable
     * @param roller
     */
    public Dice(int diceSide, boolean rollable, Random roller){
        this.diceSide = diceSide;
        this.rollable = rollable;
        this.roller = roller;
    }

    /**
     * Constructure that takes in the number of sides of the diece.,
     * And a Random object to use for rolling.
     * @param diceSide
     * @param roller
     */
    public Dice(int diceSide, Random roller){
        this.diceSide = diceSide;
        this.roller = roller;
    }

    /**
     * Getter for rollable.
     * @return
     */
    public boolean getRollable(){
        return rollable;
    }

    /**
     * Setter for rollable.
     * @param rollable
     */
    public void setRollable(boolean rollable){
        this.rollable = rollable;
    }

    /**
     * Method that rolls the dice and returns the result of that roll.
     * @return
     */
    public int roll(){
        int roll = roller.nextInt(diceSide) + 1;

        return roll;
    }
}
