package ge.edu.btu.university.university;

import ge.edu.btu.university.exception.UniversityException;
import ge.edu.btu.university.student.Student;

public interface IUniversity {

    void addStudent(Student student) throws UniversityException;

    Student getBestStudent() throws UniversityException;
}
