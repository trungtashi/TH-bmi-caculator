import java.util.Scanner;

public class bmi_caculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Your weight (in kilogam): ");
        weight = scanner.nextDouble();

        System.out.println("Your height (in meter): ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);

        if(bmi < 18){
            System.out.println(bmi + " Underweight");
        } else if (bmi < 25) {
            System.out.println(bmi + " Normal");
        } else if (bmi < 30) {
            System.out.println(bmi + " Overweight");
        }
        else {
            System.out.println(bmi + " Obese");
        }
    }
}
