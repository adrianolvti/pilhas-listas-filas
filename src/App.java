import java.util.Scanner;

public class App {
    static Scanner entrada = new Scanner(System.in);
    static boolean vericia_numero;
    static Pilha pilha = new Pilha();
    static Fila fila = new Fila();
    static Lista lista = new Lista();

    public static void imprimeMenu(){
        System.out.println("=================================================="
            +"\nSelecione algumas das estrutura de dados a seguir:" 
            + "\n[1] Pilha"
            + "\n[2] Fila" 
            + "\n[3] Lista"
            + "\n[0] Sair"
            + "\nInforme o número de acordo com a opção:");
        String opcao = entrada.next();

        int op = validadorDeEntrada(opcao, 3);

        if (vericia_numero == true) {
            switch(op) {
                case 1:
                    imprimeMenuPilha();
                    break;
                case 2:
                    imprimeMenuFila();
                    break;
                case 3:
                    imprimeMenuLista();
                    break;
                case 0:
                    System.out.println("Saída realizada com sucesso");
                    break;
              }
        } else {
            System.out.println("Número incorreto!");
            imprimeMenu();
        }

        
    }

    public static void imprimeMenuPilha(){
        System.out.println("================================================="
            + "\n||||||||||||||||||||||PILHA||||||||||||||||||||||\n"
            + "================================================="
            + "\nSelecione uma opção:" 
            + "\n[1] Inserir na pilha"
            + "\n[2] Remover da pilha"
            + "\n[3] Verificar topo da Pilha" 
            + "\n[4] Verificar tamanho da pilha"
            + "\n[5] Verificar se está vazia"
            + "\n[6] Ver todos os itens da pilha"
            + "\n[7] Retornar ao menu principal"
            + "\n[0] Sair"
            + "\nInforme o número de acordo com a opção:");
        String opcao = entrada.next();
        
        int op = validadorDeEntrada(opcao, 7);

        if (vericia_numero == true) {
            switch(op) {
                case 1:
                    System.out.println("Informe o elemento que deseja inserir");
                    String elemento = entrada.next();
                    pilha.inserir(elemento);
                    System.out.println(">>> Elemento " + elemento + " inserido com sucesso no topo da pilha! <<<");
                    imprimeMenuPilha();
                    break;
                case 2:
                    System.out.println(">>> O elemento (" + pilha.remover() + ") contido no topo da pilha foi removido!");
                    imprimeMenuPilha();
                    break;
                case 3:
                    System.out.println(">>> O elemento " + pilha.verificaTopo() + " está contido no topo da pilha");
                    imprimeMenuPilha();
                    break;
                case 4:
                    System.out.println(">>> O tamamnho desta pilha é " + pilha.verificaTamanho());
                    imprimeMenuPilha();
                    break;
                case 5:
                    if(pilha.estaVazio() == true){
                        System.out.println(">>> A pilha está vazia! <<<");
                    } else {
                        System.out.println(">>> A pilha não está vazia <<<");
                    }
                    imprimeMenuPilha();
                    break;
                case 6:
                    System.out.println("Segue a baixo todos os elementos contidos na pilha\n" 
                        + "--------------------------------------------------\n"
                        + pilha.imprimePilha()
                        + "\n--------------------------------------------------");
                    imprimeMenuPilha();
                    break;
                case 7:
                    imprimeMenu();
                    break;
                case 0:
                    System.out.println("Saída realizada com sucesso");
                    break;
            }
        } else {
            System.out.println("Número incorreto!");
            imprimeMenuPilha();
        }
    }

    public static void imprimeMenuFila(){
        System.out.println("================================================"
        + "\n||||||||||||||||||||||FILA||||||||||||||||||||||\n"
        + "  ================================================"
        + "\nSelecione uma opção:" 
        + "\n[1] Inserir na Fila"
        + "\n[2] Remover da Fila"
        + "\n[3] Verificar tamanho da Fila"
        + "\n[4] Verificar se está vazia"
        + "\n[5] Ver todos os itens da Fila"
        + "\n[6] Retornar ao menu principal"
        + "\n[0] Sair"
        + "\nInforme o número de acordo com a opção:");
    String opcao = entrada.next();
    
    int op = validadorDeEntrada(opcao, 7);

    if (vericia_numero == true) {

        switch(op) {
            case 1:
                System.out.println("Informe o elemento que deseja inserir");
                String elemento = entrada.next();
                fila.inserir(elemento);
                System.out.println(">>> Elemento " + elemento + " inserido com sucesso no final da fila! <<<");
                imprimeMenuFila();
                break;
            case 2:
                System.out.println(">>> O elemento (" + fila.remover() + ") foi removido da fila!");
                imprimeMenuFila();
                break;
            case 3:
                System.out.println(">>> O tamamnho desta fila é " + fila.verificaTamanho());
                imprimeMenuFila();
                break;
            case 4:
                if(fila.estaVazio() == true){
                    System.out.println(">>> A fila está vazia! <<<");
                } else {
                    System.out.println(">>> A fila não está vazia <<<");
                }
                imprimeMenuFila();
                break;
            case 5:
                System.out.println("Segue a baixo todos os elementos contidos na fila\n" 
                    + "--------------------------------------------------\n"
                    + fila.imprimeFila()
                    + "\n--------------------------------------------------");
                imprimeMenuFila();
                break;
            case 6:
                imprimeMenu();
                break;
            case 0:
                System.out.println("Saída realizada com sucesso");
                break;
        }
    } else {
        System.out.println("Número incorreto!");
        imprimeMenuFila();
    }

    }
    
    public static void imprimeMenuLista(){
        System.out.println("================================================"
        + "\n||||||||||||||||||||||LISTA||||||||||||||||||||||\n"
        + "  ================================================"
        + "\nSelecione uma opção:" 
        + "\n[1] Inserir no início"
        + "\n[2] Inserir no fim"
        + "\n[3] Inserir no índice expecífico"
        + "\n[4] Remover do início"
        + "\n[5] Remover do fim"
        + "\n[6] Remover do índice"
        + "\n[7] Ver todos os itens da lista"
        + "\n[8] Retornar ao menu principal"
        + "\n[0] Sair"
        + "\nInforme o número de acordo com a opção:");
        String opcao = entrada.next();
    
        int op = validadorDeEntrada(opcao, 9);

        if (vericia_numero == true) {
            String elemento;
            int indice;

            switch(op) {
                case 1:
                    System.out.println("Informe o elemento que deseja inserir no início");
                    elemento = entrada.next();
                    lista.inserirInicio(elemento);
                    System.out.println(">>> Elemento " + elemento + " inserido com sucesso no início da lista! <<<");
                    imprimeMenuLista();
                    break;
                case 2:
                    System.out.println("Informe o elemento que deseja inserir no fim");
                    elemento = entrada.next();
                    lista.inserirFim(elemento);
                    System.out.println(">>> Elemento " + elemento + " inserido com sucesso no final da lista! <<<");
                    imprimeMenuLista();
                    break;
                case 3:
                    System.out.println("Informe o elemento que deseja inserir no fim");
                    elemento = entrada.next();
                    System.out.println("Informe o indice em que o elemento vai ser inserido");
                    indice = entrada.nextInt();
                    lista.inserirNoIndice(indice, elemento);
                    System.out.println(">>> Elemento " + elemento + " inserido com sucesso no índice! <<<");
                    imprimeMenuLista();
                    break;
                case 4:
                    System.out.println(">>> O elemento (" + lista.retirarInicio() + ") foi removido do início da lista!");
                    imprimeMenuLista();
                    break;
                case 5:
                    System.out.println(">>> O elemento (" + lista.retirarFim() + ") foi removido do final da lista!");
                    imprimeMenuLista();
                    break;
                case 6:
                    System.out.println("Informe o indice em que o elemento vai ser retirado");
                    indice = entrada.nextInt();
                    System.out.println(">>> O elemento (" + lista.retirarNoIndice(indice) + ") foi removido!");
                    imprimeMenuLista();
                    break;
                case 7:
                    System.out.println("Segue a baixo todos os elementos contidos na fila\n" 
                        + "--------------------------------------------------\n"
                        + lista.imprimeLista()
                        + "\n--------------------------------------------------");
                    imprimeMenuLista();
                    break;
                case 8:
                    imprimeMenu();
                case 0:
                    System.out.println("Saída realizada com sucesso");
                    break;
            }
        } else {
            System.out.println("Número incorreto!");
            imprimeMenuFila();
        }
    }

    protected static int validadorDeEntrada(String opcao, int tamanho_do_menu) {
		if(opcao.matches("[0-9]*")) {
			vericia_numero = true;
		} else {
            vericia_numero = false;
			System.out.println("O dado informado não é um número!\nOu não é um número inteiro positivo!");
            return 0;
        }

		if (opcao.contains(" ")) {
			vericia_numero = false;	
		}

        int op = Integer.parseInt(opcao);
        if (vericia_numero == true) {
            
            if(op < 0 || op > tamanho_do_menu) {
                vericia_numero = false;
                System.out.println("Você informou um número inválido!");
            }
        } else {
            vericia_numero = true;
            return op;
        }
        return op;
	}

    public static void main(String[] args) {
        imprimeMenu();
    }
}
