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
        scorePlayer1++;
    }

    public void playerBWin() {
        scorePlayer2++;
    }

    public String getScore() {
        String score ="";
        if(isAll()){
            score = convertToString(scorePlayer1)+score+"-All";
        }else if(isDeuce()){
            score = "Deuce";
        }else if(isAdvantage()){
            score =  (scorePlayer1>scorePlayer2)? "Advantage Player A": "Advantage Player B";
        }else if(isWinner()){
            score = (scorePlayer1>scorePlayer2)? "Win for Player A" : "Win for Player B";
        }else if(isNormal()){
            score = convertToString(scorePlayer1)+"-"+convertToString(scorePlayer2);
        }

        this.scorePlayer1=0;
        this.scorePlayer2=0;

        return score;
    }

    public boolean isAll(){
        return (scorePlayer1==scorePlayer2 && scorePlayer1 <=2);
    }

    public boolean isDeuce(){
        return (scorePlayer1 == scorePlayer2  && scorePlayer1>=3 );
    }

    public boolean isAdvantage(){
        return (Math.abs(scorePlayer1-scorePlayer2)==1 && scorePlayer1 >=3 && scorePlayer2>=3 );
    }

    public boolean isWinner(){
        return (Math.abs(scorePlayer1-scorePlayer2)>=2 && (scorePlayer1>=4 ||scorePlayer2>=4));
    }

    public boolean isNormal(){
        return (scorePlayer1 <= 4 && scorePlayer2<= 4);
    }

    public  String convertToString(int input){
        if(input >3) return "";
        String[] score = {"Love", "Fifteen", "Thirty", "Forty"};
        return score[input];
    }

}


