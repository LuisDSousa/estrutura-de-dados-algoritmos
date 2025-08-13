import java.util.ArrayList;

public class Principal{

    public static void main(String[] args) {

/*    Pessoa obj1 = new Pessoa("Luis", 20);
        Pessoa obj2 = new Pessoa("Carlos", 40);
        Pessoa obj3 = new Pessoa("Ana", 10);

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
*/
       ArrayList<Pessoa> listP = new ArrayList<Pessoa>();
        listP.add(new Pessoa("Gabriel", 90));
        listP.add(new Pessoa("Luis", 78));
        listP.add(new Pessoa("Carlos", 21));
/* 
        System.out.println(listP.get(0));
        System.out.println(listP.get(1));
        System.out.println(listP.get(2));
*/

        for (Pessoa auxP : listP) {
            System.out.println(auxP.toString());
        }
  
    }
}