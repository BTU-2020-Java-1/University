package ge.edu.btu.university.student;

import java.time.LocalDate;

public class BachelorStudent extends Student {

    public BachelorStudent() {}

    public BachelorStudent(String personalId, String name, LocalDate birthdate) {
        super(personalId, name, birthdate);
    }

    @Override
    public double getRank() {
        return getAverageMark();
    }
}
