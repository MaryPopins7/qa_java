import com.example.Feline;
import org.mockito.Mock;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private final String defaultSex = "Самец";
    @Mock
        private Feline feline;


    @Test
    public void felineGetKittensDefaultNumberTest() throws Exception {
        Lion lion = new Lion(defaultSex);
        Assert.assertEquals(1, lion.getKittens());
    }

     @Test
    public void lionGetFood() throws Exception {
        Lion lionAnimal = new Lion(defaultSex);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFood, lionAnimal.getFood());
    }
}

