import java.util.Random;

public class Dice {
    public int face=12;

    public void Roll(){
        Random rand = new Random();
        int rand_dice = rand.nextInt(face)+1;
        System.out.println("The number is:"+rand_dice);
    }
}
