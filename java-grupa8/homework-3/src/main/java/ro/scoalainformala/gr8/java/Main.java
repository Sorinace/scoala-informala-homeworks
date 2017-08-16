package ro.scoalainformala.gr8.java;

public class Main {

    public static void main(String[] args) {
        // initialize the departments and repo details arrays
        Department[] departments = getData();

        Company company = new Company(departments);

        List list = new List(company);
        list.sort();

        System.out.println("The sorted list:");
        for (int i = 0; i < list.getLength(); i++) {
            System.out.println(list.getDetails(i));
        }

        System.out.println("\nThe total sale of company is " + company.getCompanyAchiev() + "$.");

        System.out.println("\nThe most successfully department is " + company.getMostSuccesfulDepartmentData());

        // because the reps are in seals order the first one is most successful
        System.out.println("\nMost successful is " + list.getDetails(0));
    }

    /**
     * Initialize the departments and repo data arrays
     *
     * @author Sorin Avram
     */
    private static Department[] getData() {
        return new Department[]{new Department("North Sales", new SalesRepresentative[]{
                new SalesRepresentative("Guy 1.1", 10, 500),
                new SalesRepresentative("Guy 1.2", 9, 400),
                new SalesRepresentative("Guy 1.3", 6, 700),
                new SalesRepresentative("Guy 1.4", 3, 900),
                new SalesRepresentative("Guy 1.5", 5, 850)}),

                new Department("East Sales", new SalesRepresentative[]{
                        new SalesRepresentative("Guy 2.1", 7, 600),
                        new SalesRepresentative("Guy 2.2", 17, 300),
                        new SalesRepresentative("Guy 2.3", 12, 440),
                        new SalesRepresentative("Guy 2.4", 5, 950),
                        new SalesRepresentative("Guy 2.5", 8, 800)}),

                new Department("West Sales", new SalesRepresentative[]{
                        new SalesRepresentative("Guy 3.1", 6, 700),
                        new SalesRepresentative("Guy 3.2", 7, 800),
                        new SalesRepresentative("Guy 3.3", 8, 600),
                        new SalesRepresentative("Guy 3.4", 9, 500),
                        new SalesRepresentative("Guy 3.5", 10, 400)}),

                new Department("South Sales", new SalesRepresentative[]{
                        new SalesRepresentative("Guy 4.1", 13, 400),
                        new SalesRepresentative("Guy 4.2", 11, 300),
                        new SalesRepresentative("Guy 4.3", 12, 450),
                        new SalesRepresentative("Guy 4.4", 7, 700),
                        new SalesRepresentative("Guy 4.5", 8, 850)})
        };
    }
}
