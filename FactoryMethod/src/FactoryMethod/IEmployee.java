/**
 * Created by prof on 12/9/2016.
 */

package FactoryMethod;
public abstract class IEmployee {
    /*Name property*/
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    /*Sex property*/
    private String Sex;

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }
    /*Age property*/
    private int Age;

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
