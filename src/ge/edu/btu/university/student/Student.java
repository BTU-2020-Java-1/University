package ge.edu.btu.university.student;

import java.time.LocalDate;

public abstract class Student {

    private String personalId;

    private String name;

    private LocalDate birthdate;

    private int marksSum;

    private int amountOfMarks;

    public Student() {}

    public Student(String personalId, String name, LocalDate birthdate) {
        this.personalId = personalId;
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getPersonalId() {
        return personalId;
    }
    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public abstract double getRank();

    public void addMark(int mark) {
        marksSum += mark;
        amountOfMarks++;
    }

    protected double getAverageMark() {
        return (double) marksSum / amountOfMarks;
    }

    @Override
    public String toString() {
        return String.format("სახელი: %s; პირადი ნომერი: %s; შეფასება: %s", getName(), getPersonalId(), getRank());
    }
}
