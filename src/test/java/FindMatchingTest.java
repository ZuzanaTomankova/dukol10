import org.example.FindMatching;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FindMatchingTest {

    @Test
    public void findMatching(){
        Double testResult = FindMatching.findMatching(List.of(12.0,8.126,6.0), 11.0, 12.6);
        Double expected = 12.0;

        Assertions.assertEquals(expected,testResult);
    }

    @Test
    public void findMatching2(){
        Double testResult = FindMatching.findMatching(List.of(12.0,8.126,9.0,158.0,6.0), 8.0, 10.0);
        Double expected = 8.126;

        Assertions.assertEquals(expected,testResult);
    }




}
