package sandbox;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import mockit.Expectations;

import org.junit.Test;

public class HelloManTest {

    HelloMan helloMan = new HelloMan();

    @Test
    public void testSay() {
        new Expectations() {
            AbstractMan man;
            {
                man.communicate();
                result = "Kon-nichiwa!";
            }
        };

        assertThat(helloMan.communicate(), equalTo("Kon-nichiwa!"));
    }
}
