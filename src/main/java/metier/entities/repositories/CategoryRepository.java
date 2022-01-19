package metier.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
