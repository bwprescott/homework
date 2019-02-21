import org.junit.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class factorialTest {
    @Test
    void sanity(){
        assertEquals(6, factorial.factorials(3));
    }
}
