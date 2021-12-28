package javapractice;

//A school is holding a contest to test the knowledge of its students.
// A team of five students is formed and each student is skilled in one of the five subjects that the school offers.
// The subject's that are taught at the school are physics(p), chemistry(c), math(m), botany(b), zoology(z).
// Each team can have five students, a student can't be on two teams, and only one person per subject per team.
// So there can't be two people who are good at physics on the team.
//My tasks is, that given a string which pertaining to a list of students identified purely by there skill in a subject
// determine how many teams can be formed.
//For example,pcmpcmbbbzz would return 2 pcmpp would return 0
public class ToptalTest {


    public static void main(String[] args) {

        String list = "ppcccmbbzzzzppccbbzzzmm";
        String[] letters = list.split("");

        int phycount = 0;
        int chemcount = 0;
        int mathcount = 0;
        int botanycount = 0;
        int zoologycount = 0;
        //int teamcount = 0;
        for (String c : letters) {

            if (c.equals("p")) {
                phycount = phycount + 1;

            } else if (c.equals("c")) {
                chemcount = chemcount + 1;

            } else if (c.equals("m")) {
                mathcount = mathcount + 1;

            } else if (c.equals("b")) {
                botanycount = botanycount + 1;

            } else if (c.equals("z")) {
                zoologycount = zoologycount + 1;

            }

        }
        System.out.println("Physics count is " + phycount);
        System.out.println("Chemistry count is " + chemcount);
        System.out.println("mathcount is " + mathcount);
        System.out.println("botany count is " + botanycount);
        System.out.println("zoology count is " + zoologycount);

        if (phycount < chemcount && phycount<mathcount && phycount< botanycount && phycount<zoologycount)
        {

            System.out.println("Team count is "+ phycount);
        }
        else if (chemcount< phycount && chemcount < mathcount && chemcount < botanycount && chemcount < zoologycount)
        {
            System.out.println("Team count is " + chemcount);
        }
        else if (mathcount<phycount && mathcount < chemcount && mathcount < botanycount && mathcount <zoologycount)
        {
            System.out.println("Team count is " + mathcount);
        }
        else if (botanycount<phycount && botanycount < chemcount && botanycount < mathcount && botanycount < zoologycount)
        {
            System.out.println("Team count is " + botanycount);
        }
        else
        {
            System.out.println("Team count is " + zoologycount);
        }

        int x;
        x=phycount;
        if(chemcount<x){x=chemcount;}
        if(mathcount<x){x=mathcount;}
        if(botanycount<x){x=botanycount;}
        if(zoologycount<x){x=zoologycount;}
        System.out.println("The max number of teams possible is: "+x);
    }
}