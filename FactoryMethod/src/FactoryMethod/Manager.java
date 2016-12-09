/**
 * Created by prof on 12/9/2016.
 */

package FactoryMethod;

import java.util.List;

public class Manager extends IEmployee {

    public Manager() {
        Init();
    }

    public void Orders(List<String> orders) {

    }

    @Override
    public String toString() {
        return "Manager";
    }
}
