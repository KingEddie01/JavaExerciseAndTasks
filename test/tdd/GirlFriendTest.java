package tdd;

import DInjection.*;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GirlFriendTest {
    @Test
    public void testGirlfriendExist(){
        GirlFriend girlFriend = new GirlFriend(null);
        assertNotNull(girlFriend);
    }
    @Test
    public void testGirlFriendCanSpend(){
        GirlFriend ashley = new GirlFriend(new Joel());
        ashley.spend();
        System.out.println("I no dey do again");
    }
    @Test
    public void testGirlFriendCanSpendDifferently(){
        GirlFriend ashley = new GirlFriend(new Harry());
        ashley.spend();
        System.out.println("It is over between us");
    }
    @Test
    public void testGirlFriendCanSpendDifferentlyAgain(){
        GirlFriend ashley = new GirlFriend(new Edmund());
        ashley.spend();
    }

}
