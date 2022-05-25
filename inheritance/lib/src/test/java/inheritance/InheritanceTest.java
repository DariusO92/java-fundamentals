package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.SQLOutput;

public class InheritanceTest {
    @Test
    void toStringReturnsReview() {
        Restruant restruantOne = new Restruant( "popeyes", "$$");
        Review x = new Review("TY", "SubPar", 0);
        restruantOne.addReview(x);
        System.out.println(restruantOne.toString());
        Review test = restruantOne.reviews.get(0);
        System.out.println(test.toString());
        assertEquals("name: popeyes price: $$ numberOfStars: 0.", restruantOne.toString());

    }

    @Test
    void toStringReturnShop() {
        Shop shopOne = new Shop("Safeway", "food store", 4);
        Review one = new Review("Tom ", "decent ",  2);
        shopOne.addReview(one);
        System.out.println(shopOne.toString());
        Review test = shopOne.reviews.get(0);
        System.out.println(test.toString());
        //assertEquals();
    }
}
