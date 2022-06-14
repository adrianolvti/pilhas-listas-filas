class ListaSimples {
    No inicio = null;
    int tamanho = 0;

    public void inserirInicio(String info) {
        No no = new No();
        no.info = info;
        no.proximo = inicio;
        inicio = no;
        tamanho++;
    }

    public String toString(){
        String str = "(" + tamanho + ")";
        No local = inicio;
        while (local != null) {
            str += local.info + " ";
            local = local.proximo;
        }
        return str;
    }
}
