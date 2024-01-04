package demo.src.main.java.com.example.urlshortener.model;

import java.time.LocalDateTime;

/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;*/

@Entity
public class UrlEntity {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String urlOriginal;
    private String urlEncurtada;
    private LocalDateTime dataCadastro;
    private Long contagemAcessos;
}