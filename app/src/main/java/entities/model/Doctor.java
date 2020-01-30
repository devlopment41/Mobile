package entities.model;



public class Doctor extends DBObject {

    private String name;

    private String email;

    private int phone;

    private String address;

    private String gender;

    private String activity_time;

    private String reception_days;

    private String language;

    private String field_treatment;

    private String ServiceArea;



    private  String city;
    private String  street;

    public Doctor(String name, String email, int phone, String address, String gender, String activity_time, String reception_days,
                  String language, String field_treatment, String serviceArea, String city, String street) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.activity_time = activity_time;
        this.reception_days = reception_days;
        this.language = language;
        this.field_treatment = field_treatment;
        ServiceArea = serviceArea;
        this.city = city;
        this.street = street;
    }

    public Doctor() {

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }




    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getServiceArea() {
        return ServiceArea;
    }

    public void setServiceArea(String serviceArea) {
        ServiceArea = serviceArea;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getActivity_time() {
        return activity_time;
    }

    public void setActivity_time(String activity_time) {
        this.activity_time = activity_time;
    }

    public String getReception_days() {
        return reception_days;
    }

    public void setReception_days(String reception_days) {
        this.reception_days = reception_days;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getField_treatment() {
        return field_treatment;
    }

    public void setField_treatment(String field_treatment) {
        this.field_treatment = field_treatment;
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", activity_time='" + activity_time + '\'' +
                ", reception_days='" + reception_days + '\'' +
                ", language='" + language + '\'' +
                ", field_treatment='" + field_treatment + '\'' +
                ", ServiceArea='" + ServiceArea + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
