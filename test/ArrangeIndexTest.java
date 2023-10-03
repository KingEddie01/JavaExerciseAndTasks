import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ArrangeIndexTest {
    @Test
    public void testToArrangeWordByIndex(){
        ArrangeByIndex arrangeByIndex = new ArrangeByIndex();
        String expected = String.valueOf(arrangeByIndex.arrange("kissdry"));
        assertEquals(expected, "yssdikr");
    }


    }

