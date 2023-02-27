public class Student extends Person{
    private String status;
    public Student(String name, String adress, String phoneNumber, String email, String status){
        super(name, adress, phoneNumber, email);
        this.status= status;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status= status;
    }
    public String toString(){
        return super.toString() + " Status: " + status;
    }
}
