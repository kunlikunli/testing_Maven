package testing_maven.testing_maven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestNumberBuilder {
	@Test
    public void testLucky() {
        assertEquals(10, NumberBuilder.getNumber10());
    }
	
	@Test
    public void testHelloWorld() {
        assertEquals("Hello World", NumberBuilder.HelloWord());
    }
}
