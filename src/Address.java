public class Address {

    private int streetNumber;
    private String district;
    private String street;

    public Address(String district, String street, int streetNumber){
        this.street = street;
        this.district = district;
        this.streetNumber = streetNumber;
    }
    public String getDistrict(){
        return district;
    }
    public String getStreet(){
        return street;
    }
    public int getStreetNumber(){
        return streetNumber;
    }
    public void setStreetNumber(int streetNumber){
        this.streetNumber = streetNumber;
    }
    public void setDistrict(String district){
        this.district = district;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public String toString(){
        return streetNumber + " " + street + ", " + district;
    }
}
