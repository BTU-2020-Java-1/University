package ge.edu.btu.university.student;

import java.time.LocalDate;

public class MasterStudent extends Student {

    private int amountOfConferences;

    public MasterStudent() {}

    public MasterStudent(String personalId, String name, LocalDate birthdate) {
        super(personalId, name, birthdate);
    }

    public int getAmountOfConferences() {
        return amountOfConferences;
    }

    public void setAmountOfConferences(int amountOfConferences) {
        this.amountOfConferences = amountOfConferences;
    }

    @Override
    public double getRank() {
        return getAverageMark() + amountOfConferences * 3;
    }
}
