package asmr.ru.arraylist.telsprav;

public class Person {
    private String name;
    private String surname;
    private String telephon;
    private String city;

    public Person(String name, String surname, String telephon, String city) {
        this.name = name;
        this.surname = surname;
        this.telephon = telephon;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelephon() {
        return telephon;
    }

    public void setTelephon(String telephon) {
        this.telephon = telephon;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", telephon='" + telephon + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
