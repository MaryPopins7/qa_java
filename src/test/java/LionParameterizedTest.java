
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest{
    private final String defaultSex;
    private final boolean expected;

    public LionParameterizedTest(String gender, boolean expected) {
        this.defaultSex = gender;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index} : doesHaveMane() = {1}")
    public static Object[][] lionIsCreateData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void lionIsCreate() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(defaultSex, feline);
        boolean actual = lion.doesHaveMane();

        assertEquals(expected, actual);
    }
}