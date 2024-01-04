package demo.src.main.java.com.example.urlshortener.controller;

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;*/

import demo.src.main.java.com.example.urlshortener.model.UrlEntity;
import demo.src.main.java.com.example.urlshortener.service.Autowired;
import demo.src.main.java.com.example.urlshortener.service.EstatisticasDTO;
import demo.src.main.java.com.example.urlshortener.service.Service;

public class Controller {
    @Autowired
    private Service urlService;

    @PostMapping("/cadastrar")
    public ResponseEntity<UrlEntity> cadastrarUrl(@RequestBody String urlOriginal) {
        return null;
        // implementa a lógica para cadastrar uma nova URL
    }

    @GetMapping("/{urlEncurtada}")
    public ResponseEntity<Void> acessarUrlEncurtada(@PathVariable String urlEncurtada) {
        return null;
        // implementa a lógica para redirecionar o usuário para a URL original
    }

    @GetMapping("/estatisticas")
    public void obterEstatisticas() {
        // implementa a lógica para obter as estatísticas
    }
}
