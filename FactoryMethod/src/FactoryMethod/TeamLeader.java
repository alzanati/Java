/**
 * Created by prof on 12/9/2016.
 */

package FactoryMethod;
public class TeamLeader extends IEmployee {
    public TeamLeader() {
        setSex("None");
        setName("None");
        setAge(0);
    }

    @Override
    public String toString() {
        return "Team Leader";
    }
}
