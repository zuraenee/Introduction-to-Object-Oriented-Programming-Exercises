public class Faculty extends Employee{
    private String officeHours;
    private int rank;

    public Faculty(String name, String adress, String phoneNumber, String email, String office, String dateHired, int Salary, String officeHours, int rank){
        super(name, adress, phoneNumber, email, office, dateHired, Salary);
        this.officeHours= officeHours;
        this.rank= rank;
    }

    public String getOfficeHours(){
        return officeHours;
    }
    public int getRank(){
        return rank;
    }
    public void setOfficeHours(String officeHours){
        this.officeHours= officeHours;
    }
    public void setRank(int rank){
        this.rank= rank;
    }
    public String toString(){
        return super.toString() + " Office Hours: " + officeHours + " Rank: " + rank;
    }
}
