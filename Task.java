package bink.main;

public class Task {

    private int id;
    private String desciption;
    private boolean isCompleted;
    private Date date;
   

    public Task() {
    }

    public Task(int id, String desciption, Date date) {
        this.id = id;
        this.desciption = desciption;
        this.date = date;

    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    @Override
    public String toString() {
        if (isCompleted) {
            return +id + "                                                                " + desciption + "                                  " + date + "                              " + "Completed";
        } else {
            return +id + "                                                                " + desciption + "                                  " + date + "                              " + "In progress";
        }
    }

}
