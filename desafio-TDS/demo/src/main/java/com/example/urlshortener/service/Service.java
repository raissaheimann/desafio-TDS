package demo.src.main.java.com.example.urlshortener.service;

import java.util.List;

import demo.src.main.java.com.example.urlshortener.model.UrlEntity;

public class Service {
    @Autowired
    private UrlRepository urlRepository;

    public UrlEntity cadastrarUrl(String urlOriginal) {
        return null;
        // implementa a lógica pra encurtar a URL, salvar no banco de dados e retornar a entidade salva
    }

    public UrlEntity obterUrlPorUrlEncurtada(String urlEncurtada) {
        return null;
        // implementa a lógica para obter a URL pelo código encurtado
    }

    public void obterTodasUrls() {
        // implementa a lógica para obter todas as URLs do banco de dados
    }

    public void registrarAcesso(Long id) {
        // implementa a lógica para registrar o acesso a uma URL e atualizar a contagem de acessos
    }

    public void obterEstatisticas() {
        // implementa a lógica para calcular as estatísticas (média de acessos por dia e total geral)
    }
}
