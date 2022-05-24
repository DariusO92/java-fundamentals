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
}
