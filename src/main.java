/**
 * Created by prof on 12/9/2016.
 */

import FactoryMethod.*;

public class main {

    public static void main(String[] args) {
        EmployeeFactory employee = new EmployeeFactory();
        IEmployee me = employee.GetEmployee("team leader");

        System.out.println(me.toString());
    }
}
