public class Principal{

    public static void main(String[] args){
        Pessoa obj1 = new Pessoa();
        Pessoa obj2 = new Pessoa("João", 25);
        Pessoa obj3 = new Pessoa("Maria", 30515113212315L, 23 );


        
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
    }
}