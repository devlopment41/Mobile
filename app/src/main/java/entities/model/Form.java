package entities.model;


import java.util.Date;

public class Form extends DBObject {

    private String name;

    private String issue;


   private Date date;

    private int document_id;

    public Form(String name, String issue, Date date, int document_id, int isRealized) {
        this.name = name;
        this.issue = issue;
        this.date = date;
        this.document_id = document_id;
        this.isRealized = isRealized;
    }

    public int getIsRealized() {
        return isRealized;
    }

    public void setIsRealized(int isRealized) {
        this.isRealized = isRealized;
    }

    private int isRealized;





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

   public Date getDate() {
       return date;
   }

   public void setDate(Date date) {
       this.date = date;
   }

    public int getDocument_id() {
        return document_id;
    }

    public void setDocument_id(int document_id) {
        this.document_id = document_id;
    }

    public boolean equals(Object obj) {
        if(obj==this)
            return true;
        if(obj==null || obj.getClass()!=this.getClass())
            return false;
        Form b=(Form) obj;
        return (name.equals(b.getName()));
    }

    @Override
    public String toString() {
        return "Form{" +
                "name='" + name + '\'' +
                ", issue='" + issue + '\'' +
                ", date=" + date +
                ", document_id=" + document_id +
                '}';
    }
}
