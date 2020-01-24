import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class HelloTest {
    private Hello hello;

    @Before
    public void createHelloObject(){
        hello = new Hello();
    }

    @Test
    public void sayHelloFromPerson(){
        String greeting = hello.sayHello("Ira");
        assertEquals("The name is not same", greeting, ("Hello Ira !"));
    }
}
