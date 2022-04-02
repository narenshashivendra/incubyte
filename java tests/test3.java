import org.junit.Test;
import org.junit.Assert;

public class test3 {
@Test
public final void onenumberused_sameisreturned() {
    Assert.assertEquals(6, program3.Add("3"));
}
 
@Test
public final void twonumberused_theirsumreturned() {
    Assert.assertEquals(6+6, program3.Add("6,6"));
}
}