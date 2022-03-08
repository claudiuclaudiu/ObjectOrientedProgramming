package ro.ITSchool;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Khalifa", "Abu Dhabi", +971111222, "khalifa@gmail.ae");
        System.out.println(student);


        PersonalFacultate personalFacultate = new PersonalFacultate("ileana", "oradea", 259314315, "ileaan@gmail.com", true, 1400, "Decan");
        System.out.println(personalFacultate);

    }
}
