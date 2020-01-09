package entities.model;


import java.util.Date;

public class ActionMedicalEquipment extends DBObject {

    private  String name;

    private int price;

    private boolean isRenting;

    private boolean isSale;

    private Date exp;

    private  String information;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isRenting() {
        return isRenting;
    }

    public void setRenting(boolean renting) {
        isRenting = renting;
    }

    public boolean isSale() {
        return isSale;
    }

    public void setSale(boolean sale) {
        isSale = sale;
    }

    public Date getExp() {
        return exp;
    }

    public void setExp(Date exp) {
        this.exp = exp;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }


}
