package fr.wildcodeschool.githubtracker.DAO;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.*;

@ApplicationScoped
public class MemoryGithuberDAO implements GithuberDAO {

    private HashMap<String, Githuber> mapGithubers;

    public List<Githuber> getGithubers() {
        return null;

    }

    public void saveGithuber(Githuber githuber){

    }

    public Githuber parseGithuber(String login) {
        return null;
    }

    @PostConstruct
    private void jenesaispas() {

    }

}
