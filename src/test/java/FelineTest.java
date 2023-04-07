import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String family = feline.getFamily();
        assertEquals("Кошачьи", family);
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int count = feline.getKittens(1);
        assertEquals(1, count);
    }

    @Test
    public void eatMeatTest() {
        Feline feline = new Feline();
        List<String> eat = new ArrayList<String>();
        eat = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), eat);
    }
}
