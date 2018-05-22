package fr.wildcodeschool.githubtracker.service;

import fr.wildcodeschool.githubtracker.DAO.GithubUtils;
import fr.wildcodeschool.githubtracker.DAO.GithuberDAO;
import fr.wildcodeschool.githubtracker.DAO.InMemory;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class GithubersService extends GithubUtils {

    private @InMemory GithuberDAO dao;

    @Inject
    public GithubersService (@InMemory GithuberDAO dao) {
        this.dao = dao;
    }


    public List<Githuber> getAllGithubers () {
        List<Githuber> Githubers = dao.getGithubers();
        return Githubers;
    }


    public Githuber getGithuber(String login) {
        List<Githuber> ghs = dao.getGithubers();
        Githuber ghOne =  ghs.stream().filter(x -> login.equals(x.getNameGithuber())).findAny() .orElse(null);
        return ghOne;
    }

    public void track(String login){
        Githuber githuber = parseGithuber(login);
        dao.saveGithuber(githuber);
    }
}
