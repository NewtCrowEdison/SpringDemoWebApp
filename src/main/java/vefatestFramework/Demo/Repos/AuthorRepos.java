package vefatestFramework.Demo.Repos;

import org.springframework.data.repository.CrudRepository;
import vefatestFramework.Demo.domain.Author;

public interface AuthorRepos extends CrudRepository<Author, Long> {
}
