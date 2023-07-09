import java.util.Arrays;
import java.util.Random;



public class PresidentVote {
    public static void main(String[] args) {
        int numPerson = 4;
        int totalVotes = 10000;
        int count = 0;

        int[] vote = new int[numPerson];
        String[] person = {"이재명", "윤석열", "심상정", "안철수"};

        while (count < totalVotes) {
            int i = new Random().nextInt(numPerson);
            vote[i] += 1;
            count++;
            int total = Arrays.stream(vote).sum();
            System.out.printf("[투표진행률] : %.2f%%, %d명 투표 => %s \n", (total / (double) totalVotes) * 100, count, person[i]);
            for (int j = 0; j < person.length; j++) {
                System.out.printf("[기호 : %d] %s : %02.2f%%, (투표수 : %d) \n", j + 1, person[j], (vote[j] / (double) totalVotes) * 100, vote[j]);
            }

        }

        int winner = 0;
        for (int i = 1; i < numPerson; i++) {
            if (vote[i] >= vote[winner]) {
                winner = i;
            }
        }

        System.out.printf("[투표결과] 당선인 : %s\n", person[winner]);
    }
}
