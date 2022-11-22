import java.util.Scanner;

class Alan {

    public static void main(String[] args) {

        String Alan = "--- Seja Bem Vindo Recruta ---\n\n" +
                ">>> Me chamo Alan <<<\n\n" +
                "Sou a inteligência artificial responsável pela a recepção dos novos\n" +
                "recrutas.\nPara concluir a sua matrícula na agência, preciso de algumas informações\n\n";

        String Nome;
        String Apelido;
        String Nacionalidade;
        String Sexo;
        int idade;

        Scanner resposta = new Scanner(System.in);

        System.out.println(Alan);

        System.out.println("DIGITE SEU NOME: ");
        Nome = resposta.nextLine();

        System.out.println("DIGITE O APELIDO QUE DESEJA SER CHAMADO: ");
        Apelido = resposta.nextLine();

        System.out.println("DIGITE SEU PAÍS DE ORIGEM: ");
        Nacionalidade = resposta.nextLine();

        System.out.println("DIGITE SEU SEXO: ");
        Sexo = resposta.nextLine();

        System.out.println("DIGITE SUA IDADE: ");
        idade = resposta.nextInt();

        System.out.println("\n\n---- Certo, Seus dados foram arquivados ----\n\n");

        System.out.println("NOME: " + Nome);

        System.out.println("APELIDO: " + Apelido);

        System.out.println("PAÍS DE ORIGEM: " + Nacionalidade);

        System.out.println("SEXO: " + Sexo);

        System.out.println("IDADE: " + idade);
    }

}