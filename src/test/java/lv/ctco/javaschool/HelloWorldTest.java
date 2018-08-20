package lv.ctco.javaschool;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class HelloWorldTest {

        @Test
        void anagramsCountForNull() {
            assertThrows(ClassNotFoundException.class, () -> {
                char[] array = null; // Testing data
                List<String> anagrams = Main.anagrams(array); // Testable code
            });
        }

        @Test
        void anagramsCountForEmptyArray() {
            char[] array = {}; // Testing data
            List<String> anagrams = Main.anagrams(array); // Testable code
            assertEquals(0, anagrams.size());
        }

        @Test
        void anagramsCountFor2() {
            char[] array = {'a', 'b'}; // Testing data
            List<String> anagrams = Main.anagrams(array); // Testable code
            assertEquals(2, anagrams.size());
        }

        @Test
        void anagramsCountFor3() {
            char[] array = {'a', 'b', 'c'}; // Testing data
            List<String> anagrams = Main.anagrams(array); // Testable code
            assertEquals(6, anagrams.size());
        }


        @Test
        void anagramsCountFor5() {
            char[] array = {'a', 'b', 'c', 'd', 'e'}; // Testing data
            List<String> anagrams = Main.anagrams(array); // Testable code
            assertEquals(120, anagrams.size());
        }


}