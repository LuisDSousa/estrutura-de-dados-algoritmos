public class Deque {
    private NoDuplo<T> proximoNo;
    private NoDuplo<T> anteriorNo;
    private String nomeDeque;
    private int tamanho;

    public Deque(String nomeDeque) {
        this.nomeDeque = nomeDeque;
        this.tamanho = 0;
        this.proximoNo = null;
        this.anteriorNo = null;
    }
    
}
