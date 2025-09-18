public class NoDuplo<T>{
    private T dado;
    private NoDuplo<T> proximoNo;
    private NoDuplo<T> anteriorNo;
    private int indice;

    public NoDuplo(T dado,int indice){
        this.dado = dado;
        this.indice = indice;
        this.anteriorNo = null;
        this.proximoNo = null;
    }
    public T getDado(){
        return this.dado;
    }
    public void setDado(T dado){
        this.dado = dado;
    }
    public NoDuplo<T> getproximoNo(){
        return this.proximoNo;
    }
    public void setproximoNo(NoDuplo<T> proximoNo){
        this.proximoNo = proximoNo;
    }
    public NoDuplo<T> getanteriorNo(){
        return this.anteriorNo;
    }
    public void setanteriorNo(NoDuplo<T> anteriorNo){
        this.anteriorNo = anteriorNo;
    }
    public int getIndice(){
        return this.indice;
    }
    public void setIndice(int indice){
        this.indice = indice;
    }
}