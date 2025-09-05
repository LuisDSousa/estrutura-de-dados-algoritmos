public class Fila<T> {
    public No<T> primeiroNO;
    public No<T> ultimoNO;
    private String nomeFila;

    public Fila(){
        this("Lista");
    }

    public Fila(String nomeFila){
        this.nomeFila = nomeFila;
        primeiroNO = null;
        ultimoNO = null;
    }

    public void enfileirar(T dado){
        No<T> novoNo = new No<T>(dado);
        if (primeiroNO == null){
            primeiroNO = novoNo;
            ultimoNO = novoNo;
        } else {
            ultimoNO.setNextNo(novoNo);
            ultimoNO = novoNo;
        }
    }

    public T desenfileirar(){
        if (primeiroNO == null){
            System.out.println("Fila " + "vazia!");
            return null;
        }
        T dadoTemp = primeiroNO.getDado();
        primeiroNO = primeiroNO.getNextNo();
        return dadoTemp;
    }
    
    public void imprimir(){
        if ( primeiroNO == null){
            System.out.println("Fila vazia!");
        }else{
            System.out.println("Dado da Fila" + nomeFila);
            No<T> aux = primeiroNO;
            while (aux != null) {
                System.out.printf("{ %s }", aux.toString());
                aux = aux.getNextNo();
            }
            System.out.println();
        }

    }



    
}
