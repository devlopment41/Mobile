package entities.model;


import java.util.Date;

public class Medicine extends DBObject {

    private String name;

    private String user_manual;

    private int price;

    private String side_effects;

    private String information;

    private int dosage;

    private Date exp;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_manual() {
        return user_manual;
    }

    public void setUser_manual(String user_manual) {
        this.user_manual = user_manual;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSide_effects() {
        return side_effects;
    }

    public void setSide_effects(String side_effects) {
        this.side_effects = side_effects;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    public Date getExp() {
        return exp;
    }

    public void setExp(Date exp) {
        this.exp = exp;
    }


}
