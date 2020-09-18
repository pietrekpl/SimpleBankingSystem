import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class Mortgage extends Credit {
    public final static BigDecimal OWN_RESOURCE_RATIO = BigDecimal.valueOf(0.2);
    public final static BigDecimal MORTGAGE_RATIO = BigDecimal.valueOf(1.6);
    public final static BigDecimal MONTHS = BigDecimal.valueOf(12);


    public void makeMortgage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter property final Value : ");
        BigDecimal propertyValue = scanner.nextBigDecimal();
        System.out.println("Our bank requires own resources with the Value of the 20% of the property final Value.");
        System.out.println("So, have you " + propertyValue.multiply(OWN_RESOURCE_RATIO) + "zł of your own resources ?");
        System.out.println("yes"+"\\"+"no");
        String answer = scanner.next();
        if (answer.toLowerCase().equals("no")) {
            System.out.println("Sorry, we cannot grant you a mortgage");
            return;
        } else {
            System.out.println("Please fill in further information :");
        }
        System.out.println("Please enter your monthly Net income :");
        BigDecimal income = scanner.nextBigDecimal();
        System.out.println("Enter your all monthly expenses :");
        BigDecimal expenses = scanner.nextBigDecimal();
        System.out.println("Within how many years are will to pay Mortgage ? :");
        BigDecimal years = scanner.nextBigDecimal();
        BigDecimal availible = income.subtract(expenses);
        BigDecimal totalMortgageCost = propertyValue.multiply(MORTGAGE_RATIO);
        BigDecimal proposalOfMonthlyPayment = (totalMortgageCost.divide(years, RoundingMode.HALF_UP)
                .divide(MONTHS, RoundingMode.HALF_UP));
        if (proposalOfMonthlyPayment.doubleValue() <= availible.doubleValue()){
            System.out.println("We can grant you a mortgage");
        }else {
            System.out.println("Sorry, we cannot grant you a credit");
            System.out.println("Reason : Proposal of monthly mortgage payment "+proposalOfMonthlyPayment + " is higher than your monthly resources : "+ availible);
        }
    }
}
