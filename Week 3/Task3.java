class Person {
    private String name;
    private String surname;
    private int age;

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String details() {
        return this.getName() + " " + this.getSurname() + " years " + this.getAge();
    }
}

public class PersonTest {
    public static void main(String args[]) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = person2;

        person1.setName("Daniel");
        person1.setSurname("Smith");
        person1.setAge(18);

        person2.setName("Ben");
        person2.setSurname("Seager");
        person2.setAge(19);

        System.out.println(person1.details());
        System.out.println(person2.details());
        System.out.println(person3.details());
    }
}
