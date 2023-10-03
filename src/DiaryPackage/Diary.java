package DiaryPackage;

import java.util.ArrayList;
import java.util.Objects;



public class Diary {
    private  String username;
    private  String password;
    private boolean isLocked;

    private final ArrayList<Entry> diaries = new ArrayList<>();

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void locked() {
        isLocked = true;
    }

    public boolean getIsLocked() {
        return isLocked;
    }

    public void isUnlocked(String password) {
        isLocked = false;
    }

    public String getPassword() {
        return password;
    }

    public int generateId() {
        return diaries.size() + 1;
    }

    public Entry findEntry(int id) {
        for (Entry entry : diaries) {
            if (entry.getId() == id)
                return entry;
        }
        throw new IllegalArgumentException("CANNOT FIND ENTRY");
    }


    public void createEntry(String title, String body) {
        Entry entry = new Entry(generateId(), title, body);
        if (entry.getTitle() == null && entry.getBody() == null) {
            throw new IllegalArgumentException("TITLE AND BODY CANNOT BE EMPTY");
        } else {
            diaries.add(entry);
        }
    }
    public void deleteEntry(int id) {
        Entry entry = findEntry(id);
        diaries.remove(entry);

    }
    public void updateEntry(int id, String newTitle, String newBody) {
        Entry entry = findEntry(id);
        entry.setTitle(newTitle);
        entry.setBody(newBody);
        entry.setId(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Diary diary)) return false;
        return isLocked == diary.isLocked &&
                Objects.equals(getUsername(), diary.getUsername()) &&
                Objects.equals(getPassword(), diary.getPassword()) &&
                Objects.equals(diaries, diary.diaries);
    }

}

