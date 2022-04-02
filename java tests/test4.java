import org.junit.Test;
import org.junit.Assert;

public class test4 {
//@Test(expected = RuntimeException.class)
    //public final void morethan2numbers_exceptionthrown()
    //{
      //  program1.Add("1,2,3");
    //}
@Test
public final void anynumberofnumberused_theirsumreturned() {
    Assert.assertEquals(6+6+8+7+5+15, program4.Add("6,6,8,7,5,15"));
}
}
