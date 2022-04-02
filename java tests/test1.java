

import org.junit.Test;
import org.junit.Assert;
public class test1
{
    @Test(expected = RuntimeException.class)
    public final void morethan2numbers_exceptionthrown()
    {
        program1.Add("1,2,3");
    }
    @Test
    public final void only2numbers_noexceptionthrown() {
        program1.Add("1,2");
        Assert.assertTrue(true);
    }
     @Test(expected = RuntimeException.class)
    public final void nonnumberused_exceptionthrown() {
        program1.Add("1,X");
    }
   
}