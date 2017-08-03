package ro.scoalainformala.gr8.java;

/**
 * It is a sales representative class
 *
 * @author Sorin Avram
 */
public class SalesRepresentative {
    public String name;
    private int sales;
    private int quota;
    public byte depNo;

    /**
     * It is a object which record the repo records.
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
        this.depNo = 1;
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
     * It is a method which copy a repo to another one.
     *
     * @param source is the repo to be copied
     * @return the copied repo
     * @author Sorin Avram
     */
    public SalesRepresentative copyRep(SalesRepresentative source) {
        this.name = source.name;
        this.sales = source.sales;
        this.quota = source.quota;
        this.depNo = source.depNo;
        return this;
    }

    /**
     * Return the department name
     *
     * @param depNo is the repo department number
     * @return the repo department name
     * @author Sorin Avram
     */
    public String getDepartmentName(byte depNo) {

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

    public long getCompanySales(SalesRepresentative[] repos) {
        long total = 0;

        for (SalesRepresentative item : repos) {
            total += item.getSaleRepresentativeAmount();
        }
        return total;
    }

    /**
     * Return number id of the best selling department
     *
     * @param repos is the repo array.
     * @return the best department
     * @author Sorin Avram
     */

    public byte getMostSuccessfulDepartment(SalesRepresentative[] repos) {
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
        return depNo;
    }
}
