public class Pilha {
    No topo = null;
    int tamanho;
    String info;
    
    public void inserir(String elemento) {
        No no = new No();
        no.info = elemento;
        no.proximo = topo;
        topo = no;
        tamanho++;
    }

    public String remover() {
        info = topo.info;
        No aux = topo;
        topo = aux.proximo;
        aux = null;
        tamanho--;
        return info;
    }

    public String verificaTopo() {
        String str = "(" + topo.info + ")";
        return str;
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

    public String imprimePilha() {
        String str = "";
        No local = topo;
        while (local != null) {
            str += local.info + "\n";
            local = local.proximo;
        }

        if (str.isEmpty()) {
            return "Pilha vazia";
        }

        return str;
    }
}
