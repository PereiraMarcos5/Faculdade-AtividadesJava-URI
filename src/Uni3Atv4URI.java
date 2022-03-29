import java.util.Scanner;

public class Uni3Atv4URI {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double mediaAluno = (A*3.5+B*7.5)/11;
        System.out.println(String.format("MEDIA = %.5f",mediaAluno));

    }

}
