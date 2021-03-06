package lab_6.organization;

import lab_6.Address;
import lab_6.Phone;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private Address address;
    private Phone phone;
    private List<Person> persons = new ArrayList<Person>();
    private List<Department> departments = new ArrayList<Department>();

    public Hospital(String name, Address address, Phone phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

}
