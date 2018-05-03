package fr.wildcodeschool.githubtracker.DAO;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import java.util.List;

public interface GithuberDAO {
    List<Githuber> getGithubers();
    void saveGithuber(Githuber githuber);
}