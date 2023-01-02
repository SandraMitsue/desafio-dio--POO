package desafio.dominio;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Dev;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dateInicial = LocalDate.now();
    private final LocalDate dataFinal = dateInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

}
