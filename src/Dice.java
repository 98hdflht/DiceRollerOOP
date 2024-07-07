import java.util.Arrays;

public class Dice {
    // Activate the dice
    private Die die1;
    private Die die2;
    private String dieResult;

    // Set the initial value
    public Dice() {
        die1 = new Die();
        die2 = new Die();
    }

    // Get the value of each roll
    public int getDie1Value() {
        return die1.getValue();
    }

    public int getDie2Value() {
        return die2.getValue();
    }

    // Add values for special values
    public int getSum() {
        return die1.getValue() + die2.getValue();
    }

    public void roll() {
        die1.roll();
        die2.roll();
    }

    // Get the string for special values
    public String getStatement() {
        if ((die1.getValue() + die2.getValue()) == 7) {
            dieResult = "Craps";
        } else if (die1.getValue() == 1 && die2.getValue() == 1) {
            dieResult = "Snake Eyes";
        } else if (die1.getValue() == 6 && die2.getValue() == 6) {
            dieResult = "Boxcars";
        }
        return dieResult;
    }

    // Print results to console
    public void printRoll() {
        if (getStatement() != null) {
            System.out.println("Die 1: " + die1.getValue() + "\nDie 2: " + die2.getValue() + "\nSum: " + getSum() + "\n" + getStatement());
        }else{
            System.out.println("Die 1: " + die1.getValue() + "\nDie 2: " + die2.getValue() + "\nSum: " + getSum());
        }
    }
}