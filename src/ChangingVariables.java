import java.util.Scanner;

public class ChangingVariables {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double salary;
        double annualIncrease = 0.10;
        int years;

        System.out.print("What is your salary?: ");
        salary = kb.nextDouble();
        System.out.print("How many years would you like to calculate?: ");
        years = kb.nextInt();

        for (int i = 1; i <= years; i++){
            salary = salary + (salary * annualIncrease);
            System.out.println("Your salary after " + i + " year is: " + salary);
        }

/*
        float currentIncome = 62000F;
        float annualIncrease = 0.10F;

        currentIncome = currentIncome + (currentIncome * annualIncrease);
        System.out.println("Salary after 1 year is: " + currentIncome);

        currentIncome = currentIncome + (currentIncome * annualIncrease);
        System.out.println("Salary after 2 years is: " + currentIncome);

        currentIncome = currentIncome + (currentIncome * annualIncrease);
        System.out.println("Salary after 3 years is: "+ currentIncome);

        currentIncome = currentIncome + (currentIncome * annualIncrease);
        System.out.println("Salary after 4 years is: " + currentIncome);

        currentIncome   = currentIncome + (currentIncome * annualIncrease);
        System.out.println("salary after 5 years is: " + currentIncome);
*/

    }
}
