package state_project;

public class Region {

    private String name;
    private State state;
    private City regionalCenter;

    public String getName() {
        return name;
    }

    public City getRegionalCenter() {
        return regionalCenter;
    }

    public void setRegionalCenter(City regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    public Region(String name, State state) {
        this.state = state;
        this.name = name;

    }

    @Override
    public String toString() {
        return name;
    }
}
