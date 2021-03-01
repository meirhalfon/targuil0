package  targuil0;

import java.util.Objects;

public abstract  class Employee
{
    String FirstName;
    String FamillyName;
    int TeoudatZeout;


    public Employee(String firstName, String famillyName, int teoudatZeout)
    {
        FirstName = firstName;
        FamillyName = famillyName;
        TeoudatZeout = teoudatZeout;
    }

    public Employee()
    {
        FirstName="plony";
        FamillyName="almony";

    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getFamillyName() {
        return FamillyName;
    }

    public void setFamillyName(String famillyName) {
        FamillyName = famillyName;
    }

    public int getTeoudatZeout() {
        return TeoudatZeout;
    }

    public void setTeoudatZeout(int teoudatZeout) {
        TeoudatZeout = teoudatZeout;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "FirstName='" + FirstName + '\'' +
                ", FamillyName='" + FamillyName + '\'' +
                ", TeoudatZeout=" + TeoudatZeout +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return TeoudatZeout == employee.TeoudatZeout &&
                Objects.equals(FirstName, employee.FirstName) &&
                Objects.equals(FamillyName, employee.FamillyName);
    }
    public  abstract  double earning();

}
