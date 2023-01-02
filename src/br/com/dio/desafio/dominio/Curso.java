package desafio.dominio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Curso extends desafio.dominio.Conteudo {

    private int cargaHoraria;


    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}

