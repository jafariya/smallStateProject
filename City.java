package state_project;

public class City {

    private Area area;
    private String name;

    public City(String name, Area area) {
        this.name = name;
        this.area = area;
    }

    public Area getArea() {
        return area;
    }

    @Override
    public String toString() {
        return name;
    }
}
