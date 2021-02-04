package pt.rleonardo.solid.isp.solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class TextProcessorTests {

    @Test
    public void simple_test() {

        // No need to use the "complex" interface
        TextProcessor processor = new TextProcessorImpl();

        processor.add("Spelynk");
        processor.add("doesnt");
        processor.add("matter");

        assertEquals("Spelynk doesnt matter", processor.text());
    }

    @Test
    public void test_using_language() {

        MultiLanguage processor = new TextProcessorImpl();

        processor.add("I");
        processor.add("am");
        processor.add("hungry");

        assertEquals("I am hungry", processor.text());

        assertTrue(processor.correct(Language.EN));
    }

}