import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StableMatchingProblemTest {

    @Test
    public void TestMatch(){
        ArrayList<String> xavierChoices = new ArrayList<String>();
        xavierChoices.add("Amy");
        xavierChoices.add("Bertha");
        xavierChoices.add("Claire");

        ArrayList<String> yanceyChoices = new ArrayList<String>();
        yanceyChoices.add("Bertha");
        yanceyChoices.add("Amy");
        yanceyChoices.add("Claire");

        ArrayList<String> zeusChoices = new ArrayList<String>();
        zeusChoices.add("Amy");
        zeusChoices.add("Bertha");
        zeusChoices.add("Claire");


        ArrayList<String> amyChoices = new ArrayList<String>();
        amyChoices.add("Yancey");
        amyChoices.add("Xavier");
        amyChoices.add("Zeus");

        ArrayList<String> berthaChoices = new ArrayList<String>();
        berthaChoices.add("Xavier");
        berthaChoices.add("Yancey");
        berthaChoices.add("Zeus");

        ArrayList<String> claireChoices = new ArrayList<String>();
        claireChoices.add("Xavier");
        claireChoices.add("Yancey");
        claireChoices.add("Zeus");

        ArrayList<ArrayList<String>> men = new ArrayList<ArrayList<String>>();
        men.add(xavierChoices);
        men.add(yanceyChoices);
        men.add(zeusChoices);

        ArrayList<ArrayList<String>> women = new ArrayList<ArrayList<String>>();
        men.add(amyChoices);
        men.add(berthaChoices);
        men.add(claireChoices);

        assertEquals(true, StableMatchingProblem.stable(men, women, StableMatchingProblem.match(men, women)), "Dummy Test Fix this later");

    }



}