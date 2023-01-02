import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        desafio.dominio.Curso curso1 = new desafio.dominio.Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        desafio.dominio.Curso curso2 = new desafio.dominio.Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);



        desafio.dominio.Mentoria mentoria = new desafio.dominio.Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        desafio.dominio.Bootcamp bootcamp = new desafio.dominio.Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        desafio.dominio.Dev devLuiz = new desafio.dominio.Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Luiz:" + devLuiz.getConteudosInscritos());
        devLuiz.progredir();
        devLuiz.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devLuiz.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devLuiz.getConteudosConcluidos());
        System.out.println("XP:" + devLuiz.calcularTotalXp());

        System.out.println("-------");

        desafio.dominio.Dev devJoao = new desafio.dominio.Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}