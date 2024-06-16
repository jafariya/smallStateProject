package state_project;

public class Citizen {
    private int id;
    private int age;
    private String name;
    private String surname;
    private State state;
    private Region region;
    private City city;
    private Area area;

    public Citizen(int id, int age, String name, String surname, State state, Region region, Area area, City city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.state = state;
        this.area = area;
        this.region = region;
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* @Override
    public String toString() {
        return "\nName: " + name + "\nSurname: "+ surname + "\nAge: " + age +"\nState: " + state + "\nRegion: " + region + "\nArea: " + area + "\nCity: " + city;
    } */

    @Override
    public String toString() {
        return "\nID: " + id + "\nИмя: " + name + "\nФамилия: "+ surname + "\nВозраст: " + age +"\nСтрана: Беларусь" + "\nОбласть: " + region + "\nРайон: " + area + "\nГород: " + city;
    }
}
