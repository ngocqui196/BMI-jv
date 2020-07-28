import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("You weight (in kilogram):");
        weight = sc.nextDouble();
        System.out.println("You height (in metter):");
        height = sc.nextDouble();
        bmi = weight/ Math.pow(height,2);


        System.out.printf("%-20s%s","BMI","Interprestation\n");
        if (bmi < 18) {
            System.out.printf("%-20.2f%s",bmi,"Under weigth");
        }else if (bmi < 25.0){
            System.out.printf("%-20.2f%s", bmi,"Nomal");
        }else if (bmi < 30.0){
            System.out.printf("%-20.2f%s",bmi,"Over weight");
        }else {
            System.out.printf("%-20.2f%s", bmi,"Obese");
        }
    }
}
