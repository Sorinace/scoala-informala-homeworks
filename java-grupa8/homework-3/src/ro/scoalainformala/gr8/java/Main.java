package ro.scoalainformala.gr8.java;

public class Main {

    public static void main(String[] args) {
        // initialize the array of repo in the random order
        SalesRepresentative[] reps = getSalesRepresentatives();

        SalesRepresentative[] sortedReps = sort(reps);
        System.out.println("The sorted list:");
        for (SalesRepresentative item : sortedReps) {
            System.out.println(item.name + " from " + item.getDepartmentName(item.depNo)+ " have a revenue of: " +
                    item.getSaleRepresentativeAmount() + "$.");
        }
        System.out.println("\nThe total sale of company is " + reps[0].getCompanySales(reps) + "$.");
        System.out.println("\nThe most successfully department is " +
                reps[0].getDepartmentName(reps[0].getMostSucessfulDepartment(reps)) +".");
        System.out.println("\nMost successful guy is " + reps[0].name);
    }

    /**
     * This method will oder the repo array (bubble sort)
     *
     * @param randomOrder is the array repo in random order
     * @return ordered  is the ordered array of repo
     * @author Sorin Avram
     */
    private static SalesRepresentative[] sort(SalesRepresentative[] randomOrder) {
        boolean notFinish = true;
        while (notFinish) {
            notFinish = false;

            for (int i = 0; i < randomOrder.length - 1; i++) {
                if (randomOrder[i].getSaleRepresentativeAmount() < randomOrder[i + 1].getSaleRepresentativeAmount()) {
                    randomOrder[i].switchRepo(randomOrder[i + 1]);
                    notFinish = true;
                }
            }
        }
        return randomOrder;
    }

    private static SalesRepresentative[] getSalesRepresentatives() {
        return new SalesRepresentative[]{new SalesRepresentative("Guy 1.1", 10, 500, (byte) 1),
                new SalesRepresentative("Guy 1.2", 9, 400, (byte) 1),
                new SalesRepresentative("Guy 1.3", 6, 700, (byte) 1),
                new SalesRepresentative("Guy 1.4", 3, 900, (byte) 1),
                new SalesRepresentative("Guy 1.5", 5, 850, (byte) 1),

                new SalesRepresentative("Guy 2.1", 7, 600, (byte) 2),
                new SalesRepresentative("Guy 2.2", 17, 300, (byte) 2),
                new SalesRepresentative("Guy 2.3", 12, 440, (byte) 2),
                new SalesRepresentative("Guy 2.4", 5, 950, (byte) 2),
                new SalesRepresentative("Guy 2.5", 8, 800, (byte) 2),

                new SalesRepresentative("Guy 3.1", 6, 700, (byte) 3),
                new SalesRepresentative("Guy 3.2", 7, 800, (byte) 3),
                new SalesRepresentative("Guy 3.3", 8, 600, (byte) 3),
                new SalesRepresentative("Guy 3.4", 9, 500, (byte) 3),
                new SalesRepresentative("Guy 3.5", 10, 400, (byte) 3),

                new SalesRepresentative("Guy 4.1", 13, 400, (byte) 4),
                new SalesRepresentative("Guy 4.2", 11, 300, (byte) 4),
                new SalesRepresentative("Guy 4.3", 12, 450, (byte) 4),
                new SalesRepresentative("Guy 4.4", 7, 700, (byte) 4),
                new SalesRepresentative("Guy 4.5", 8, 850, (byte) 4)};
    }
}
