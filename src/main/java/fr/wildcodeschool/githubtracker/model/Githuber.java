package fr.wildcodeschool.githubtracker.model;

public class Githuber {

    private String nameGtihuber;
    private String email;
    private String login;
    private String avatarUrl;
    private int id;

    public Githuber (String name, String mail, String login, String url, int id ) {
        this.nameGtihuber = name;
        this.email = mail;
        this.login = login;
        this.avatarUrl = url;
        this.id = id;
    }

    public String getNameGithuber() {
        return nameGtihuber;
    }
    public String getEmail() {
        return email;
    }
    public String getLogin() {
        return login;
    }
    public String getAvatarUrl() {
        return avatarUrl;
    }
    public int getId() {
        return id;
    }
}
