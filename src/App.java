public class App {
    public static void main(String[] args) throws Exception {
        
        ListaSimples l1 = new ListaSimples();

        for(int i = 0; i < 10; i++){
            l1.inserirInicio("x");
            System.out.println(l1);
        }
        
        l1.inserirInicio("Adriano");
        System.out.println(l1);
        l1.inserirInicio("Lucas");
        System.out.println(l1);
        l1.inserirInicio("Vieira");
        System.out.println(l1);
    }
}
