package models;

public abstract class BaseModel {
    private long id;

    public long getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}