package exam1;

public class Exam01 {

    private static String player1;
    private static String player2;
    private static int scorePlayer1;
    private static int scorePlayer2;

    public Exam01(String firstPerson, String secondPerson) {
        this.player1 = firstPerson;
        this.scorePlayer1 = 0;
        this.player2 = secondPerson;
        this.scorePlayer2 = 0;
    }


    public void playerAWin() {
        //if (this.scorePlayer1 == 30) this.scorePlayer1 += 10;
        this.scorePlayer1 += 15;
    }

    public void playerBWin() {
        //if (this.scorePlayer2 == 30) this.scorePlayer2 += 10;
        this.scorePlayer2 += 15;
    }

    public String getScore() {
        String score ="";
        Boolean i=false;
        if(scorePlayer1 ==0 && scorePlayer2==0) {
            score = "Love-All";
            i = true;
        }else if(scorePlayer1-scorePlayer2==0 && scorePlayer1>=45){
            score = "Deuce";
            i = true;
        }else if(scorePlayer1>50){
            score = "Win for Player A";
            i = true;
        }else if(scorePlayer2>50){
            score = "Win for Player B";
            i = true;
        }


            if(!i){
                switch (scorePlayer1) {
                    case 0:
                        score = "Love-";
                        i = true;
                        break;
                    case 15:
                        score = "Fifteen-";
                        i = true;
                        break;
                    case 30:
                        score = "Thirty-";
                        i = true;
                        break;
                    case 45:
                        score = "Forty-";
                        i = true;
                        break;
                }

                if(scorePlayer1==scorePlayer2) {
                    score = score + "All";
                    this.scorePlayer1 = 0;
                    this.scorePlayer2 = 0;
                    return score;
                }

                switch (scorePlayer2) {
                    case 0:
                        score = score + "Love";
                        i = true;
                        break;
                    case 15:
                        score = score + "Fifteen";
                        i = true;
                        break;
                    case 30:
                        score = score + "Thirty";
                        i = true;
                        break;
                    case 45:
                        score = score + "Forty";
                        i = true;
                        break;
                }
            }

            if(scorePlayer1==scorePlayer2 && !i)
                score = score + "All";

            System.out.println(scorePlayer1);

            this.scorePlayer1 = 0;
            this.scorePlayer2 = 0;

        return score;
    }

}


