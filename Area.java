package state_project;

public class Area {
    private Region region;
    private String name;
    public Area(String name, Region region) {
        this.name = name;
        this.region = region;
    }

    public Region getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return name;
    }
}
