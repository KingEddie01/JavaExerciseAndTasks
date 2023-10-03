public class Friend {
    private String name;
    private static int numberOfFriends;

    public String getName() {
        return name;
    }

    public static int getNumberOfFriends() {
        return numberOfFriends;
    }

    public Friend(String name){
        this.name = name;
        numberOfFriends++;
    }



}
