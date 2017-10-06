import java.util.Scanner;

public class HW12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double n = scn.nextDouble();
        int pi = scn.nextInt();


        System.out.println(Math.round(n*Math.pow(10,pi))/Math.pow(10,pi));
    }

}
