public class Main6 {
    public static void main(String[] args) {
       
        ListaEncadeada primeiraLista = new ListaEncadeada();
        primeiraLista.adicionar(2);
        primeiraLista.adicionar(4);
        primeiraLista.adicionar(50);
        primeiraLista.adicionar(6);
        primeiraLista.adicionar(20);

        ListaEncadeada segundaLista = new ListaEncadeada();
        segundaLista.adicionar(1);
        segundaLista.adicionar(3);
        segundaLista.adicionar(5);
        segundaLista.adicionar(6);

       
        System.out.println("Primeira Lista: " + primeiraLista);
        System.out.println("Segunda Lista: " + segundaLista);
        System.out.println("\n");
        System.out.println("Primeira Lista invertida: " + primeiraLista.inverter());
        System.out.println("Elementos ímpares: " + primeiraLista.retornarImpares(primeiraLista, segundaLista));
        System.out.println("Listas concatenadas: " + primeiraLista.concatenar(primeiraLista, segundaLista));
        System.out.println("Intersecção: " + primeiraLista.intersecao(primeiraLista, segundaLista));
        System.out.println("Intercalar 1: " + primeiraLista.intercalar1(primeiraLista, segundaLista));
        System.out.println("Intercalar 2: " + primeiraLista.intercalar2(primeiraLista, segundaLista));
    }
}
