package ro.scoalainformala.gr8.java;

/**
 * It is a class which keep the repo records.
 *
 * @author Sorin Avram
 */
public class SalesRepresentative {
    public String name;
    private int sales;
    private int quota;

    /**
     * It is a object which record the repo records.
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
     * It is a object which initialize the repo records, when no arguments its given.
     * <p>
     * <p> name = "", is the repo name</p>
     * <p> sales = 0,  is the number of sales of the repo</p>
     * <p> quota = 0, is quota of sale</p>
     *
     * @author Sorin Avram
     */
    public SalesRepresentative() {
        this.name = "";
        this.sales = 0;
        this.quota = 0;
    }

    /**
     * It is a method which calculate the revenue.
     *
     * @return the revenue, (sales * quota)
     * @author Sorin Avram
     */
    public int getSaleRepresentativeAmount() {

        return (sales * quota);
    }

    /**
     * It is a method which switch the two repo in array
     *
     * @param repo it is the repo which replace "this" repo
     * @return the changed repo
     * @author Sorin Avram
     */
    public SalesRepresentative switchRepo(SalesRepresentative repo) {

        SalesRepresentative temp = new SalesRepresentative();

        temp.copyRep(this);
        this.copyRep(repo);
        repo.copyRep(temp);

        return this;
    }

    /**
     * It is a method which copy a repo into the "this" one.
     *
     * @param source is the repo to be copied
     * @return the copied repo
     * @author Sorin Avram
     */
    public SalesRepresentative copyRep(SalesRepresentative source) {
        this.name = source.name;
        this.sales = source.sales;
        this.quota = source.quota;
        return this;
    }
}
