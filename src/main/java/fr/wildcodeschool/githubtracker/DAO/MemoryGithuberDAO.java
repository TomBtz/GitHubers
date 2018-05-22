package fr.wildcodeschool.githubtracker.DAO;

import fr.wildcodeschool.githubtracker.model.Githuber;
import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;
import java.util.*;

@Dependent
@Default
@InMemory
public class MemoryGithuberDAO extends GithubUtils implements GithuberDAO {

    private Map<String, Githuber> allSavedGithubers = new HashMap<>();

    @Override
    public void saveGithuber(Githuber githuber) {
        allSavedGithubers.put(githuber.getLogin(), githuber);
    }

    @Override
    public List<Githuber> getGithubers() {
        List<Githuber> allGithubers = new ArrayList<>();
        for (Map.Entry<String, Githuber> entry : allSavedGithubers.entrySet()){
            allGithubers.add(entry.getValue());
        }
        return allGithubers;
    }

    @PostConstruct
    private void tryWithHpChars() {}

}
