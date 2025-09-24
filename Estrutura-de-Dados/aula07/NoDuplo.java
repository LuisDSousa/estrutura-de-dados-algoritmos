public class NoDuplo<T>{
    private T dado;
    private NoDuplo<T> proximoNo;
    private NoDuplo<T> anteriorNo;

    public NoDuplo(T dado){
        this.dado = dado;
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
    @Override
    public String toString(){
        return "Dado { "+ dado +" }";
    }
}