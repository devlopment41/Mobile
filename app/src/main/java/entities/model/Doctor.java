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


}
