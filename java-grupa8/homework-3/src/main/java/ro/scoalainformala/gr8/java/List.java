package ro.scoalainformala.gr8.java;

/**
 * This a list of repo class
 *
 * @author Sorin Avram
 */
public class List {
    private RepoList[] list;

    /**
     * This is List constructor, witch initialize the company repo details list
     *
     * @author Sorin Avram
     */
    public List(Company company) {

        list = company.getList();
    }

    /**
     * This method will oder the repo array in repo achiever order(bubble sort)
     *
     * @author Sorin Avram
     */
    public void sort() {
        boolean notFinish = true;

        while (notFinish) {
            notFinish = false;

            for (int i = 0; i < list.length - 1; i++) {
                if (list[i].getAchiev() < list[i + 1].getAchiev()) {
                    list[i].switchRepo(list[i + 1]);
                    notFinish = true;
                }
            }
        }
    }

    /**
     * This method get the number of repos from list
     *
     * @return the number of repos in array
     * @author Sorin Avram
     */
    public int getLength() {

        return list.length;
    }

    /**
     * This method will get repo details (String)
     *
     * @param i is the repo order in array
     * @return the repo department name (String)
     * @author Sorin Avram
     */
    public String getDepartmentName(int i) {

        return list[i].getDepartment();
    }

    /**
     * This method get the repo name.
     *
     * @param i is the repo order in array
     * @return the repo name (String)
     * @author Sorin Avram
     */
    public String getRepoName(int i) {
        return list[i].getName();
    }

    /**
     * This method get the repo achievement.
     *
     * @return the repo achievement
     * @author Sorin Avram
     */
    public int getRepoAchievment(int i) {
        return list[i].getAchiev();
    }
}
