package models;

public class EmployeeModel {
    
    private final String aid;
    private final String name;
    
    public EmployeeModel(String aid, String firstName, String lastName) {
        this.aid = aid;
        name = firstName + " " + lastName;
    }
    
    public String getAid() {
        return aid;
    }
    
    @Override
    public String toString() {
        return aid + " - "  + name;
    }
}
