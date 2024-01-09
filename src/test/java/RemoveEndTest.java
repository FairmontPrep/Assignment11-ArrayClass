import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveEndTest {
    public TestObject[] newArray() {
        TestObject[] tArr = {new TestObject(2, "Wilton"),
                             new TestObject(4, "Sarah"),
                             new TestObject(7, "Peter"),
                             new TestObject(5, "Agnes")};

        return tArr;
    }

    @DisplayName("removeEnd Test 1")
    @Test
    void removeEnd_Test01() {
        ArrayClass arr = new ArrayClass(newArray());
        assertEquals("Test Object: 5 : Agnes", arr.removeEnd().toString());
        String result = arr.get(2).toString();
        String expected = "Test Object: 7 : Peter";
        assertEquals(null, arr.get(3));
        assertEquals(expected, result);
    }

    @DisplayName("removeEnd Test 2")
    @Test
    void removeEnd_Test02() {
        ArrayClass arr = new ArrayClass(newArray());
        arr.removeEnd();
        arr.removeEnd();
        String result = arr.get(1).toString();
        String expected = "Test Object: 4 : Sarah";
        assertEquals(null, arr.get(2));
        assertEquals(expected, result);
    }

    @DisplayName("removeEnd Test 3")
    @Test
    void removeEnd_Test03() {
        ArrayClass arr = new ArrayClass(newArray());
        arr.removeEnd();
        arr.removeEnd();
        arr.removeEnd();
        String result = arr.get(0).toString();
        String expected = "Test Object: 2 : Wilton";
        assertEquals(null, arr.get(1));
        assertEquals(expected, result);
    }
}
