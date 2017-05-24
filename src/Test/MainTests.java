import com.ArcSoftware.BlockCounter;
import com.ArcSoftware.Weave;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jake on 4/11/17.
 */

public class MainTests {

//    @Test
////    public void balancedReturnsMatchCount() throws Exception {
//        assertFalse(Main.balance("creek", 'e'));
//        assertTrue(Main.balance("prrt", 'r'));
//        assertTrue(Main.balance("wowx", 'w'));
//
//    @Test
//    public void rosebudReturnsTheApproprateMoneys{
//
//    }
//
//}
//    @Test
//    public void titleCaseAppropriatelyCasesWords() {
//        assertEquals("San Diego", TitleCase.titleCase("sAND DieGO"));
//    }

    @Test
    public void maxBlockTesterTurnsLongestRunOfCharactersInString() {
        assertEquals(2, BlockCounter.maxBlock("hoopla"));
        assertEquals(3, BlockCounter.maxBlock("abbCCCddBBxx"));
        assertEquals(2, BlockCounter.maxBlock("mississippi"));
        assertEquals(1, BlockCounter.maxBlock("antidisestablishmentarianism"));
    }
    @Test
    public void testweavetester() {
        assertEquals("xbcxefx", Weave.weaveCreate("abcdefg", 3));
        assertEquals("xoxoxo", Weave.weaveCreate("bobobo", 2));
    }
//    @Test
//    public void testHousesNearRestraunt() {
//        assertEquals(3, Desireable.desire("rhhhh"));
//        assertEquals(2, Desireable.desire("rhhhr"));
//
//    }
}