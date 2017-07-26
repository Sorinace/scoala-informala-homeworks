package ro.scoalainformala.gr8.java;

public class Main {

    public static void main(String[] args) {
        // initialize the array of repo in the random order
        SalesRepresentative[] reps = {new SalesRepresentative("guy 1", 10, 500),
                new SalesRepresentative("guy 2", 7, 800),
                new SalesRepresentative("guy 3", 3, 1500),
                new SalesRepresentative("guy 4", 13, 400)};

        SalesRepresentative[] sortedReps = sort(reps);
        System.out.println("The sorted list:");
        for (SalesRepresentative item: sortedReps){
            System.out.println(item.name + " revenue: " + item.getSaleRepresentativeAmount() + "$");
        }
    }

    /**
     * This method will create a new array of repo and oder it

     * @param randomOrder is the array repo in random order
     * @return ordered  is the ordered array of repo
     * @author Sorin Avram
     */
    public static SalesRepresentative[] sort(SalesRepresentative[] randomOrder){

        SalesRepresentative[] ordered = new SalesRepresentative[randomOrder.length];

        //copy array randomOrder to ordered
        for(int i=0; i < ordered.length; i++){
            ordered[i] = new SalesRepresentative();
            ordered[i].copyRep(randomOrder[i]);
        }

        // bubble sort
        boolean notFinish = true;
        while (notFinish){
            notFinish = false;

            for (int i = 0; i < ordered.length - 1; i++){
                if (ordered[i].getSaleRepresentativeAmount() < ordered[i+1].getSaleRepresentativeAmount()){
                    ordered[i].switchRepo(ordered[i+1]);
                    notFinish = true;
                }
            }
        }
        return ordered;
    }
}
