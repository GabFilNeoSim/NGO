package models;

public class CountryModel {
    
    private final String lid;
    private final String name;
    
    public CountryModel(String lid, String name) {
        this.lid = lid;
        this.name = name;
    }
    
    public String getLid() {
        return lid;
    }
    
    @Override
    public String toString() {
        return lid + " - "  + name;
    }
}
