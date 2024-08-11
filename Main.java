public class Main {
    public static void main(String[] args) {
        StaticStack<Integer> intStack = new StaticStack<>(5);

        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.push(40);
        intStack.push(50);

        try {
            intStack.push(60); // Isso vai falhar de proposito
        } catch (StackOverflowError e) {
            System.out.println("Erro: " + e.getMessage());
        }

        while (!intStack.isEmpty()) {
            System.out.println("Elemento no topo: " + intStack.pop());
        }

        System.out.println("A pilha está vazia? " + intStack.isEmpty());

        StaticStack<String> stringStack = new StaticStack<>(3);
        stringStack.push("Hello");
        stringStack.push("World");

        System.out.println("Elemento no topo: " + stringStack.pop());
        System.out.println("Elemento no topo: " + stringStack.pop());

        System.out.println("A pilha de strings está vazia? " + stringStack.isEmpty());
    }
}
