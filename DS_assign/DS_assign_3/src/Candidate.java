import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Candidate {

    String name;
    double percentage;
    ArrayList<University> preferences;
    University assignedUniversity;
    int random;


    Candidate(String name, double percentage, ArrayList<University> preferences ){
        this.name = name;
        this.percentage = percentage;
        this.preferences = preferences;
        Random randomGenrator = new Random();
        this.random = randomGenrator.nextInt(100);
    }
}

class University{
    String name;
    int totalSeats;
    int availableSeats;

    University(String name, int totalSeats){
        this.name = name;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }
}


class Counselling{
    ArrayList <Candidate> candidates;
    Queue<Candidate> queue;
    ArrayList<Candidate> unassigned;
    Counselling(ArrayList <Candidate> candidates){
    this.candidates= candidates;
        candidates.sort((a, b) -> {
            int percentageResult = Double.compare(b.percentage, a.percentage);

            if (percentageResult != 0) {
                return percentageResult;
            }

            return Integer.compare(a.random, b.random);
        });
    queue = new LinkedList<>();
        unassigned = new ArrayList<>();
    for (int i =0; i<candidates.size();i++){
        queue.add(candidates.get(i));
    }
}

    void conductCounselling() {
        while (!queue.isEmpty()) {
            Candidate c = queue.poll();
            for (University university : c.preferences) {
                if (university.availableSeats >= 1) {
                    c.assignedUniversity = university;
                    university.availableSeats--;
                    break;
                }
            }
            if (c.assignedUniversity == null) {
                unassigned.add(c);
            }
        }
    }
    void secondRound() {
        Queue<Candidate> round2Queue = new LinkedList<>();

        for (Candidate c : unassigned) {
            round2Queue.add(c);
        }

        // Try counselling again for unassigned candidates
        while (!round2Queue.isEmpty()) {
            Candidate c = round2Queue.poll();

            for (University university : c.preferences) {
                if (university.availableSeats >= 1) {
                    c.assignedUniversity = university;
                    university.availableSeats--;
                    break;
                }
            }
        }
    }

}
