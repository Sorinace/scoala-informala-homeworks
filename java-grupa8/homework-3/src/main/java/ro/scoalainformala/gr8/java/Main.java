package ro.scoalainformala.gr8.java;

public class Main {

    public static void main(String[] args) {
        // initialize the array of repo in the random order
        SalesRepresentative[] reps = getSalesRepresentatives();

        SalesRepresentative[] sortedReps = sort(reps);
        System.out.println("The sorted list:");
        for (SalesRepresentative item : sortedReps) {
            System.out.println(item.getName() + " from " + item.getDepartmentName() +
                    " have a revenue of: " + item.getSaleRepresentativeAmount() + "$.");
        }
        System.out.println("\nThe total sale of company is " + SalesRepresentative.getCompanySales(sortedReps) + "$.");
        System.out.println("\nThe most successfully department is " +
                SalesRepresentative.getMostSuccessfulDepartment(sortedReps) + ".");

        // because the reps are in seals order the first one is most successful
        System.out.println("\nMost successful guy is " + sortedReps[0].getName() + " from " +
                sortedReps[0].getDepartmentName() + " with a revenue of " +
                sortedReps[0].getSaleRepresentativeAmount() + "$.");
    }

    /**
     * This method will oder the repo array (bubble sort)
     *
     * @param repos is the array repo in random order
     * @return repos  is the ordered array of repo
     * @author Sorin Avram
     */
    private static SalesRepresentative[] sort(SalesRepresentative[] repos) {
        boolean notFinish = true;

        while (notFinish) {
            notFinish = false;

            for (int i = 0; i < repos.length - 1; i++) {
                if (repos[i].getSaleRepresentativeAmount() < repos[i + 1].getSaleRepresentativeAmount()) {
                    repos[i].switchRepo(repos[i + 1]);
                    notFinish = true;
                }
            }
        }
        return repos;
    }

    private static SalesRepresentative[] getSalesRepresentatives() {
        return new SalesRepresentative[]{new SalesRepresentative("Guy 1.1", 10, 500, (byte) 0),
                new SalesRepresentative("Guy 1.2", 9, 400, (byte) 0),
                new SalesRepresentative("Guy 1.3", 6, 700, (byte) 0),
                new SalesRepresentative("Guy 1.4", 3, 900, (byte) 0),
                new SalesRepresentative("Guy 1.5", 5, 850, (byte) 0),

                new SalesRepresentative("Guy 2.1", 7, 600, (byte) 1),
                new SalesRepresentative("Guy 2.2", 17, 300, (byte) 1),
                new SalesRepresentative("Guy 2.3", 12, 440, (byte) 1),
                new SalesRepresentative("Guy 2.4", 5, 950, (byte) 1),
                new SalesRepresentative("Guy 2.5", 8, 800, (byte) 1),

                new SalesRepresentative("Guy 3.1", 6, 700, (byte) 2),
                new SalesRepresentative("Guy 3.2", 7, 800, (byte) 2),
                new SalesRepresentative("Guy 3.3", 8, 600, (byte) 2),
                new SalesRepresentative("Guy 3.4", 9, 500, (byte) 2),
                new SalesRepresentative("Guy 3.5", 10, 400, (byte) 2),

                new SalesRepresentative("Guy 4.1", 13, 400, (byte) 3),
                new SalesRepresentative("Guy 4.2", 11, 300, (byte) 3),
                new SalesRepresentative("Guy 4.3", 12, 450, (byte) 3),
                new SalesRepresentative("Guy 4.4", 7, 700, (byte) 3),
                new SalesRepresentative("Guy 4.5", 8, 850, (byte) 3)};
    }
}
