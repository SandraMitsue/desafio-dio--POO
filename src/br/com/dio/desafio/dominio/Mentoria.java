package desafio.dominio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;

@Getter
@Setter
@ToString(callSuper = true)
public class Mentoria extends desafio.dominio.Conteudo {

    LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}