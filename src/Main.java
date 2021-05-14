import kotlin.coroutines.RestrictsSuspension;
import org.junit.Test;

import java.util.Scanner;


/**
 * Simple 10 question quiz
 */
class Main {
    public static void main(String[] args) {
        String q1 = "What year was the Declaration of Independance signed?" + "(a) 2004, (b) 1792, (c) 1776, or (d) 1590";
        String q2 = "What year did the Milwaukee Brewers win the World Series?" + "(a) 2020, (b) 1992, (c) 1976, or (d) Never";
        String q3 = "What is the airspeed velocity of an unladen swallow?" + "(a) 24 mph, (b) 10mph, (c) 100mph, or (d) I don't know that!";
        String q4 = "What is the name of the Simpsons dog?" + "(a) Spot, (b) Santa's Little Helper , (c) Santos L. Halper, or (d) Bruno";
        String q5 = "On Futurama, What is Fry's lucky item?" + "(a) Rabbits Foot, (b) Harmonica, (c) Monkey Paw, or (d) 4 Leaf Clover";
        String q6 = "What is Spiderman's secret identity?" + "(a) Otto Octavious, (b) J.Jonah Jamison, (c) Eddie Brock, or (d) Peter Parker";
        String q7 = "What is the name of Grandpa Simpson's army unit?" + "(a) The Fighting Hellfish, (b) The Fearless Fellows, (c) The Odd Ducks, or (d) He wasn't in the military";
        String q8 = "How long did it take Han Solo to make the Kessel run?" + "(a) 7 days, (b) 30 minutes or less, (c) 12 parsecs, or (d) 6 months";
        String q9 = "On It's Always Sunny in Philadelphia, what item do Frank and Mac lose at the Jersey Shore?" + "(a) Rum Ham, (b) Mac's wallet, (c) Frank's car keys, or (d) Photo of the gang";
        String q10 = "On Rick and Morty, what was the name of the accords that Rick negotiated between Israel and Palestine?" + "(a) The Peace Accords, (b) The Cease Fire Accords, (c) The Harmony Accords, or (d) The Pretty Obvious If You Think About It Accords";

        Question[] questions = {
                new Question(q1, "c"),
                new Question(q2, "d"),
                new Question(q3, "a"),
                new Question(q4, "b"),
                new Question(q5, "d"),
                new Question(q6, "d"),
                new Question(q7, "a"),
                new Question(q8, "c"),
                new Question(q9, "a"),
                new Question(q10, "d"),
        };
        takeTest(questions);
    }

    @Test

        public static void takeTest() {
          takeTest();
      }



        public static void takeTest(Question[] questions) {
            int score = 0;
            Scanner keyboardInput = new Scanner(System.in);

            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i].question);
                String answer = keyboardInput.nextLine();
                if(answer.equals(questions[i].answer)) {
                    score++;
                }
            }
            System.out.println("You got " + score + "/" + questions.length);
        }






}
