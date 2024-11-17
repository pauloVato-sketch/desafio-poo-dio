import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        
        Curso curso3 = new Curso();
        curso2.setTitulo("curso python");
        curso2.setDescricao("descrição do curso python");
        curso2.setCargaHoraria(80);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp Web JS + Python Developer");
        bootcamp2.setDescricao("Descrição Bootcamp Web JS + Python Developer");
        bootcamp2.getConteudos().add(curso3);
        bootcamp2.getConteudos().add(curso2);

        Dev dev = new Dev();
        dev.setNome("Paulo");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos em que "+ dev.getNome() +" está inscrito:" + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("-");
        System.out.println("Conteúdos em que "+ dev.getNome() +" está inscrito:" + dev.getConteudosInscritos());
        System.out.println("Conteúdos concluídos por "+dev.getNome()+" :" + dev.getConteudosConcluidos());
        System.out.println("XP:" + dev.calcularTotalXp());

        System.out.println("-------");

        Dev dev2 = new Dev();
        dev2.setNome("Lucas");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos em que "+ dev2.getNome() +" está inscrito:" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos em que "+ dev2.getNome() +" está inscrito:" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos por "+dev2.getNome()+" :" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());

    }

}
