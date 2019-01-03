package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by ab on 01/02/19.
 */
public class CategoryTest {

    Category category;

    @Before
    public void SetUp(){
        category = new Category();
    }

    @Test
    public void getId() {
        Long idValue = 4l;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}