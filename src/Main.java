public class Main {
    public static void main(String[] args) {

        Client client = new Client();

        client.setName("Ariel");
        client.setAge(30);
        client.setPhoneNumber(5555999);
        client.setCredit(5000.90);

        System.out.println("Client Name: " + client.getName());
        System.out.println("Client Age: " + client.getAge());
        System.out.println("Client Phone Number: " + client.getPhoneNumber());
        System.out.println("Client Credit: " + client.getCredit() + "$");


        Employee employee = new Employee();

        employee.setName("Carlos");
        employee.setAge(45);
        employee.setPhoneNumber(5050555);
        employee.setSalary(4000.50);

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee Phone Number: " + employee.getPhoneNumber());
        System.out.println("Employee Salary: " + employee.getSalary() + "$");

    }

}

class Person{
    private int Age;
    private String Name;
    private int phoneNumber;

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}

class Client extends Person{
    private double Credit;

    public void setCredit(double Credit) {
        this.Credit = Credit;
    }

    public double getCredit() {
        return Credit;
    }
}

class Employee extends Person{
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}