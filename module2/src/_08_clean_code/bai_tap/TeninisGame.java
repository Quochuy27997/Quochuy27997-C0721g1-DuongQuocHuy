package _08_clean_code.bai_tap;

public class TeninisGame {
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore;
        Boolean isEqual = player1Score==player2Score;
        Boolean isEqual4 = player1Score>=4 || player2Score>=4;
        int subtractionScore = player1Score-player2Score;
        final char SUBTRACTION = '-';
        if (isEqual)
        {
            switch (player1Score)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (isEqual4)
        {
            if (subtractionScore==1) score ="Advantage player1";
            else if (subtractionScore ==-1) score ="Advantage player2";
            else if (subtractionScore>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = player1Score;
                else { score+=SUBTRACTION; tempScore = player2Score;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
