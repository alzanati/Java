/**
 * Created by prof on 12/11/2016.
 */
package AbstractFactory;

// Concrete factory 1
public class CitiCreditUnion extends ICreditUnionFactory {

    // Concrete Product A1
    public class CitiLoanAccount implements ILoanAccount {

        public CitiLoanAccount() {
            System.out.println("Returned Citi Loan Account");
        }

        @Override
        public void LoanAccount() {

        }
    }

    // Concrete Product B1
    public class CitiSavingsAccount implements ISavingsAccount {

        public CitiSavingsAccount() {
            System.out.println("Returned Citi Savings Account");
        }

        @Override
        public void SavingsAccount() {

        }
    }

    @Override
    public ILoanAccount GetLoanAccount() {
        return new CitiLoanAccount();
    }

    @Override
    public ISavingsAccount GetSavingsAccount() {
        return new CitiSavingsAccount();
    }
}
