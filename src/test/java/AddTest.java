import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AddTest {
    
    @DisplayName("add Test 1")
    @Test
    void add_Test01() {
        ArrayClass arr = new ArrayClass(5);
        boolean expected1 = true;
        String expected2 = "Test Object: 1 : Ron";
        boolean result1 = arr.add(new TestObject(1, "Ron"));
        String result2 = arr.get(0).toString();
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }
    
    @DisplayName("add Test 2")
    @Test
    void add_Test02() {
        ArrayClass arr = new ArrayClass(5);
        boolean expected1 = true;
        String expected2 = "Test Object: 3 : Paul";
        boolean result1 = arr.add(new TestObject(1, "Ron"));
        result1 = result1 && arr.add(new TestObject(3, "Paul"));
        result1 = result1 && arr.add(new TestObject(7, "Simone"));
        String result2 = arr.get(1).toString();
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }
    
    @DisplayName("add Test 3")
    @Test
    void add_Test03() {
        ArrayClass arr = new ArrayClass(3);
        boolean expected1 = false;
        String expected2 = "Test Object: 2 : Neir";
        boolean result1 = arr.add(new TestObject(1, "Ron"));
        result1 = result1 && arr.add(new TestObject(3, "Paul"));
        result1 = result1 && arr.add(new TestObject(2, "Neir"));
        result1 = result1 && arr.add(new TestObject(7, "Simone"));
        String result2 = arr.get(2).toString();
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }
}
