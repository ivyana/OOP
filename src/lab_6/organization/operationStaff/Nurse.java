package lab_6.organization.operationStaff;

import lab_6.Address;
import lab_6.FullName;
import lab_6.Gender;
import lab_6.Phone;
import lab_6.organization.Department;
import lab_6.organization.Person;

import java.time.LocalDate;

public class Nurse extends OperationsStaff{

    public Nurse(String title, String givenName, String middleName, String familyName, FullName name,
                 LocalDate birthDate, Gender gender, Address homeAddress, Phone phone, Person person, LocalDate joined,
                 String[] education, String[] certification, String[] languages, Department department) {
        super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone, person, joined, education,
                certification, languages, department);
    }


}
