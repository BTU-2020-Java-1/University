package ge.edu.btu.university.student;

import java.time.LocalDate;

public class PhdStudent extends Student {

    private int amountOfCourses;

    public PhdStudent() {}

    public PhdStudent(String personalId, String name, LocalDate birthdate) {
        super(personalId, name, birthdate);
    }

    public int getAmountOfCourses() {
        return amountOfCourses;
    }

    public void setAmountOfCourses(int amountOfCourses) {
        this.amountOfCourses = amountOfCourses;
    }

    @Override
    public double getRank() {
        return getAverageMark() * 90 / 100 + amountOfCourses * 7;
    }
}
