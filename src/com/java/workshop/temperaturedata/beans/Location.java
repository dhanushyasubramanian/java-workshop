package src.com.java.workshop.temperaturedata.beans;

public class Location {
    private String name;
    private double latitude;
    private double longitude;
    private String country;
    private String address;
    private String postalcode;

    public void setNames(String aName) {
        name=aName;
    }

    public String getName(){
        return name;
    } 

public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getAddress() {
        return address;
    }

    
    public String getPostalcode() {
        return postalcode;
    }

    public String getcountry() {
        return country;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPostalcode(String postalCode) {
        this.postalcode = postalCode;
    }
    public void setcountry(String contact) {
        this.country = contact;
    }

    @Override
    public String toString() {      
        return "Location{" +
                "name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", address='" + address + '\'' +
                ", postalCode='" + postalcode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}