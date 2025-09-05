public class Principal {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<Integer>("Numeros Inteiros");
        fila.enfileirar(1);
        fila.enfileirar(2);
        System.out.println(fila.desenfileirar());
        System.out.println(fila.desenfileirar());
        System.out.println(fila.ultimoNO.getDado());

    }
}
