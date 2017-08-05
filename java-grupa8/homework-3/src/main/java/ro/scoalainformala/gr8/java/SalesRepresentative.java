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
    private byte depNo;

    /**
     * It is a object constructor.
     *
     * @param name  is the repo name
     * @param sales is the number of sales of the repo
     * @param quota is quota of sale
     * @author Sorin Avram
     */
    public SalesRepresentative(String name, int sales, int quota, byte depNo) {

        this.name = name;
        this.sales = sales;
        this.quota = quota;
        this.depNo = depNo;
    }

    /**
     * @overide SalesRepresentative()
     * It is a object constructor, when no arguments its given.
     * <p>
     * <p> name = "", is the repo name</p>
     * <p> sales = 0,  is the number of sales of the repo</p>
     * <p> quota = 0, is quota of sale</p>
     * @author Sorin Avram
     */
    public SalesRepresentative() {
        this.name = "";
        this.sales = 0;
        this.quota = 0;
        this.depNo = 1;
    }

    /**
     * Return the repo(sales representative) name.
     *
     * @return the sales representative name
     * @author Sorin Avram
     */
    public String getName() {

        return name;
    }

    /**
     * It is a method which calculate the revenue.
     *
     * @return the revenue, (sales * quota)
     * @author Sorin Avram
     */
    public int getSaleRepresentativeAmount() {

        return sales * quota;
    }

    /**
     * It is a method which switch the value of the repo with current one.
     *
     * @param repo it is the repo value which will be switched with current repo
     * @author Sorin Avram
     */
    public void switchRepo(SalesRepresentative repo) {

        SalesRepresentative temp = new SalesRepresentative();

        temp.copyRep(this);
        this.copyRep(repo);
        repo.copyRep(temp);
    }

    /**
     * It is a method which copy a repo value from source to current one.
     *
     * @param source is the repo to be copied
     * @author Sorin Avram
     */
    private void copyRep(SalesRepresentative source) {
        this.name = source.name;
        this.sales = source.sales;
        this.quota = source.quota;
        this.depNo = source.depNo;
    }

    /**
     * Return the department name
     *
     * @return the repo department name
     * @author Sorin Avram
     */
    public String getDepartmentName() {

        switch (depNo) {
            case 0:
                return "North Sales";
            case 1:
                return "Est Sales";
            case 2:
                return "West Sales";
            case 3:
                return "South Sales";
            default:
                return "Error, it is no department for this number!";
        }
    }

    /**
     * Return the total amount of sales for the company
     *
     * @param repos is the repo array
     * @return the total amount of sales
     * @author Sorin Avram
     */

    public static long getCompanySales(SalesRepresentative[] repos) {
        long total = 0;

        for (SalesRepresentative item : repos) {
            total += item.getSaleRepresentativeAmount();
        }
        return total;
    }

    /**
     * Return name of the best selling department (more sales)
     *
     * @param repos is the repo array.
     * @return the name of the best department.
     * @author Sorin Avram
     */

    public static String getMostSuccessfulDepartment(SalesRepresentative[] repos) {
        long[] depTotal = {0, 0, 0, 0};
        long max = 0;
        byte depNo = 0;

        for (SalesRepresentative item : repos) {
            switch (item.depNo) {
                case 0:
                    depTotal[0] += item.getSaleRepresentativeAmount();
                    break;
                case 1:
                    depTotal[1] += item.getSaleRepresentativeAmount();
                    break;
                case 2:
                    depTotal[2] += item.getSaleRepresentativeAmount();
                    break;
                case 3:
                    depTotal[3] += item.getSaleRepresentativeAmount();
                    break;
                default:
                    System.out.println("Error!");
            }
        }
        for (byte i = 0; i <= 3; i++) {
            if (max < depTotal[i]) {
                max = depTotal[i];
                depNo = i;
            }
        }
        for (SalesRepresentative item : repos) {
            if (item.depNo == depNo) {
                return item.getDepartmentName();
            }
        }
        return "Error, no name for department number " + depNo;
    }
}
