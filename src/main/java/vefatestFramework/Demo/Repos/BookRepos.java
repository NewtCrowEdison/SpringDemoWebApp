package vefatestFramework.Demo.Repos;

import org.springframework.data.repository.CrudRepository;
import vefatestFramework.Demo.domain.Book;

public interface BookRepos extends CrudRepository<Book, Long> {
}