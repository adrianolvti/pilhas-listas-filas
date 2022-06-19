public class App {
    public static void main(String[] args) throws Exception {
        
        ListaSimples l1 = new ListaSimples();

        System.out.println("========================");
        System.out.println("Inserir e retirar INÍCIO");
        System.out.println("------------------------");
        l1.inserirInicio("a");
        System.out.println(l1);
        l1.inserirInicio("b");
        System.out.println(l1);
        l1.inserirInicio("c");
        System.out.println(l1);
        while(l1.retirarInicio() != null) {
          System.out.println(l1);
        }
        System.out.println("========================");
        System.out.println("Inserir e retirar FIM");
        System.out.println("------------------------");
        l1.inserirFim("1");
        System.out.println(l1);
        l1.inserirFim("2");
        System.out.println(l1);
        l1.inserirFim("3");
        System.out.println(l1);
        while(l1.retirarFim() != null) {
          System.out.println(l1);
        }
        System.out.println("========================");
        System.out.println("Inserir e retirar INDICE");
        System.out.println("------------------------");
        l1.inserirFim("1");
        l1.inserirFim("2");
        l1.inserirFim("3");
        l1.inserirFim("4");
        l1.inserirFim("5");
        l1.inserirFim("6");
        System.out.println(l1);
        l1.inseririndice(3, "x");
        System.out.println(l1);
        l1.retirarIndice(3);
        System.out.println(l1);
    }
}
