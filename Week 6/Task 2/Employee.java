public class Employee extends Person{
    private String office, dateHired;
    private int Salary;

    public Employee(String name, String adress, String phoneNumber, String email, String office, String dateHired, int Salary){
        super(name, adress, phoneNumber, email);
        this.office= office;
        this.dateHired= dateHired;
        this.Salary= Salary;
    }

    public String getOffice(){
        return office;
    }
    public String getDateHired(){
        return dateHired;
    }
    public int getSalary(){
        return Salary;
    }
    public void setOffice(String office){
        this.office= office;
    }
    public void setDateHired(String dateHired){
        this.dateHired= dateHired;
    }
    public void setSalary(int Salary){
        this.Salary= Salary;
    }
    public String toString(){
        return super.toString() + " Office: " + office + " Date Hired: " + dateHired + " Salary: " + Salary;
    }
}
