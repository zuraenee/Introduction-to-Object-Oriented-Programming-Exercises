public class Staff extends Employee{
    private String title;
    public Staff(String name, String adress, String phoneNumber, String email, String office, String dateHired, int Salary, String title){
        super(name, adress, phoneNumber, email, office, dateHired, Salary);
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title= title;
    }
    public String toString(){
        return super.toString() + " Title: " + title;
    }
}
