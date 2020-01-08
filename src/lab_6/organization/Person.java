package lab_6.organization;

import lab_6.Address;
import lab_6.FullName;
import lab_6.Gender;
import lab_6.Phone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String title;
    private String givenName;
    private String middleName;
    private String familyName;
    protected FullName name;
    private LocalDate birthDate;
    protected Gender gender;
    private Address homeAddress;
    private Phone phone;
    private List<Hospital> hospitals = new ArrayList<Hospital>();

    public Person(String title, String givenName, String middleName, String familyName, FullName name, LocalDate birthDate,
                  Gender gender, Address homeAddress, Phone phone) {
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.phone = phone;
    }

    public void addHospital(Hospital hospital) {
        hospitals.add(hospital);

    }
}

