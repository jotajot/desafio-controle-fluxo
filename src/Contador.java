import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int parametroUm = scanner.nextInt();
        int parametroDois = scanner.nextInt();

        try{
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
        int contagem = parametroDois - parametroUm;
        for(int i = 1; i <= contagem; i++){
            System.out.println("imprimindo o número " + i);
        }
    }

    private static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String mensagem) {
            super(mensagem);
        }
    }
}
