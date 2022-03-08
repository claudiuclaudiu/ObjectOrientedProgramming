package ro.ITSchool;

public class PersonalFacultate extends Angajat {
    private String titlu;

    public PersonalFacultate(String name, String address, int phoneNumber, String email, boolean office, int salary, String titlu) {
        super(name, address, phoneNumber, email, office, salary);
        this.titlu = titlu;
    }
    public String toString(){
        return  "Student: " + getName() + " , Address: " + getAddress() + " ,Phone Number: " + getPhoneNumber() + ", Email: " + getEmail() + ", Salary: "+ getSalary() + " Titlu: "+ getTitlu();
    }

    public String getTitlu() {
        return titlu;
    }
}
