public class Principal{
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<String>("Letras");

        System.out.println("Dado: " + pilha.peek());

        pilha.push("A");
        pilha.push("B");

        System.out.println("Dado: " + pilha.peek());

        System.out.println("Dado Removido: " + pilha.pop());
        
        System.out.println("Dado: " + pilha.peek()); 

    }  
    
    
}