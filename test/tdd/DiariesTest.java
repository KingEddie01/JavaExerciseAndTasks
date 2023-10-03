package tdd;

import DiaryPackage.Diaries;
import DiaryPackage.Diary;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

public class DiariesTest {
    @Test
    public void testYouCanAddDiaries(){
        Diaries eddiesDiary = new Diaries();
        assertNotNull(eddiesDiary);
    }
    @Test
    public void testWeCanAddDiaryToDiaries(){
        Diaries eddiesDiary = new Diaries();
        eddiesDiary.addDiary("kingEddie","money");
        assertEquals(new Diary("kingEddie","money"),eddiesDiary.findByUsername("kingEddie"));
    }


    @Test
    public void testWeCanGetNumberOfDiariesSaved(){
        Diaries eddiesDiary = new Diaries();
        eddiesDiary.addDiary("kingEddie","money");
        assertEquals(new Diary("kingEddie","money"),eddiesDiary.findByUsername("kingEddie"));
        eddiesDiary.addDiary("Sophie","minstrel");
        assertEquals(new Diary("Sophie","minstrel"),eddiesDiary.findByUsername("Sophie"));
        assertEquals(2,eddiesDiary.getNumberOfDiariesSaved());
    }

    @Test
    public void testWeCanDeleteDiary(){
        Diaries eddiesDiary = new Diaries();
        eddiesDiary.addDiary("kingEddie","money");
        assertEquals(new Diary("kingEddie","money"),eddiesDiary.findByUsername("kingEddie"));
        eddiesDiary.addDiary("Sophie","minstrel");
        assertEquals(new Diary("Sophie","minstrel"),eddiesDiary.findByUsername("Sophie"));
        assertEquals(2,eddiesDiary.getNumberOfDiariesSaved());
        eddiesDiary.deleteDiary("kingEddie","money");
        assertThrows(IllegalArgumentException.class, ()-> eddiesDiary.findByUsername("kingEddie"));
        assertEquals(1,eddiesDiary.getNumberOfDiariesSaved());

    }


}