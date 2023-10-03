import java.util.Random;

public class LocalAndGlobal {
    Random random;
    int number;
    public LocalAndGlobal(){
        random = new Random();
        roll();
    }
    private void roll() {
        number = random.nextInt(20);
        System.out.println(number);
    }


    }

