/**
 * Created by prof on 12/9/2016.
 */

package FactoryMethod;

import java.util.List;

public class Developer extends IEmployee {

    public Developer() {
        Init();
    }

    public void Tasks(List<String> tasks) {

    }

    @Override
    public String toString() {
        return "Developer";
    }
}
