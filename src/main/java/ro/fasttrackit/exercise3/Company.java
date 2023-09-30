package ro.fasttrackit.exercise3;

/*
 create an object that models a Company 1 manager, the rest are welders, carpenters, plummers

         - getManager(): Person  - checks all persons and returns the one with position "manager"

         - getPersons(String profession):List<Person>  - returns all the persons that have the received proffesion

        - getPersonsOlder(int age): List<Person> - returns all the persons that are older than received age

        - getPerson(String filterName):List<Person> - returns all the persons that have names that contains the received string

        - employ(Person) - employs a person. Adds it to the list of persons

 */

import java.util.*;

public class Company {
    private static int EMPLOYEE_ID = 0;
    private final Map<Integer, Person> employees;

    public Company() {
        this.employees = new HashMap<>();
        this.employees.put(EMPLOYEE_ID++, new Person("Mr CEO", 55, "Manager"));
    }

    public void employ(Person person) {
        if (person != null) {
            if (getManager() != null && !person.position().equalsIgnoreCase("manager")) {
                employees.put(EMPLOYEE_ID++, person);
            }
        }
    }

    public Person getManager() {
        for (Map.Entry<Integer, Person> personEntry : employees.entrySet()) {
            Person person = personEntry.getValue();
            if (person.position().equalsIgnoreCase("manager")) {
                return person;
            }
        }
        return null;
    }

    public List<Person> getPeople(String position) {
        List<Person> people = new ArrayList<>();
        if (position != null) {
            for (Map.Entry<Integer, Person> personEntry : employees.entrySet()) {
                Person person = personEntry.getValue();
                if (person.position().equalsIgnoreCase(position)) {
                    people.add(person);
                }
            }
        }

        return people;
    }

    public List<Person> getPeopleByName(String name) {
        List<Person> people = new ArrayList<>();
        if (name != null) {
            for (Map.Entry<Integer, Person> personEntry : employees.entrySet()) {
                Person person = personEntry.getValue();
                if (person.name().contains(name)) {
                    people.add(person);
                }
            }
        }

        return people;
    }

    public Map<Integer, Person> getEmployees() {
        return new HashMap<>(employees);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(employees, company.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employees);
    }

    @Override
    public String toString() {
        return "Company{" +
                "employees=" + employees +
                '}';
    }
}
