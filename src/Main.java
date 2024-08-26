import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        EducationCenter school = new School("Kyrgyz Schoolda", "Kyrgyzstan", LocalDate.of(1995, 1, 1));
        EducationCenter university = new University("Manasta", "Kyrgyzstan", LocalDate.of(1970, 1, 1));
        EducationCenter college = new College("FinTehte", "Kyrgyzstan", LocalDate.of(2000, 1, 1));


        Student[] students = new Student[10];

        students[0] = new Student("Atai", "Abdurazakov", Gender.MALE, LocalDate.of(2020, 9, 1), school);
        students[1] = new Student("Adilet", "Tolomushov", Gender.FEMALE, LocalDate.of(2019, 9, 1), university);
        students[2] = new Student("Nurdin", "Ismailov", Gender.MALE, LocalDate.of(2018, 9, 1), college);
        students[3] = new Student("Aizada", "Bekmuratova", Gender.FEMALE, LocalDate.of(2021, 9, 1), school);
        students[4] = new Student("Nuradil", "Japarov", Gender.MALE, LocalDate.of(2017, 9, 1), university);
        students[5] = new Student("Gulnur", "Tynalieva", Gender.FEMALE, LocalDate.of(2016, 9, 1), college);
        students[6] = new Student("Babakhan", "Usonov", Gender.MALE, LocalDate.of(2020, 9, 1), school);
        students[7] = new Student("Asylbek", "Omurbekova", Gender.FEMALE, LocalDate.of(2019, 9, 1), university);
        students[8] = new Student("Marat", "Akmatov", Gender.MALE, LocalDate.of(2018, 9, 1), college);
        students[9] = new Student("Aida", "Kerimova", Gender.FEMALE, LocalDate.of(2021, 9, 1), school);


        printAllStudentsInfo(students);
    }

    public static void printAllStudentsInfo(Student[] students) {
        for (Student student : students) {
            if (student != null) {
                student.getStudentsEducationCenter();
                student.getStudentsStudyingYear();
                System.out.println();
            }
        }
    }
}