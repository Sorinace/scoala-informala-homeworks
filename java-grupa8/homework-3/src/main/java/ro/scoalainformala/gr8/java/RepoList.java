package ro.scoalainformala.gr8.java;

public class RepoList {
    private int achiev;
    private String repoDetails;

    /**
     * This is the RepoList constructor.
     *
     * @param achiev      the achievement of the repo
     * @param repoDetails the details of repos      .
     * @author Sorin Avram
     */
    public RepoList(int achiev, String repoDetails) {
        this.achiev = achiev;
        this.repoDetails = repoDetails;
    }

    /**
     * This method will return the repo achievement.
     *
     * @author Sorin Avram
     */
    public int getAchiev() {

        return achiev;
    }

    /**
     * This method will return the repo details.
     *
     * @author Sorin Avram
     */
    public String getRepoDetails() {

        return repoDetails;
    }

    /**
     * It is a method which switch the value of the repo with current one.
     *
     * @param repo it is the repo value which will be switched with current repo
     * @author Sorin Avram
     */
    public void switchRepo(RepoList repo) {
        RepoList temp = new RepoList(0, "");

        temp.copy(this);
        this.copy(repo);
        repo.copy(temp);
    }

    /**
     * This method will copy two repo.
     *
     * @author Sorin Avram
     */
    public void copy(RepoList repo) {
        this.achiev = repo.achiev;
        this.repoDetails = repo.repoDetails;
    }
}
