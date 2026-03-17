// 88	88_bmi_category.java	Determine BMI category: Underweight / Normal / Overweight / Obese.
public class _88_bmi_category {
    public static void main(String[] args) {
        double weight = 70, height = 1.75;
        double bmi = weight / (height * height);
        System.out.printf("BMI: %.2f%n", bmi);
        if (bmi < 18.5) System.out.println("Category: Underweight");
        else if (bmi < 25) System.out.println("Category: Normal");
        else if (bmi < 30) System.out.println("Category: Overweight");
        else System.out.println("Category: Obese");
    }
}
