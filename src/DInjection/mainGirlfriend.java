package DInjection;

public class mainGirlfriend {
    public static void main(String[] args) {
        GirlFriend amaka = new GirlFriend(new Joel());
        amaka.spend();
        System.out.println("I am no longer interested in this relationship");
        System.out.println();
        amaka = new GirlFriend(new Harry());
        amaka.spend();
        System.out.println("I am no longer feeling this relationship");
        System.out.println();
        amaka = new GirlFriend(new Edmund());
        amaka.spend();
        
    }



}
