package fr.wildcodeschool.githubtracker.DAO;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import java.util.ArrayList;
import java.util.List;

@Dependent

public class DumbGithuberDAO implements GithuberDAO {


    public List<Githuber> getGithubers() {
        List<Githuber> githubers = new ArrayList<Githuber>();
        githubers.add(new Githuber("Harry", "harry@gmail.com", "harry", "http://media.thevirtualreport.biz/2017/11/83701/harry-potter-r100x100.jpg", 1234));
        githubers.add(new Githuber("Ron", "gingermen@gmail.com", "bestweasley", "https://yt3.ggpht.com/-mKD6bsM9HQ4/AAAAAAAAAAI/AAAAAAAAAAA/PDX3O_ZhiLU/s100-mo-c-c0xffffffff-rj-k-no/photo.jpg", 2222));
        githubers.add(new Githuber("Hermione", "hermione@gmail.com", "bookworm", "https://media.licdn.com/dms/image/C4E03AQEFwrOkx-m1kg/profile-displayphoto-shrink_100_100/0?e=1527998400&v=alpha&t=HKmpjockxe0dyYn4CBfiTfaPmH4lJDr_-IKrLbMSdfg", 3333));
        githubers.add(new Githuber("Neville", "my-gm-terrify-me@gmail.com", "lngbottom", "http://i70.servimg.com/u/f70/11/10/43/66/1_nevi10.png", 4444));
        githubers.add(new Githuber("Drago", "je-suis-mechant@gmail.com", "ssssssshhhh", "data:image/jpeg;base64,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", 5555));
        return githubers;
    }

    public void saveGithuber(Githuber githuber) throws UnsupportedOperationException {

    }
}
