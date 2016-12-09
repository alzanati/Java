/**
 * Created by prof on 12/9/2016.
 */

package FactoryMethod;
public class Manager extends IEmployee {
    public Manager() {
        setAge(0);
        setName("None");
        setSex("None");
    }

    @Override
    public String toString() {
        return "Manager";
    }
}
