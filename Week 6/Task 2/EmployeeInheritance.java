public class EmployeeInheritance {
    public static void main(String[] args) {
        Person person = new Person("John", "123 Main Street", "123-456-7890", "John@gmail.com");
        System.out.println(person.toString());
        Employee employee = new Employee("zee","432 new street","426-728-4281","zee@gmail.com","manhattan office","12/12/12",1050000);
        System.out.println(employee.toString());
        Student student = new Student("chealse","902 old street","786-230-4211","chealse@gmail.com", "freshman");
        System.out.println(student.toString());
        Staff staff = new Staff("joe","873 bond street","533-896-3210","joe@gmail.com","new york office","2/2/23",1090000,"janitor");
        System.out.println(staff.toString());
        Faculty faculty = new Faculty("jane","190 red street","143-724-1639","jane@gmail.com","new jersey office","3/3/34",1100000,"8-5",6);
        System.out.println(faculty.toString());
    }

}
