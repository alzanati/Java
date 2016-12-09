/**
 * Created by prof on 12/9/2016.
 */

package FactoryMethod;
public abstract class IEmployee {

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    /*Sex property*/
    private String Sex;

    /*Name property*/
    private String Name;

    /*Age property*/
    private int Age;

    /*Department*/
    public String Department;

    /*Salary*/
    public double Salary;

    /*init all employee properties*/
    public void Init() {
        setAge(0);
        setName("None");
        setSex("None");
        setDepartment("None");
        setSalary(0.0);
    }
}
