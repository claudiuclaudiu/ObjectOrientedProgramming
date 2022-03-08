package ro.ITSchool;

public class MembruFacultate extends Angajat {
    private int oreBirou;
    private String rank;

    public MembruFacultate(String name, String address, int phoneNumber, String email, boolean office, int salary, int oreBirou, String rank) {
        super(name, address, phoneNumber, email, office, salary);
        this.oreBirou = oreBirou;
        this.rank = rank;
    }

    public int getOreBirou() {
        return oreBirou;
    }

    public void setOreBirou(int oreBirou) {
        this.oreBirou = oreBirou;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
