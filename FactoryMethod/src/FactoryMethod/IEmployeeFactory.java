/**
 * Created by prof on 12/9/2016.
 */

package FactoryMethod;
public interface IEmployeeFactory {
    /*Return Correct Employee Type According To Info*/
    public IEmployee GetEmployee (String Info);
}
