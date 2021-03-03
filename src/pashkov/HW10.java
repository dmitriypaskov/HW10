package pashkov;

import java.util.Arrays;

public class HW10 {

    public static void main(String[] args) {
        // 1) Calculate and display the amount of the check for 4 positions:
        // Green apple 186g / 25.90
        // Red apple 146g / 26.90
        // Banana 186g / 32.80
        // Lemon 246g / 34.90

        Fruit[] fruits = new Fruit[4];
        Fruit greenApple = new Fruit();
        greenApple.setType(Fruit.Type.APPLE);
        greenApple.setColor(Color.GREEN);
        greenApple.setWeight(186);
        greenApple.setPrice(25.90);
        fruits[0] = greenApple;
        Fruit redApple = new Fruit(Fruit.Type.APPLE, Color.RED, 146, 26.90);
        fruits[1] = redApple;
        Fruit banana = new Fruit(Fruit.Type.BANANA, Color.YELLOW, 186, 32.80);
        fruits[2] = banana;
        Fruit lemon = new Fruit(Fruit.Type.LEMON, Color.YELLOW, 246, 34.90);
        fruits[3] = lemon;
        System.out.println(Arrays.toString(fruits));
        double sum = 0;
        for (Fruit fruit : fruits) {
            sum += fruit.calculatePrice();
        }
        System.out.printf("Total payable : %.2f hrivnocheck .", sum);
    }
}

