/**
 * Created by prof on 12/11/2016.
 */
package AbstractFactory;

public abstract class ICreditUnionFactory {

    // Product A
    public abstract ILoanAccount GetLoanAccount();

    // Product B
    public abstract ISavingsAccount GetSavingsAccount();
}
