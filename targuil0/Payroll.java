
package  targuil0;
public class Payroll {
   public static void main(String[] args) {

    Employee[] employees=new Employee[3];
        employees[0]=new HourlyEmployee();
        employees[1]=new CommissionEmployee();
        employees[2]=new BasePlusCommisionEmployee();
       for (int i = 0; i < 3; i++)
       {
           employees[i].toString();

       }

       employees[0]=new HourlyEmployee("meir","halfon",1325129,16);
       employees[1]=new CommissionEmployee("meir","halfon",1325129,3/10,10);
       employees[2]=new BasePlusCommisionEmployee("meir","halfon",1325129,2,43/2,3);
       for (int i = 0; i < 3; i++)
       {
           System.out.println(employees[i].toString());
           
       }
    }
}
