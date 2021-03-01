package targuil0;
import java.util.Objects;
public class CommissionEmployee extends Employee
{
    float grossSales;
    int commission;
    public CommissionEmployee(String firstName, String famillyName, int teoudatZeout, float grossSales,int commission)
    {
        super(firstName, famillyName, teoudatZeout);
        this.grossSales = grossSales;
        this.commission=commission;
    }
    public CommissionEmployee(){}

    public double earning(){return commission*100/grossSales;};


    public float getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(float grossSales) {
        if (grossSales<0)
        {
            this.grossSales=0;
        }
        this.grossSales = grossSales;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
      if (commission<0)
      {
          this.commission=0;
      }
        this.commission = commission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CommissionEmployee that = (CommissionEmployee) o;
        return Float.compare(that.grossSales, grossSales) == 0 &&
                commission == that.commission;
    }


    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "grossSales=" + grossSales +
                ", commission=" + commission +
                '}';
    }
}

