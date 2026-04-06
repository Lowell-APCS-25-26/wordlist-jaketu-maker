
package org.APCSLowell;

import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class Tester {

   @Test
   public void partA () {
      WordList test1 = new WordList();
      test1.add("cat");
      test1.add("mouse");
      test1.add("frog");
      test1.add("dog");
      test1.add("dog");
      int result = test1.numWordsOfLength(4);
      assertEquals(1, result);
      result = test1.numWordsOfLength(3);
      assertEquals(3, result);
      result = test1.numWordsOfLength(2);
      assertEquals(0, result);
   }

   @Test
   public void partB(){
      WordList test2 = new WordList();
      test2.add("cat");
      test2.add("mouse");
      test2.add("frog");
      test2.add("dog");
      test2.add("dog");
      test2.removeWordsOfLength(4);
      String result = "[cat, mouse, dog, dog]";
      assertEquals(test2.toString(),result);
      test2.removeWordsOfLength(3);
      result = "[mouse]";
      assertEquals(test2.toString(),result);
      test2.removeWordsOfLength(2);
      assertEquals(test2.toString(),result);
   }


}
