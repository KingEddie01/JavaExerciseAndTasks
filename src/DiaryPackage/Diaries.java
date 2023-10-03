package DiaryPackage;


import java.util.ArrayList;


public class Diaries {
    private final ArrayList<Diary> diariesCollection = new ArrayList<>();
    private final String username;

    public Diaries(){
        this.username = getUsername();
    }
    public void addDiary(String username, String password) {
        Diary diary = new Diary(username, password);
        diariesCollection.add(diary);

    }

    public Diary findByUsername(String username) {
        for (Diary diary : diariesCollection) {
            if (diary.getUsername().equals(username)) {
                return diary;
            }

        }
        throw new IllegalArgumentException("Username cannot be found");
    }

    public int getNumberOfDiariesSaved() {
        return diariesCollection.size();
    }

    public void deleteDiary(String username, String password) {
        Diary diary = findByUsername(username);
        diariesCollection.remove(diary);
    }
    public String getUsername() {

        return username;
    }


    public void updateEntry(int id, String title, String body) {
        Diary diary = findByUsername(username);
        diary.updateEntry(id, title, body);

    }
}

