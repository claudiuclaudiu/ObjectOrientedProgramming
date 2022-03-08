package ro.ITSchool;

public class Student extends Persoana {

    public Student(String name, String address, int phoneNumber, String email) {
        super(name, address, phoneNumber, email);


    }

    public String toString() {
        return "Student: " + getName() + " , Address: " + getAddress() + " ,Phone Number: " + getPhoneNumber() + ", Email: " + getEmail();
    }

}
