/**
 * Created by prof on 12/9/2016.
 */

package FactoryMethod;
public class Developer extends IEmployee {
    public Developer() {
        setSex("None");
        setName("None");
        setAge(0);
    }

    @Override
    public String toString() {
        return "Developer";
    }
}
