import java.util.Scanner;

public class HW16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        float h = scn.nextFloat();
        float r = scn.nextFloat();

        System.out.println((Math.PI*r*r*h));

    }
}
