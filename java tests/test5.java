import org.junit.Test;
import org.junit.Assert;

public class test5 {

@Test
public final void newlinesbetweennumbers_numberssumreturned() {
    Assert.assertEquals(1+2+3, program5.Add("1\n2,3"));
}
}
