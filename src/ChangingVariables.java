public class ChangingVariables {
    public static void main(String[] args)
    {
        /*
        Begin
            current income = 62000
            annual increase = 0.10
            new income = base income
            index = 1

            loop as long as index is less than 6
            current income = current income + (current income * 0.10)
            display index as year + current income

            index = index + 1
        End

        */

        double currentIncome = 62000;
        double annualIncrease = 0.10;

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
        

    }
}
