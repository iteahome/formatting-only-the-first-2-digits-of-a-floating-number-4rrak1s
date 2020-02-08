import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Print2Digits {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number, preferably one with more than 2 decimals.");
        Double input = sc.nextDouble();

    DecimalFormat PointTwo = new DecimalFormat("#.##");

    //to prevent rounding up from happening, always rounding down is the best option (i think)
    PointTwo.setRoundingMode(RoundingMode.DOWN);

        System.out.println("Let's just make things shorter: " + PointTwo.format(input));

    }

}