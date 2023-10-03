public class MethodStatic {
    public static void main(String[] args) {
        for (int count = 0; count< 11;count++){
            Friend friend= new Friend("Bayo");
        }
        System.out.println(Friend.getNumberOfFriends());
    }
}
