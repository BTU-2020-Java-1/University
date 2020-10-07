package ge.edu.btu.university;

import ge.edu.btu.university.exception.UniversityException;
import ge.edu.btu.university.student.BachelorStudent;
import ge.edu.btu.university.student.MasterStudent;
import ge.edu.btu.university.student.PhdStudent;
import ge.edu.btu.university.student.Student;
import ge.edu.btu.university.university.University;

import java.time.LocalDate;

public class Runner {

    private static Student bachelor1 = new BachelorStudent("1", "Name 1", LocalDate.of(2000, 5, 20));
    private static Student bachelor2 = new BachelorStudent("2", "Name 2", LocalDate.of(2000, 7, 11));

    private static Student master1 = new MasterStudent("3", "Name 3", LocalDate.of(1998, 4, 7));
    private static Student master2 = new MasterStudent("4", "Name 4", LocalDate.of(1998, 1, 10));

    private static Student phd1 = new PhdStudent("5", "Name 5", LocalDate.of(1995, 3, 10));
    private static Student phd2 = new PhdStudent("6", "Name 6", LocalDate.of(1995, 2, 10));

    private static University university = new University("BTU");

    public static void main(String[] args) {
        addStudents();
        addMarksForStudents();
        try {
            Student student = university.getBestStudent();
            System.out.println(student);
        } catch (UniversityException ex) {
            System.out.println("საუკეთესო სტუდენტის პოვნა ვერ მოხერხდა " + ex.getMessage());
        }
    }

    private static void addMarksForStudents() {
        bachelor1.addMark(95);
        bachelor2.addMark(85);
        master1.addMark(55);
        master2.addMark(65);
        phd1.addMark(88);
        phd2.addMark(99);
        bachelor1.addMark(100);
        master2.addMark(54);

        ((MasterStudent) master1).setAmountOfConferences(3);
        ((MasterStudent) master2).setAmountOfConferences(2);
        ((PhdStudent) phd1).setAmountOfCourses(2);
        ((PhdStudent) phd2).setAmountOfCourses(1);
    }

    private static void addStudents() {
        try {
            university.addStudent(bachelor1);
            university.addStudent(bachelor2);
            university.addStudent(master1);
            university.addStudent(master2);
            university.addStudent(phd1);
            university.addStudent(phd2);
        } catch (UniversityException ex) {
            System.out.println(String.format("სტუდენტის დამატება ვერ მოხერხდა: %s", ex.getMessage()));
        }
    }
}
