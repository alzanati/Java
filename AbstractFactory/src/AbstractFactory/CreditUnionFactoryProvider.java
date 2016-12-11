/**
 * Created by prof on 12/11/2016.
 */
package AbstractFactory;

// Provider For Factory
public class CreditUnionFactoryProvider {

    public static ICreditUnionFactory GetCreditUnionFactory(String acctNo) {
        if (acctNo.toLowerCase().contains("citi")) {
            return new CitiCreditUnion();
        }
        else if (acctNo.toLowerCase().contains("national")) {
            return new NationalCreditUnion();
        }
        else {
            throw new UnsupportedOperationException();
        }
    }
}
