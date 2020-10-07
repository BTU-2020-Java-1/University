package ge.edu.btu.university.university;

import ge.edu.btu.university.exception.UniversityException;
import ge.edu.btu.university.student.Student;

public class University implements IUniversity {

    private String name;

    private Student[] students = new Student[100];

    private int studentsAmount;

    public University() {}

    public University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student) throws UniversityException {
        if (studentsAmount == 100) {
            throw new UniversityException("University is fool");
        }
        students[studentsAmount] = student;
        studentsAmount++;
    }

    public Student getBestStudent() throws UniversityException {
        if (studentsAmount == 0) {
            throw new UniversityException("There are no students in university");
        }

        Student best = students[0];
        for (int i = 1; i < studentsAmount; i++) {
            if (students[i].getRank() > best.getRank()) {
                best = students[i];
            }
        }
        return best;
    }
}
