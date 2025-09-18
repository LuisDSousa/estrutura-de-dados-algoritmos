public class Principal{
    public static void main(String[] args){
        ListaDupla<String> lista = new ListaDupla<String>("Alunos");

        lista.addInicio("Luis");
        lista.addFinal("Fernanda");
        lista.imprimeLista();
    }

}