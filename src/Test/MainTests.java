import com.ArcSoftware.*;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Jake on 4/11/17.
 */

import static org.junit.Assert.*;

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
        assertEquals(1,BlockCounter.maxBlock("antidisestablishmentarianism"));
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