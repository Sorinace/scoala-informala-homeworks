package ro.scoalainformala.gr8.java;

public class Department {
    private String depName;
    private SalesRepresentative[] repo;

    /**
     * This is the Department constructor.
     *
     * @param depName the name of tehe department
     * @param repo    the array of repos      .
     * @author Sorin Avram
     */
    public Department(String depName, SalesRepresentative[] repo) {
        this.depName = depName;
        this.repo = repo;
    }

    /**
     * This method will get the achieved of the department.
     *
     * @return total achieved of department
     * @author Sorin Avram
     */
    public int getDepartmentAchiev() {
        int total = 0;

        for (SalesRepresentative item : repo) {
            total += item.getSaleRepresentativeAmount();
        }
        return total;
    }

    /**
     * This method will get the department name.
     *
     * @return name of department
     * @author Sorin Avram
     */
    public String getDepartmentName() {

        return depName;
    }

    /**
     * This method will get number of repo from department.
     *
     * @return number of repo from department
     * @author Sorin Avram
     */
    public int getRepoDepartmentNo() {

        return repo.length;
    }

    /**
     * The method will get the repo details
     *
     * @param repoNo is the number of the repo in array      .
     * @author Sorin Avram
     */
    public RepoList getRepoList(int repoNo) {
        RepoList repoList = new RepoList(repo[repoNo].getSaleRepresentativeAmount(),
                repo[repoNo].getDetails(getDepartmentName()));
        return repoList;
    }
}
