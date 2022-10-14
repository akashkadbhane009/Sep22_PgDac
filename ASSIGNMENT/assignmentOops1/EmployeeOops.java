/*
 * Assignment OOPS
 * @006_Akash Kadbhaen_JH
 * 
 */

abstract class Employee {
        double HRA = 1.7;
        private int empId;
        private String name;

        public abstract double getSalary();

        public Employee(int empId, String name) {
                this.empId = empId;
                this.name = name;
                setEmpId(empId);
                setName(name);

        }

        public int getEmpId() {
                return this.empId;
        }

        public void setEmpId(int empId) {
                this.empId = empId;
        }

        public String getName() {
                return this.name;
        }

        public void setName(String name) {
                this.name = name;
        }

}

class RegularEmp extends Employee {
        double basicPay;

        public RegularEmp(int empId, String name, double basicPay) {
                super(empId, name);
                this.basicPay = basicPay;
                setBasicPay(basicPay);
        }

        public double getBasicPay() {
                return this.basicPay;
        }

        public void setBasicPay(double basicPay) {
                this.basicPay = basicPay;
        }

        @Override
        public double getSalary() {
                double GrossSalary = (basicPay * HRA);
                return GrossSalary;
        }

        public void printDetails() {
                System.out.println("Employee ID : "+getEmpId());
                System.out.println("Employee Name : "+getName());
                System.out.println("Gross Salary : "+getSalary()+"Rs.");
        }

}

abstract class ContractEmp extends Employee {
        int cYear;

        public ContractEmp(int empId, String name, int cYear) {
                super(empId, name);
                this.cYear = cYear;
                setcYear(cYear);
        }

        public int getcYear() {
                return this.cYear;
        }

        public void setcYear(int cYear) {
                this.cYear = cYear;
        }

}

class CdacCEmp extends ContractEmp {
        double cSalary;

        public CdacCEmp(int empId, String name, int cYear, double cSalary) {
                super(empId, name, cYear);
                this.cSalary = cSalary;
                setcSalary(cSalary);
        }

        public double getcSalary() {
                return this.cSalary;
        }

        public void setcSalary(double cSalary) {
                this.cSalary = cSalary;
        }

        @Override
        public double getSalary() {
                double GrossSalary = (cSalary * HRA);
                return GrossSalary;

        }

        public void printDetails() {
                System.out.println("Employee ID : "+getEmpId());
                System.out.println("Employee Name : "+getName());
                System.out.println("Contract Years : "+getcYear()+"years");
                System.out.println("Gross Salary : "+getSalary()+"Rs.");
        }

}

class ThirdPartyEmp extends ContractEmp {
        double payout;

        public ThirdPartyEmp(int empId, String name, int cYear, double payout) {
                super(empId, name, cYear);
                this.payout = payout;
                setPayout(payout);
        }

        public double getPayout() {
                return this.payout;
        }

        public void setPayout(double payout) {
                this.payout = payout;
        }

        @Override
        public double getSalary() {
                double GrossSalary = (payout * HRA);
                return GrossSalary;

        }

        public void printDetails() {
                System.out.println("Employee ID : "+getEmpId());
                System.out.println("Employee Name : "+getName());
                System.out.println("Contract Years : "+getcYear()+"years");
                System.out.println("Gross Salary : "+getSalary()+"Rs.");
        }

}

public class EmployeeOops {
        public static void main(String[] args) {
                RegularEmp ob1 = new RegularEmp(10001, "Akash kadbhane", 15000.00);
                ob1.printDetails();
                System.out.println("==========================================================");
                CdacCEmp ob2 = new CdacCEmp(10002, "Jhon Wick", 3, 20000.00);
                ob2.printDetails();
                System.out.println("==========================================================");
                ThirdPartyEmp ob3 = new ThirdPartyEmp(10003, "Peaky Blinders", 4, 30000.00);
                ob3.printDetails();
                System.out.println("==========================================================");
        }


}
/*OUTPUT
 * 
Employee ID : 10001
Employee Name : Akash kadbhane
Gross Salary : 25500.0Rs.
==========================================================
Employee ID : 10002
Employee Name : Jhon Wick
Contract Years : 3years
Gross Salary : 34000.0Rs.
==========================================================
Employee ID : 10003
Employee Name : Peaky Blinders
Contract Years : 4years
Gross Salary : 51000.0Rs.
==========================================================
 * 
 */
