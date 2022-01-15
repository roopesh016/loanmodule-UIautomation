package locators;



public class LoanCalculatorElementLocators {

    public static String  applicationTypeSingle = "[for='application_type_single']";
    public static String  applicationTypeJoint = "[for='application_type_joint']";
    public static String  numberOfDependents = "[title='Number of dependants']";
    public static String  homeLiveIn="[for='borrow_type_home']";
    public static String  borrowTypeInvestment="[for='borrow_type_investment']";
    public static String  annualIncome="[aria-labelledby='q2q1']";
    public static String  otherIncome="[aria-labelledby='q2q2']";
    public static String  monthlyLivingExpenses="[aria-labelledby='q3q1']";
    public static String  homeLoanRepayments="[aria-labelledby='q3q2']";
    public static String  otherLoanRepayments="[aria-labelledby='q3q3']";
    public static String  otherCommitments="[aria-labelledby='q3q4']";
    public static String  totalCreditCardLimits="[aria-labelledby='q3q5']";
    public static String  borrowResultTextAmount=".borrow__result__text__amount";
    public static String  borrowAmountBtn=".borrow__calculate .btn";
    public static String  startOverBtn="[aria-label='Start over']";
    public static String  borrowErrorText=".borrow__error__text";
}
