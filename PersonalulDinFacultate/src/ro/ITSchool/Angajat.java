package ro.ITSchool;

public class Angajat extends Persoana {
    private boolean office;
    private int salary;
    private MyDate joiningDate;


    public Angajat(String name, String address, int phoneNumber, String email, boolean office, int salary) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public boolean isOffice() {
        return office;
    }

    public void setOffice(boolean office) {
        this.office = office;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public MyDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(MyDate joiningDate) {
        this.joiningDate = joiningDate;
    }
}
