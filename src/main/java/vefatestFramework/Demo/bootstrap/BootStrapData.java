package vefatestFramework.Demo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vefatestFramework.Demo.Repos.AuthorRepos;
import vefatestFramework.Demo.Repos.BookRepos;
import vefatestFramework.Demo.domain.Author;
import vefatestFramework.Demo.domain.Book;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepos authorRepos;

    private final BookRepos bookRepos;

    public BootStrapData(AuthorRepos authorRepos, BookRepos bookRepos){
        this.authorRepos = authorRepos;
        this.bookRepos = bookRepos;
    }
    @Override
    public void run(String... args) throws Exception {
        Author JRR = new Author("JRR", "Tolkien");
        Book LOTR = new Book("Lord of The Rings", "0000001");
        JRR.getBooks().add(LOTR);
        LOTR.getAuthors().add(JRR);

        authorReposuthorRepos.save(JRR);
        bookReposookRepos.save(LOTR);

        Author Stephen = new Author("Stephen", "King");
        Book SilentHills = new Book("Silent Hills", "0000002");
        Stephen.getBooks().add(SilentHills);
        SilentHills.getAuthors().add(Stephen);

        authorReposuthorRepos.save(Stephen);
        bookReposookRepos.save(SilentHills);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + BookRepos.count());
    }
}
