class No<T>{
    private T dado;
    private No<T> proximoNo;

    public No(T dado){
        this(dado, null);
    }

    public No(T dado, No<T> no){
        this.dado = dado;
        this.proximoNotNo = no;
    }

    public T getDado(){
        return this.dado;
    }

    public void setDado(T dado){
        this.dado = dado;
    }

    public No<T> getproximoNo(){
        return this.proximoNo;
    }

    public void setproximoNo(No<T> proximoNo){
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString(){
        return "Dado{" + getDado() + "}";
    }
}