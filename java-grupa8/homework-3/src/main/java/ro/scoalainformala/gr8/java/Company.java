package ro.scoalainformala.gr8.java;

public class Company {
    private Department[] departments;

    /**
     * This is the Company constructor.
     *
     * @param departments the arrays of the departments names.
     * @author Sorin Avram
     */
    public Company(Department[] departments) {

        this.departments = departments;
    }

    /**
     * This method will get the achieved of the company.
     *
     * @return total achieved of company
     * @author Sorin Avram
     */
    public int getCompanyAchiev() {
        int total = 0;
        for (Department item : departments) {
            total += item.getDepartmentAchiev();
        }
        return total;
    }

    /**
     * Return name of the best selling department (more sales)
     *
     * @return the name and achieved of the best department.
     * @author Sorin Avram
     */
    public String getMostSuccessfulDepartmentData() {
        String departmentName = "";
        int max = 0;

        for (Department item : departments) {
            if (max < item.getDepartmentAchiev()) {
                max = item.getDepartmentAchiev();
                departmentName = item.getDepartmentName();
            }
        }
        return departmentName + " with a achieve of " + max + "$.";
    }

    /**
     * Return an array list with all repo from company
     *
     * @return an array of repos.
     * @author Sorin Avram
     */
    public RepoList[] getList() {
        RepoList[] list = new RepoList[this.getRepoNo()];
        int k = 0;

        for (int i = 0; i < departments.length; i++) {
            for (int j = 0; j < departments[i].getRepoDepartmentNo(); j++) {
                list[k] = departments[i].getRepoList(j);
                k++;
            }
        }

        return list;
    }

    /**
     * This method return the numbers of the repo from company
     *
     * @return the the numbers of the repo from company
     * @author Sorin Avram
     */
    public int getRepoNo() {
        int repoNo = 0;

        for (Department item : departments) {
            repoNo += item.getRepoDepartmentNo();
        }
        return repoNo;
    }
}
