package demo.src.main.java.com.example.demo;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/*public interface UrlRepository extends JpaRepository<UrlEntity, Long> {
    Optional<UrlEntity> findByUrlEncurtada(String urlEncurtada);
}
*/

import demo.src.main.java.com.example.urlshortener.model.UrlEntity;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
