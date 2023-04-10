import java.util.Scanner;

public class ChatBot {
    public static void main (String [] args ){
        Scanner myScanner = new Scanner (System.in);

        System.out.print("Seja bem-vindo ao LIA, seu assistente virtual financeiro!");
        System.out.println(" Comigo, você pode realizar uma série de operações financeiras"); 
        System.out.print("de maneira fácil e rápida. Primeiramente realize o seu cadastro");  
        System.out.println(" preenchendo as informações necessarias.");  
        System.out.println("");
        System.out.println("Após o cadastro, aqui estão algumas das opções que você poderá escolher:");
        System.out.println("");
        System.out.println("[1] - Consultar Saldo");
        System.out.println("[2] - Fazer Retirada");
        System.out.println("[3] - Realizar Depósito");
        System.out.println("[4] - Extrato");
        System.out.println("[5] - Consultar Endereço");
        System.out.println("[6] - Alterar Endereço");
        System.out.println("[9] - Sair");
        System.out.println("");

        System.out.println("Antes de começarmos, por favor, realize o seu cadastro preenchendo as informações abaixo:\n");

        String nome = "";
        String bairro = "";
        String rua = "";
        int numero = 0;
        int opcao = 0;
        double saldo = 0;
        double retirada = 0;
        double deposito = 0;

        do{
            System.out.print("Informe seu nome: ");
            nome = myScanner.nextLine();

            System.out.println(" ");
            System.out.println("Informe o seu endereço abaixo: ");
            System.out.println(" ");
            System.out.print("  Bairro: ");
            bairro = myScanner.nextLine();
    
            System.out.print("  Rua: ");
            rua = myScanner.nextLine();
    
            System.out.print("  Número: ");
            numero = myScanner.nextInt();
    
            System.out.println(" ");
            System.out.print("Informe o seu saldo: ");
            saldo = myScanner.nextDouble();

            myScanner.nextLine();

            if (nome ==("")||bairro == ("")||rua == ("")||numero == 0||saldo == 0){
                System.out.println("--------------------------------------------");
                System.out.println("Preencha todas as informações necessarias!");
                System.out.println("--------------------------------------------");
            }

            

        }while(nome == ("")||bairro == ("")||rua ==("")||numero == 0||saldo == 0);
        
        System.out.println("Cadastro realizado com sucesso! aqui estão algumas das opções que você poderá escolher: ");

        


    
        do{
            System.out.println("");
            System.out.println("[1] - Consultar Saldo");
            System.out.println("[2] - Fazer Retirada");
            System.out.println("[3] - Realizar Depósito");
            System.out.println("[4] - Extrato");
            System.out.println("[5] - Consultar Endereço");
            System.out.println("[6] - Alterar Endereço");
            System.out.println("[9] - Sair");
            System.out.println("");

            System.out.println("Informe a opção desejada: ");
            opcao = myScanner.nextInt();
            myScanner.nextLine();

            switch(opcao) {
                case 1:
                    System.out.println("O seu saldo é de:  "+saldo);    

                    break;
                case 2:
                    System.out.println("Informe o valor de retirada: ");
                    retirada = myScanner.nextDouble();
                    myScanner.nextLine();

                    
                    if (retirada <= saldo) {
                    saldo -= retirada;
                    System.out.println("Retirada realizada! ");
                    System.out.println("Para consultar o saldo atualizado consulte o saldo [1] ou emita um extrato [4].");

                    } else{
                    System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.println("Valor do depósito: ");
                    deposito = myScanner.nextDouble();
                    saldo += deposito;

                    System.out.println("Depósito realizado com sucesso!");
                    System.out.println("Para consultar o novo saldo consulte o saldo[1] ou emita um extrato[4].");
                
                    break;
                case 4:
                    System.out.println("Extrato:");
                    System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                    System.out.printf("Retirada: R$ %.2f\n", retirada);
                    System.out.printf("Depósito: R$ %.2f\n", deposito);
                    System.out.printf("Endereço:\n Rua: %s\n Bairro: %s\n Número: - %d", rua, bairro, numero);
                    myScanner.nextLine();

                    break;
                case 5:
                    System.out.printf("O seu endereço é: \nBairro: %s \nRua: %s \nNúmero: %d",bairro,rua,numero);
                
                    break;
                case 6:
                    System.out.println("Informe seu novo endereço abaixo:");
                    
                    System.out.print(" Bairro: ");
                    bairro = myScanner.nextLine();

                    System.out.print(" Rua: ");
                    rua = myScanner.nextLine();

                    System.out.print(" Número: ");
                    numero = myScanner.nextInt();

                    System.out.println("Endereço atualizado!");
                    break;

                    case 9:
                    System.out.println("Obrigado por utilizar o LIA!");
                    break;

                default:
                System.out.println("Opção inválida. Escolha novamente.");
                break;
    
    }  
   
} while(opcao != 9);
    myScanner.close();
        
     }
    }
