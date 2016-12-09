/**
 * Created by prof on 12/9/2016.
 */

package FactoryMethod;

import java.util.List;

public class TeamLeader extends IEmployee {

    public TeamLeader() {
        Init();
    }

    public void Roles(List<String> roles) {

    }

    @Override
    public String toString() {
        return "Team Leader";
    }
}
