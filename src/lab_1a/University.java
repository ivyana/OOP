package lab_1a;

public class University {
    public String name;
    public int foundationYear;
    public Student[] students;


    public University(String name,
                   int foundationYear, Student[] students)
    {
        this.name = name;
        this.foundationYear = foundationYear;
        this.students = students;
    }

    public String getName()
    {
        return name;
    }

    public int getFoundationYear()
    {
        return foundationYear;
    }

    public Student[] getStudents()
    {
        return students;
    }
}
