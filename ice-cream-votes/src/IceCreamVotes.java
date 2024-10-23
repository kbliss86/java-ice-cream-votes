import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Collections;

public class IceCreamVotes {
    private Set<String> flavors;
    private Map<String, Integer> voteCounts;
    private List<String> voters;

    public IceCreamVotes() {
        flavors = new HashSet<>(Arrays.asList("strawberry", "chocolate", "vanilla"));
        voteCounts = new HashMap<>();
        voters =  Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
    }

    public void conductVoting() {
        System.out.println("Lets Vote on ice Cream Flavors!");
        printFlavors();
        for (String voter : voters) {
            String flavor = getVoterChoice(voter);
            if (flavors.contains(flavor)) {
                voteCounts.put(flavor, voteCounts.getOrDefault(flavor, 0) + 1);
            } else {
                System.out.println("Invalid flavor: " + flavor);
            }
        }

        int highestVotes = Collections.max(voteCounts.values());
        System.out.println("\nThe Flavors with the most votes are: ");
        for (Map.Entry<String, Integer> entry : voteCounts.entrySet()) {
            if (entry.getValue() == highestVotes) {
                System.out.println(entry.getKey());
            }
        }
    }
    //method to print all the flavors
    private void printFlavors() {
        System.out.println("Available flavors: ");
        for (String flavor : flavors) {
            System.out.println(flavor);
        }
    }

    //method to get the voter's choice
    private String getVoterChoice(String member) {
        Scanner scanner = new Scanner(System.in);
        String flavor;
        while (true) {
            System.out.println("\nWhich flavor do you want to vote for " + member + "?");
            flavor = scanner.nextLine().toLowerCase().trim();
            if (flavors.contains(flavor)) {
                System.out.println("Thank you for your vote " + member + "!");
                return flavor;
            } else {
                System.out.println("That is not a valid flavor. Please try again.");
            }
        }
    }

}
