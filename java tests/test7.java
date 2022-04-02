import org.junit.Test;
import org.junit.Assert;

public class test7 {

@Test(expected = RuntimeException.class)
public final void oneNegativeNumberUsed_runtimeExceptionThrown() {
    program7.Add("3,6,6,-18,67,87",",");
}
@Test
public final void manyNegativeNumbersUsed_runtimeExceptionThrown() {
    RuntimeException exception = null;
    try {
        program7.Add("3,6,6,-18,-67,87",",");
    } catch (RuntimeException e) {
        exception = e;
    }
    Assert.assertNotNull(exception);
    Assert.assertEquals("Negatives not allowed: [-18, -67]", exception.getMessage());
}
}
