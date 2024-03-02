public class IfThenChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10000;
        int levelComplete = 8;
        int bonus = 200;
        int finalScore = score;

        if(gameOver) {
            finalScore += (levelComplete * bonus);
            System.out.println("Final Score: " + finalScore);
        }
    }
}
