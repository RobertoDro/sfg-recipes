package guru.springframework.sfgrecipes.repositories;

import guru.springframework.sfgrecipes.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
