import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveTest {
    public TestObject[] newArray() {
        TestObject[] tArr = {new TestObject(2, "Wilton"),
                             new TestObject(4, "Sarah"),
                             new TestObject(7, "Peter"),
                             new TestObject(5, "Agnes")};

        return tArr;
    }

    @DisplayName("remove Test 1")
    @Test
    void remove_Test01() {
        ArrayClass arr = new ArrayClass(newArray());
        assertEquals("Test Object: 4 : Sarah", arr.remove(1).toString());
        String result = arr.get(1).toString();
        String expected = "Test Object: 7 : Peter";
        assertEquals(expected, result);
        assertEquals(null, arr.get(3));
    }

    @DisplayName("remove Test 2")
    @Test
    void remove_Test02() {
        ArrayClass arr = new ArrayClass(newArray());
        arr.remove(0);
        arr.remove(1);
        String result = arr.get(1).toString();
        String expected = "Test Object: 5 : Agnes";
        assertEquals(expected, result);
        assertEquals(null, arr.get(2));
    }

    @DisplayName("remove Test 3")
    @Test
    void remove_Test03() {
        ArrayClass arr = new ArrayClass(newArray());
        arr.remove(1);
        arr.remove(1);
        String result = arr.get(1).toString();
        String expected = "Test Object: 5 : Agnes";
        assertEquals(expected, result);
        assertEquals(null, arr.get(2));
    }
}
