package ro.scoalainformala.gr8.java;

/**
 * It is a sales representative class
 *
 * @author Sorin Avram
 */
public class SalesRepresentative {
    private String name;
    private int sales;
    private int quota;

    /**
     * It is a SalesRepresentative constructor.
     *
     * @param name  is the repo name
     * @param sales is the number of sales of the repo
     * @param quota is quota of sale
     * @author Sorin Avram
     */
    public SalesRepresentative(String name, int sales, int quota) {

        this.name = name;
        this.sales = sales;
        this.quota = quota;
    }

    /**
     * It is a method which calculate the revenue / achievement.
     *
     * @return the revenue, (sales * quota)
     * @author Sorin Avram
     */
    public int getSaleRepresentativeAmount() {

        return sales * quota;
    }

    /**
     * This method will get the SalesRepresentative details.
     *
     * @return a String with repo details
     * @author Sorin Avram
     */

    public String getDetails(String department) {
        return name + " have a revenue of: " + this.getSaleRepresentativeAmount() + "$,"
                + " and it is from " + department + " department.";
    }
}
