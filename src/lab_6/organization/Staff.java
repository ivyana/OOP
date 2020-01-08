package lab_6.organization;

import lab_6.Address;
import lab_6.FullName;
import lab_6.Gender;
import lab_6.Phone;

import java.time.LocalDate;

public class Staff extends Person {
    private LocalDate joined;
    private String[] education;
    private String[] certification;
    private String[] languages;
    private Department department;


    public Staff(String title, String givenName, String middleName, String familyName, FullName name, LocalDate birthDate,
                 Gender gender, Address homeAddress, Phone phone, Person person, LocalDate joined, String[] education, String[] certification, String[] languages, Department department) {
        super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone);
        this.joined = joined;
        this.education = education;
        this.certification = certification;
        this.languages = languages;
        this.department = department;
    }
}
