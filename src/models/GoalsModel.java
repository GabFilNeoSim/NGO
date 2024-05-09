package models;

public class GoalsModel {
    
    private final String hid;
    private final String name;
    
    public GoalsModel(String hid, String name) {
        this.hid = hid;
        this.name = name;
    }
    
    public String getHid() {
        return hid;
    }
    
    @Override
    public String toString() {
        return hid + " - "  + name;
    }
}
