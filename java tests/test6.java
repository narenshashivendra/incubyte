import org.junit.Test;
import org.junit.Assert;

public class test6 {

@Test
public final void whenDelimiterSpecified_SeparateNumbers() {
    Assert.assertEquals(7+9+11, program6.add("//;n7;9;11"));
}
}
