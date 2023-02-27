public class Person {
    private String name, adress, phoneNumber, email;

    public Person(String name, String adress, String phoneNumber, String email){
        this.name= name;
        this.adress= adress;
        this.phoneNumber= phoneNumber;
        this.email= email;
    }

    public String getName(){
        return name;
    }

    public String getAdress(){
        return adress;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmail(){
        return email;
    }
    public String toString(){
        return "Name: " + name + " Adress: " + adress + " Phone Number: " + phoneNumber + " Email: " + email;
    }
}
