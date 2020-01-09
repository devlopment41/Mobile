package entities.model;


import java.util.Date;

public class Form extends DBObject {

    private String name;

    private String issue;


   private Date date;

    private int document_id;

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
}
