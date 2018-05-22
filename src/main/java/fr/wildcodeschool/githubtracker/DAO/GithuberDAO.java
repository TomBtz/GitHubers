package fr.wildcodeschool.githubtracker.DAO;

import fr.wildcodeschool.githubtracker.model.Githuber;
import java.util.List;

public interface GithuberDAO {
    List<Githuber> getGithubers();
    void saveGithuber(Githuber githuber);
}