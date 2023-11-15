package Segundo_cuestionario;

import Pojo.Candidato;

import java.util.*;

public class EvaluacionTecnicaPil2 {
    public static void main(String[] args) {
        imprimirBienvenidaEvaluacionTecnica();
        imprimirMensajePunto(1);

        List<Candidato> candidatos = inicializarCandidatos();

        resolverPunto1(candidatos);

        imprimirMensajePunto(2);
        resolverPunto2(candidatos);

        imprimirMensajePunto(3);
        resolverPunto3(candidatos);

        imprimirMensajePunto(4);
        resolverPunto4(candidatos);

        imprimirMensajePunto(5);
        resolverPunto5(candidatos);

    }

    private static List<Candidato> inicializarCandidatos() {
        List<Candidato> candidatos = new ArrayList<>();

        Candidato candidato1 = new Candidato(3, "Jhon", "Doe", 5000, 2, "1-Java, 2-Angular, 3-SQL");
        Candidato candidato2 = new Candidato(7, "Matias", "Otamendi", 300, 9, "8-NodeJS, 1-Java, 3-SQL");
        Candidato candidato3 = new Candidato(1, "Joaquin", "Tagliafico", 2000, 6, "7-MongoDB, 4-NoSQL");
        Candidato candidato4 = new Candidato(4, "Gaston", "Mac Allister", 5000.50, 1, "1-Java, 5-Vue, 3-SQL");
        Candidato candidato5 = new Candidato(5, "Pablo", "De Paul", 9000.50, 4, "1-Java");
        Candidato candidato6 = new Candidato(2, "Lucas", "Di Maria", 6000, 7, "1-Java, 2-Angular, 3-SQL");
        Candidato candidato7 = new Candidato(10, "Lionel", "Messi", 10000.10, 10, "1-Java, 5-Vue, 3-SQL");
        Candidato candidato8 = new Candidato(9, "Julian", "Alvarez", 5000, 3, "1-Java, 4-NoSQL, 7-MongoDB, 3-SQL");
        Candidato candidato9 = new Candidato(8, "Lula", "Martinez", 1000, 2, "1-Java, 2-Angular, 6-NET");
        Candidato candidato10 = new Candidato(6, "Agustin", "Dybala", 1000, 2, "1-Java, 2-Angular, 6-NET");

        candidatos.add(candidato1);
        candidatos.add(candidato2);
        candidatos.add(candidato3);
        candidatos.add(candidato4);
        candidatos.add(candidato5);
        candidatos.add(candidato6);
        candidatos.add(candidato7);
        candidatos.add(candidato8);
        candidatos.add(candidato9);
        candidatos.add(candidato10);

        return candidatos;
    }

    private static void resolverPunto1(List<Candidato> candidatos) {
        for (Candidato candidato : candidatos) {
            System.out.println(candidato);
        }
    }

    private static void resolverPunto2(List<Candidato> candidatos) {
        candidatos.stream()
                .sorted(Comparator.comparingInt(Candidato::getId))
                .forEach(candidato -> System.out.println("ID: " + candidato.getId() + ", Nombre: " + candidato.getNombre() + " " + candidato.getApellido()));
    }

    private static void resolverPunto3(List<Candidato> candidatos) {
        candidatos.stream()
                .sorted(Comparator.comparingDouble(Candidato::getPretensionSalarial).reversed())
                .forEach(candidato -> System.out.println("Pretensión Salarial: " + candidato.getPretensionSalarial() +
                        ", Nombre: " + candidato.getNombre() + " " + candidato.getApellido()));
    }

    private static void resolverPunto4(List<Candidato> candidatos) {
        Optional<Candidato> candidatoConMasExperiencia = candidatos.stream()
                .max(Comparator.comparingInt(Candidato::getAnosExperiencia));

        candidatoConMasExperiencia.ifPresent(candidato -> {
            System.out.println("Candidato con mayor experiencia:\n" + candidato.toString());
            System.out.println("Tecnologías ordenadas:\n" + candidato.ordenarTecnologias().toString());
        });
    }

    private static void resolverPunto5(List<Candidato> candidatos) {
        Optional<Candidato> candidatoConMasTecnologias = candidatos.stream()
                .max(Comparator.comparingInt(candidato -> contarTecnologias(candidato.getTecnologias())));

        candidatoConMasTecnologias.ifPresent(candidato -> {
            System.out.println("Candidato con más tecnologías:\n" + candidato.toString());

            String[] tecnologiasCandidato = candidato.getTecnologias().split(", ");

            Optional<String> tecnologiaIdPar = Arrays.stream(tecnologiasCandidato)
                    .filter(tecnologia -> esIdPar(tecnologia))
                    .findFirst();

            tecnologiaIdPar.ifPresent(tecnologia -> System.out.println("Primera tecnología con ID par: " + tecnologia));
        });
    }

    private static boolean esIdPar(String tecnologia) {
        int id = Integer.parseInt(tecnologia.split("-")[0]);
        return id % 2 == 0;
    }

    private static int contarTecnologias(String tecnologias) {
        String[] tecnologiasArray = tecnologias.split(", ");
        return tecnologiasArray.length;
    }


    private static void imprimirBienvenidaEvaluacionTecnica() {
        System.out.println("\n*******************************************");
        System.out.println("Bienvenidos a la segunda Evaluacion Tecnica." + "\n" +
            "Les deseamos muchos exitos!");
        System.out.println("*******************************************\n");
    }
    private static void imprimirMensajePunto(int numeroPunto) {
        System.out.println("\n*******");
        System.out.println("PUNTO " + numeroPunto);
        System.out.println("*******\n");
    }
}