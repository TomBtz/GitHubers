package fr.wildcodeschool.githubtracker.service;

import fr.wildcodeschool.githubtracker.DAO.GithuberDAO;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class GithubersService {

    private GithuberDAO dao;

    @Inject
    public GithubersService (GithuberDAO dao) {
        this.dao = dao;
    }


    public List<Githuber> geAllGithubers () {
        return this.dao.getGithubers();
    }


    public Githuber getGithuber(String login) {
        return this.dao.getGithubers().stream()                        // Convert to steam
                .filter(x -> login.equals(x.getNameGithuber()))        // we want "jack" only
                .findAny()                                      // If 'findAny' then return found
                .orElse(null);

    }

    public void track(String login) {
        //TODO
    }
}
