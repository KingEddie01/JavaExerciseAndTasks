package tdd;

import DiaryPackage.Diary;
import DiaryPackage.Entry;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiaryTest {
    @Test
    public void testThatWeHaveADiaryObject(){
        Diary mydiary = new Diary("Edmund Udeh", "password");
        assertNotNull(mydiary);
    }
    @Test
    public void testThatDiaryIsLocked(){
        Diary mydiary = new Diary("Edmund Udeh","password");
        mydiary.locked();
        assertTrue(mydiary.getIsLocked());

    }
    @Test
    public void testThatWeCanLockDiary(){
        Diary mydiary = new Diary("Edmund Udeh","password");
        mydiary.isUnlocked("password");
        assertFalse(mydiary.getIsLocked());
    }

    @Test
    public void testYouCanCreateEntryInDiary(){
        Diary mydiary = new Diary("Edmund Udeh","password");
        mydiary.createEntry("God's love","God is love");
        assertEquals(new Entry(1,"God's love","God is love").getEntry(),
                mydiary.findEntry(1).getEntry());
    }

    @Test
    public void testYouCanCreateMultipleEntriesInDiary(){
        Diary mydiary = new Diary("Edmund Udeh","password");
        mydiary.createEntry("God's love","God is love");
        assertEquals(new Entry(1,"God's love","God is love").getEntry(),
                mydiary.findEntry(1).getEntry());
        mydiary.createEntry("Love story","Love is me");
        assertEquals(new Entry(2,"Love story","Love is me").getEntry(),
                mydiary.findEntry(2).getEntry());

    }
    @Test
    public void testYouCanDeleteEntryFromDiary(){
        Diary mydiary = new Diary("Edmund Udeh","password");
        mydiary.createEntry("God's love","God is love");
        assertEquals(new Entry(1,"God's love","God is love").getEntry(),
                mydiary.findEntry(1).getEntry());
        mydiary.createEntry("Love story","Love is me");
        assertEquals(new Entry(2,"Love story","Love is me").getEntry(),
                mydiary.findEntry(2).getEntry());
        mydiary.deleteEntry(1);
        assertThrows(IllegalArgumentException.class, ()-> mydiary.findEntry(1));

    }
    @Test
    public void testToFindEntryById(){
        Diary mydiary = new Diary("Edmund Udeh","password");
        mydiary.createEntry("God's love","God is love");
        mydiary.createEntry("Love story","Love is me");
        mydiary.findEntry(2);
        assertEquals(new Entry(2,"Love story","Love is me"), mydiary.findEntry(2));

    }
    @Test
    public void testToUpdateEntryInDiary(){
        Diary mydiary = new Diary("Edmund Udeh","password");
        mydiary.createEntry("God's love","God is love");
        assertEquals(new Entry(1,"God's love","God is love").getEntry(),
                mydiary.findEntry(1).getEntry());
        mydiary.createEntry("Love story","Love is me");
        assertEquals(new Entry(2,"Love story","Love is me").getEntry(),
                mydiary.findEntry(2).getEntry());
        mydiary.updateEntry(1,"Make money","I am a money magnet");
        assertEquals(new Entry(1,"Make money","I am a money magnet").getEntry(),
                mydiary.findEntry(1).getEntry());
    }





    }

