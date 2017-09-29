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
     * It is a SalesRepresentative constructor without parameters.
     *
     * @author Sorin Avram
     */
    public SalesRepresentative() {

        this("", 0, 0);
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
     * This method get the repo name.
     *
     * @author Sorin Avram
     */
    public String getName() {
        return name;
    }
}
