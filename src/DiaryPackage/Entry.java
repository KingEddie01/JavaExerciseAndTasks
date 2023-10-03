package DiaryPackage;

import java.time.LocalDate;
import java.util.Objects;

public class Entry {
    private int id;
    private String title;
    private String body;

    private final LocalDate dateCreated = LocalDate.now();





    public void setBody(String body) {
        this.body = body;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getBody() {
        return body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entry entry)) return false;
        return getId() == entry.getId() && Objects.equals(getTitle(),
                entry.getTitle()) && Objects.equals(getBody(),
                entry.getBody()) && Objects.equals(dateCreated, entry.dateCreated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getBody(), dateCreated);
    }

    public Entry(int id, String title, String body){
        this.id = id;
        this.title =title;
        this.body = body;
    }
    public String getEntry() {
        return "TITLE :" + title + "\nBODY :" + body;
    }
}
