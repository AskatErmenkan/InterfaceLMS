import java.time.LocalDate;

public class Student implements Study {
    private String name;
    private String surname;
    private Gender gender;
    private LocalDate dateOfStart;
    private EducationCenter educationCenter;

    public Student(String name, String surname, Gender gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }

    @Override
    public void getStudentsEducationCenter() {
        System.out.println(name + " " + surname + " " + educationCenter.getName() + " okuit.");
    }

    @Override
    public void getStudentsStudyingYear() {
        int studyingYears = LocalDate.now().getYear() - dateOfStart.getYear();
        System.out.println("okup jatakanyna " + studyingYears + " jyl boldu");
    }
}