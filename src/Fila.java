public class Fila {
    No inicio = null;
    No fim;
    int tamanho = 0;
    String info;

    public void inserir(String elemento) {
        No no = new No();
        no.info = elemento;
        if (inicio == null) {
            inicio = no;
            fim = no;
        } else {
            fim.proximo = no;
            fim = fim.proximo;
        }
        tamanho++;    
    }

    public String remover() {
        if(inicio != null) {
            info = inicio.info;
            No aux = inicio;
            inicio = aux.proximo;
            aux = null;
            this.tamanho --;
            return info;
        } else if (inicio == null && fim != null) {
            info = fim.info;
            this.fim = null;
            this.tamanho --;
            return info;
        }
        return "";
    } 

    public int verificaTamanho() {
        return tamanho;
    }

    public boolean estaVazio() {
        if (tamanho == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String imprimeFila() {
        String str = "";
        No local = inicio;
        while (local != null) {
            str += local.info + "\n";
            local = local.proximo;
        }

        if (str.isEmpty()) {
            return "Fila vazia";
        }

        return str;
    }

    /*
        ● imprimeFila - imprime todos os elementos que estão na Fila. 
    */
}
