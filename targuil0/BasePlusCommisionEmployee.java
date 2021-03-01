package targuil0;

import java.util.Objects;

public class BasePlusCommisionEmployee extends CommissionEmployee {
    float baseSalarie;

    public BasePlusCommisionEmployee(String firstName, String famillyName, int teoudatZeout,int commision, float grossSales, float baseSalarie) {
        super(firstName, famillyName, teoudatZeout,grossSales,commision);
        this.baseSalarie = baseSalarie;
    }
    public  BasePlusCommisionEmployee(){super();}

    public float getBaseSalarie() {
        return baseSalarie;
    }

    public void setBaseSalarie(float baseSalarie) {
        this.baseSalarie = baseSalarie;
    }

    @Override
    public String toString() {
        return "BasePlusCommisionEmployee{" +
                "baseSalarie=" + baseSalarie +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BasePlusCommisionEmployee that = (BasePlusCommisionEmployee) o;
        return Float.compare(that.baseSalarie, baseSalarie) == 0;
    }

    @Override
    public double earning() {
        return baseSalarie+commission/100*grossSales;
    }
}
