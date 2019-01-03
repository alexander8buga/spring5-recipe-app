package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ab on 01/02/19.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
