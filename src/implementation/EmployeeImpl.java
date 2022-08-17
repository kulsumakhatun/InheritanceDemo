package implementation;

import data.Address;
import data.Employee;

public class EmployeeImpl {

    public static void main(String[] args) {
        Address address = new Address(410, " Kolar road", "Bhopal", "India",462021);
        Employee obj = new Employee("Vaibhav", "05.11.1983",38, address);
        obj.display();
        //obj.setAddress(// i have to call the constructor of Address class);
        Address updatedAddress = new Address(510,"kolar road","Bhopal", "India", 462021);
        //obj.setAddress(updatedAddress);
       // System.out.println("employee display");
        //obj.display();
        // to only update the house number, what should we do?
        // get the address reference
        // using that reference update house number
        Address currentAddress = obj.getAddress();
        //update the house number
        currentAddress.setHouseNumber(510);
        currentAddress.setStreet("Main road no 1");
        obj.display();
//obj.getAddress(); this line will take 10 sec

        //updating house number
        obj.getAddress().setHouseNumber(610);
        obj.getAddress().setStreet("By pass road");
        obj.display();

        // updating employee
        obj.setName("Ramesh");
        obj.display();

        // processing employee name -> check whether name starts with capital letter
        char  firstChar = obj.getName().charAt(0);
        if(firstChar>=65 && firstChar<=90){
            System.out.println("upper case");
        }



    }
}
