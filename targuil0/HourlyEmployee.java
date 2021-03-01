package targuil0;

import java.util.Objects;

public class HourlyEmployee extends Employee
{
int Hours;
float wage;


    public HourlyEmployee()
    {
        super();
        this.wage=0;
        this.Hours=0;
    }

    public HourlyEmployee(String firstName, String famillyName, int teoudatZeout, int hours) {
        super(firstName, famillyName, teoudatZeout);
        Hours = hours;
    }

    public int getHours() {
        return Hours;
    }


    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public void setHours(int hours) {
        Hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() +
                "HourlyEmployee{" +
                "Hours=" + Hours +
                ", wage=" + wage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HourlyEmployee that = (HourlyEmployee) o;
        return Hours == that.Hours &&
                Float.compare(that.wage, wage) == 0;
    }

    @Override
    public double earning() {
        return (double)wage*Hours;
    }
}
