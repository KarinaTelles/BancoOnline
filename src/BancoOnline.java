import java.util.Scanner;

public class BancoOnline {
    String donoDaConta = "Karina";
    String tipoDaConta = "Corrente";
    Double saldoDaConta = 0.0;
    double valor;
    Scanner scanner = new Scanner(System.in);
    int option = 0;
    public void imprimeMenu(){
        System.out.println("1 ---Adiciona saldo--- \n" +
                "2 ---Transfere valor--- \n" +
                "3 ---Verifica o saldo--- \n" +
                "4 ---Mostra conta--- \n" +
                "5 ---Sair--- \n" +
                "Digite a opção desejada: ");
        option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("Entre com o valor: ");
                valor = scanner.nextDouble();
                adicionaDinheiro(valor);
                imprimeMenu();
            break;
            case 2:
                System.out.println("Entre com o valor: ");
                valor = scanner.nextDouble();
                tiraDinheiro(valor);
                imprimeMenu();
            break;
            case 3:
                consultaDinheiro();
                imprimeMenu();
            break;
            case 4:
                consultaDadosConta();
                imprimeMenu();
            case 5:
                System.out.println("Saindo da aplicação");
                scanner.close();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    private void consultaDadosConta() {
        System.out.println("Titular da conta: "+ donoDaConta +"\n"
                +"Tipo da conta: " +tipoDaConta + "\n"
                + "Saldo: "+ saldoDaConta );
    }
    public void adicionaDinheiro(Double valorAdicionado){
        if(valorAdicionado<0){
            System.out.println("Entre com um valor positivo");
        }
        saldoDaConta = saldoDaConta + valorAdicionado;
    }
    public void tiraDinheiro(Double valorRetirado){
        if(valorRetirado<0){
            System.out.println("Transferências apenas de valores positivos");
        }
        if(saldoDaConta - valorRetirado < 0){
            System.out.println("Saldo insuficiente");
        }
        else {
            saldoDaConta = saldoDaConta - valorRetirado;
        }

    }
    public void consultaDinheiro(){
        System.out.println("Saldo: "+ saldoDaConta);
    }
}
