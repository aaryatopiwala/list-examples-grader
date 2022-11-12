import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

class OddWordChecker implements StringChecker {
  public boolean checkString(String s) {
      return ((s.length() % 2) == 1);
  }
}

class OWordChecker implements StringChecker {
  public boolean checkString(String s) {
      return s.contains("o") || s.contains("O");
  }
}

public class TestListExamples {
  // Write your grading tests here!
  @Test
  public void testFilter() {
      OddWordChecker odd = new OddWordChecker();
      ArrayList<String> input1 = new ArrayList<>();
      input1.add("o");
      input1.add("aa");
      input1.add("aaa");
      ArrayList<String> output1 = new ArrayList<>();
      output1.add("o");
      output1.add("aaa");
      List<String> expected = ListExamples.filter(input1, odd);
      assertEquals(output1, expected);
  }

  @Test
    public void testMerge() {
        ArrayList<String> input1 = new ArrayList<>();
        input1.add("a");
        input1.add("c");
        ArrayList<String> input2 = new ArrayList<>();
        input2.add("b");
        input2.add("d");
        input2.add("e");
        ArrayList<String> output1 = new ArrayList<>();
        output1.add("a");
        output1.add("b");
        output1.add("c");
        output1.add("d");
        output1.add("e");
        List<String> expected = ListExamples.merge(input1, input2);
        assertEquals(output1, expected);
    }
}
