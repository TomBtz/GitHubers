package fr.wildcodeschool.githubtracker.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Githuber {

    private String nameGtihuber;
    private String email;
    private String login;
    private String avatarUrl;
    private int id;

    @JsonCreator
    @JsonIgnoreProperties(ignoreUnknown = true)
    public Githuber (@JsonProperty("name") String name, @JsonProperty("email") String mail, @JsonProperty("login") String login, @JsonProperty("avatar_url") String url, @JsonProperty("id") int id ) {
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
