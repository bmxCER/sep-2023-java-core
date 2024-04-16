package hw1.javacore.part2;

public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

    public Post(int userId, int id, String title, String body){
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Post{title="+ title +", userId="+ userId +", id="+ id +", body="+ body +"}";
    }
}
