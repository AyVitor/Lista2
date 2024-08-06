package Poo;

import Poo.Excercio5.Lista;

public class Main5 {
    public class App {
    public static void main(String[] args) throws Exception {
        Lista colocaJ = new Lista();

        colocaJ.inserir(5);
        colocaJ.inserir(3);
        colocaJ.inserir(8);
        colocaJ.inserir(9);
        colocaJ.inserir(1);
        colocaJ.inserir(6);
        colocaJ.remover(3);
        System.out.println(colocaJ.tamanho());

        Lista lista = new Lista();

        lista.inserir(5);
        lista.inserir(5);
        lista.inserir(5);
        lista.inserir(9);
        lista.inserir(1);
        lista.inserir(6);
        lista.remover(9);
        System.out.println(lista.tamanho());

        System.out.println(lista.iguais(lista, colocaJ));

        System.out.println(lista.media());

        System.out.println(lista.busca(5));

        lista.elimina(5);
        System.out.println(lista.tamanho());
        System.out.println(lista.busca(5));
        System.out.println(lista.media());

        lista.apagaPosicao(3);
        lista.apagaPosicao(-1);
        lista.apagaPosicao(1);
        System.out.println(lista.tamanho());

        lista.insereDireita(50, 1);
        System.out.println(lista.tamanho());
    }
}
}