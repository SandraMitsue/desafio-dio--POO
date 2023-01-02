package br.com.dio.desafio;

import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Curso conteudoPOO = new Curso();
        conteudoPOO.setTitulo("Curso de POO");
        conteudoPOO.setDescricao("Curso de POO com Java");
        conteudoPOO.setCargaHoraria(8);

        Mentoria conteudoPadroesDeProjeto = new Mentoria();
        conteudoPadroesDeProjeto.setTitulo("Mentoria de Padrões de Projeto");
        conteudoPadroesDeProjeto.setDescricao("Mentoria de Padrões de Projeto com Java");
        conteudoPadroesDeProjeto.setData(LocalDate.now());

        DesafioProjeto desafioProjetoJava = new DesafioProjeto(new HashSet<>() {{
            add("Java");
            add("OO");
            add("DesignPatterns");
        }});
        desafioProjetoJava.setTitulo("Desafio de Projeto de OO");
        desafioProjetoJava.setDescricao("Desafio de Projeto de OO com Java");
        desafioProjetoJava.setDificuldade(2);

        System.out.println(" --- Bootcamp --- ");

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descrição Bootcamp Java Developer");
        bootcampJava.getConteudos().add(conteudoPOO);
        bootcampJava.getConteudos().add(conteudoPadroesDeProjeto);
        bootcampJava.getConteudos().add(desafioProjetoJava);
        System.out.println(bootcampJava.getConteudos());

        System.out.println(" --- Camila --- ");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcampJava);

        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();

        System.out.println("_");

        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println(" --- João --- ");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcampJava);

        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("_");

        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }

}