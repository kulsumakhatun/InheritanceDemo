package data;

public class Employee {
    private String name;
    private String dob;
    private int age;
    private Address address;


    public Employee(String name, String dob, int age, Address address) {
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display(){
        System.out.println("Employee Details");
        System.out.println("name = " + name);
        System.out.println("dob = " + dob);
        System.out.println("age = " + age);
       address.display();
    }


}
