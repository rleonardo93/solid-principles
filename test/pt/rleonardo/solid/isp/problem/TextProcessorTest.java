package pt.rleonardo.solid.isp.problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class TextProcessorTest {

    @Test
    public void simple_test() {

        TextProcessor processor = new TextProcessor();

        processor.add("Spelynk");
        processor.add("doesnt");
        processor.add("matter");

        assertEquals("Spelynk doesnt matter", processor.text());
    }

    @Test
    public void test_using_language() {

        TextProcessor processor = new TextProcessor();

        processor.add("I");
        processor.add("am");
        processor.add("hungry");

        assertEquals("I am hungry", processor.text());

        assertTrue(processor.correct(Language.EN));
    }

}