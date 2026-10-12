import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Main {
        public static void main(String[] args) {

            ArrayList<University> universities = new ArrayList<>();

            University u1 = new University("GTU",1);
            University u2 = new University("BTU",1);
            University u3 = new University("DTU",1);
            University u4 = new University("PTU",1);
            University u5 = new University("IMU",1);

            universities.add(u1);
            universities.add(u2);
            universities.add(u3);
            universities.add(u4);
            universities.add(u5);

            ArrayList<University> preferences1 = new ArrayList<>();
            ArrayList<University> preferences2 = new ArrayList<>();
            ArrayList<University> preferences3 = new ArrayList<>();
            ArrayList<University> preferences4 = new ArrayList<>();
            ArrayList<University> preferences5 = new ArrayList<>();

            ArrayList<Candidate> candidates = new ArrayList<>();

            preferences1.add(u1);
            preferences1.add(u2);
            preferences2.add(u2);
            preferences2.add(u3);
            preferences3.add(u3);
            preferences3.add(u4);
            preferences4.add(u5);
            preferences5.add(u1);

            Candidate c1 = new Candidate("Gaurav",67.67,preferences5);
            candidates.add(c1);
            Candidate c2 = new Candidate("Kullu",77,preferences2);
            candidates.add(c2);
            Candidate c3 = new Candidate("Jaiyanshoo",95,preferences3);
            candidates.add(c3);
            Candidate c4 = new Candidate("Dheeraj",95,preferences4);
            candidates.add(c4);
            Candidate c5 = new Candidate("Kushal",75,preferences1);
            candidates.add(c5);
            Candidate c6 = new Candidate("Deepesh",88,preferences3);
            candidates.add(c6);


            Counselling co1 = new Counselling(candidates);
            co1.conductCounselling();
            for(Candidate c : candidates){
                if(c.assignedUniversity==null){
                    System.out.println(c.name + " -> Unassigned");
                }else {
                    System.out.println(c.name + " -> " + c.assignedUniversity.name);
                }
            }

        }
    }