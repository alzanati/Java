/**
 * Created by prof on 12/9/2016.
 */

package FactoryMethod;
public class EmployeeFactory implements IEmployeeFactory {

    @Override
    public IEmployee GetEmployee(String info) {
        if (info.toLowerCase().contains("manager")) {
            return new Manager();
        }
        else if (info.contains("developer")) {
            return new Developer();
        }
        else if (info.contains("team leader")) {
            return new TeamLeader();
        }
        else {
            throw new UnsupportedOperationException();
        }
    }
}
