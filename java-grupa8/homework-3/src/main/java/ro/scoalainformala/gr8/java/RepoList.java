package ro.scoalainformala.gr8.java;

public class RepoList {
    private SalesRepresentative repo;
    private String repoDepartment;


    /**
     * This is the RepoList constructor.
     *
     * @param repo           the SalesRepresentative data
     * @param repoDepartment the department name      .
     * @author Sorin Avram
     */
    public RepoList(SalesRepresentative repo, String repoDepartment) {
        this.repo = repo;
        this.repoDepartment = repoDepartment;
    }

    /**
     * This method will return the repo department.
     *
     * @author Sorin Avram
     */
    public String getDepartment() {

        return repoDepartment;
    }

    /**
     * It is a method which switch the value of the repo with current one.
     *
     * @param repo it is the repo value which will be switched with current repo
     * @author Sorin Avram
     */
    public void switchRepo(RepoList repo) {
        RepoList temp = new RepoList(new SalesRepresentative(), "");

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
        this.repo = repo.repo;
        this.repoDepartment = repo.repoDepartment;
    }

    /**
     * This method get the repo achievement.
     *
     * @author Sorin Avram
     */
    public int getAchiev() {
        return repo.getSaleRepresentativeAmount();
    }

    /**
     * This method get the repo name.
     *
     * @author Sorin Avram
     */
    public String getName() {
        return repo.getName();
    }
}
