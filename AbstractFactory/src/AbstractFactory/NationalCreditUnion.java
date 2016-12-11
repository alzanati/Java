/**
 * Created by prof on 12/11/2016.
 */
package AbstractFactory;

// Concrete Factory 2
public class NationalCreditUnion extends ICreditUnionFactory {

    // Concrete Product A2
    public class NationalSavingsAccount implements ISavingsAccount {

        public NationalSavingsAccount() {
            System.out.println("National Savings Account");
        }

        @Override
        public void SavingsAccount() {

        }
    }

    // Concrete Product B2
    public class NationalLoanAccount implements ILoanAccount {

        public NationalLoanAccount() {
            System.out.println("National Loan Account");
        }

        @Override
        public void LoanAccount() {

        }
    }

    //
    @Override
    public ILoanAccount GetLoanAccount() {
        return new NationalLoanAccount();
    }

    @Override
    public ISavingsAccount GetSavingsAccount() {
        return new NationalSavingsAccount();
    }
}
