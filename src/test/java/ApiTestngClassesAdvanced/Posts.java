package ApiTestngClassesAdvanced;

public class Posts {
    private int id;
    private String title;
    private String author;
    private Info[] info;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setInfo(Info[] info) {
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Info[] getInfo() {
        return info;
    }
}
