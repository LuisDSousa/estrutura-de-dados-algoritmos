public class Pilha<T>{
    private No<T> topo;
    private String nomePilha;

    public Pilha(){
        this("");
    }

    public Pilha(String nomePilha){
        this.nomePilha = nomePilha;
        this.topo = null;
    }

    public void push(T dado){
        No<T> novoNo = new No<T>(dado);

            novoNo.setNextNo(topo);
            topo = novoNo;
        }

    public T peek(){
        if(topo == null){
            System.out.println("Pilha vazia!");
            return null;
        }
        return topo.getDado();
    }

    public T pop(){
        if (topo == null){
            System.out.println("Pilha vazia!");
            return null;
        }
        T dadoTemp = topo.getDado();
        topo = topo.getNextNo();
        return dadoTemp;
    }

}