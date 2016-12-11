/**
 * Created by prof on 12/9/2016.
 */
import AbstractFactory.*;

public class main {

    public static void main(String[] args) {
        ICreditUnionFactory citiUnion = CreditUnionFactoryProvider.GetCreditUnionFactory("CITI");
        citiUnion.GetLoanAccount();
    }
}
