import java.util.Scanner;

public class Uni3Atv2URI {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double π = 3.14159;
        double raio = leitor.nextDouble();
        double areaCirc = π * (raio * raio);
        System.out.println(String.format("A=%.4f",areaCirc));

    }

}
