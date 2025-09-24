public class ListaDupla<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private String nomeLista;
    private int tamanho;

    public ListaDupla(){
        this("Lista Dupla");
    }
    public ListaDupla(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
    }

    public void addInicio(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado,0);
        if(primeiroNo == null){
            this.primeiroNo = novoNo;
            this.ultimoNo = novoNo;
        } else {
            novoNo.setproximoNo(this.primeiroNo);
            this.primeiroNo.setanteriorNo(novoNo);
            this.primeiroNo = novoNo;
        }
        atualizaIndice();
        tamanho++;
    }
    public void addFinal(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado,0);
        if(ultimoNo == null){
            this.primeiroNo = novoNo;
            this.ultimoNo = novoNo;
        } else {
            novoNo.setanteriorNo(this.ultimoNo);
            this.ultimoNo.setproximoNo(novoNo);
            this.ultimoNo = novoNo;
        }
        atualizaIndice();
        tamanho++;
    }

    public void atualizaIndice(){
        NoDuplo<T> atual = primeiroNo;
        int indice = 0;
        while (atual != null) {
            atual.setIndice(indice);
            atual = atual.getproximoNo();
            indice++;
        }
    }
    public void imprimeLista(){
        if (primeiroNo == null){
            System.out.println("Lista Vazia!");
        }else{
            System.out.println("Dados da Lista"+  nomeLista);
            NoDuplo<T> aux = primeiroNo;
            while (aux != null){
                System.out.println(aux.toString());
                aux = aux.getproximoNo();
            }
            System.out.println();
        }  
    }
    
}