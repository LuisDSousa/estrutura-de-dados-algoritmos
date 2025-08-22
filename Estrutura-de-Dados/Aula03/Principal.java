public class Principal {
     public static void main(String[] args){
        Lista<String> lista = new Lista<String>("Alunos");

        lista.addInicio("Rafael");
        lista.addInicio("Gabriel");
        lista.addFinal("João");
        lista.addFinal("Lucas");
        
        lista.imprimeLista();
        
        lista.removerInicio();
        lista.removerFinal();

        lista.imprimeLista();

     }
}