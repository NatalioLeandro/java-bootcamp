import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Descrição do curso de Java Básico");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Intermediário");
        curso2.setDescricao("Descrição do curso de Java Intermediário");
        curso2.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Como fazer um commit no GitHub");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp de Java para formação de desenvolvedores");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("João");
        dev.inscreverBootcamp(bootcamp);
        dev.progredir();
        dev.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: ");
        dev.getConteudosInscritos().forEach(System.out::println);
        System.out.println("-");
        System.out.println("Conteúdos concluídos: ");
        dev.getConteudosConcluidos().forEach(System.out::println);
        System.out.println("-");
        System.out.println("XP: " + dev.calcularTotalXp());

        System.out.println("-------");

        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: ");
        dev2.getConteudosInscritos().forEach(System.out::println);
        System.out.println("-");
        System.out.println("Conteúdos concluídos: ");
        dev2.getConteudosConcluidos().forEach(System.out::println);
        System.out.println("-");
        System.out.println("XP: " + dev2.calcularTotalXp());

    }
}