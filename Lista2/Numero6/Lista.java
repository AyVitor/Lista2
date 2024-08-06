package Poo;

public class Lista  {
    private Nodo inicio;
    private int quantidade;

    public ListaEncadeada() {
        this.inicio = null;
        this.quantidade = 0;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void adicionar(int valor) {
        Nodo novoNodo = new Nodo(valor);
        if (this.estaVazia() || valor <= inicio.getValor()) {
            novoNodo.setProximo(inicio);
            this.inicio = novoNodo;
        } else {
            Nodo atual = inicio;
            while (atual.getProximo() != null && atual.getProximo().getValor() < valor) {
                atual = atual.getProximo();
            }
            novoNodo.setProximo(atual.getProximo());
            atual.setProximo(novoNodo);
        }
        this.quantidade++;
    }

    public void remover(int valor) {
        if (inicio != null) {
            if (inicio.getValor() == valor) {
                inicio = inicio.getProximo();
                this.quantidade--;
            } else {
                Nodo atual = inicio;
                while (atual.getProximo() != null && atual.getProximo().getValor() != valor) {
                    atual = atual.getProximo();
                }
                if (atual.getProximo() != null) {
                    atual.setProximo(atual.getProximo().getProximo());
                    this.quantidade--;
                } else {
                    System.out.println("Elemento não encontrado.");
                }
            }
        }
    }

    public int tamanho() {
        return this.quantidade;
    }

    public boolean saoIguais(ListaEncadeada lista1, ListaEncadeada lista2) {
        if (lista1.quantidade != lista2.quantidade) return false;

        Nodo atual1 = lista1.inicio;
        Nodo atual2 = lista2.inicio;
        while (atual1 != null) {
            if (atual1.getValor() != atual2.getValor()) return false;
            atual1 = atual1.getProximo();
            atual2 = atual2.getProximo();
        }

        return true;
    }

    public float calcularMedia() {
        if (quantidade == 0) return 0;
        int soma = 0;
        Nodo atual = inicio;
        
        while (atual != null) {
            soma += atual.getValor();
            atual = atual.getProximo();
        }

        return (float) soma / quantidade;
    }

    public boolean contem(int valor) {
        Nodo atual = inicio;
        while (atual != null) {
            if (atual.getValor() == valor) return true;
            atual = atual.getProximo();
        }
        return false;
    }

    public void eliminar(int valor) {
        Nodo atual = inicio;
        Nodo anterior = null;
    
        while (atual != null) {
            if (atual.getValor() == valor) {
                if (anterior == null) {
                    inicio = atual.getProximo();
                } else {
                    anterior.setProximo(atual.getProximo());
                }
                quantidade--;
            } else {
                anterior = atual;
            }
            atual = atual.getProximo();
        }
    }

    public void eliminarNaPosicao(int posicao) {
        if (posicao < 0 || posicao >= quantidade) {
            System.out.println("Posição inválida");
            return;
        }
    
        Nodo atual = inicio;
        Nodo anterior = null;
        int indice = 0;
    
        while (indice < posicao) {
            anterior = atual;
            atual = atual.getProximo();
            indice++;
        }
    
        if (anterior == null) {
            inicio = atual.getProximo();
        } else {
            anterior.setProximo(atual.getProximo());
        }
    
        quantidade--;
    }
    
    public void inserirADireita(int valor, int posicao) {
        if (posicao < 0 || posicao > quantidade) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
    
        Nodo novoNodo = new Nodo(valor);
        Nodo atual = inicio;
    
        if (posicao == 0) {
            novoNodo.setProximo(inicio);
            inicio = novoNodo;
        } else {
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.getProximo();
            }
            novoNodo.setProximo(atual.getProximo());
            atual.setProximo(novoNodo);
        }
    
        quantidade++;
    }
    
    public void inserirAEsquerda(int valor, int posicao) {
        if (posicao < 0 || posicao > quantidade) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
    
        Nodo novoNodo = new Nodo(valor);
        Nodo atual = inicio;
    
        if (posicao == 0) {
            novoNodo.setProximo(inicio);
            inicio = novoNodo;
        } else {
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.getProximo();
            }
            novoNodo.setProximo(atual);
            if (atual != inicio) {
                Nodo anterior = inicio;
                while (anterior.getProximo() != atual) {
                    anterior = anterior.getProximo();
                }
                anterior.setProximo(novoNodo);
            } else {
                inicio = novoNodo;
            }
        }
    
        quantidade++;
    }

    public ListaEncadeada inverter() {
        ListaEncadeada novaLista = new ListaEncadeada();
        Nodo atual = this.inicio;
        while (atual != null) {
            novaLista.adicionarInicio(atual.getValor());
            atual = atual.getProximo();
        }
        return novaLista;
    }

    public ListaEncadeada retornarImpares(ListaEncadeada lista1, ListaEncadeada lista2) {
        ListaEncadeada novaLista = new ListaEncadeada();
        for (Nodo atual = lista1.inicio; atual != null; atual = atual.getProximo()) {
            if (atual.getValor() % 2 != 0) {
                novaLista.adicionar(atual.getValor());
            }
        }
        for (Nodo atual = lista2.inicio; atual != null; atual = atual.getProximo()) {
            if (atual.getValor() % 2 != 0) {
                novaLista.adicionar(atual.getValor());
            }
        }
        return novaLista;
    }

    public ListaEncadeada concatenar(ListaEncadeada lista1, ListaEncadeada lista2) {
        ListaEncadeada novaLista = new ListaEncadeada();
        for (Nodo atual = lista1.inicio; atual != null; atual = atual.getProximo()) {
            novaLista.adicionar(atual.getValor());
        }
        for (Nodo atual = lista2.inicio; atual != null; atual = atual.getProximo()) {
            novaLista.adicionar(atual.getValor());
        }
        return novaLista;
    }

    public ListaEncadeada intersecao(ListaEncadeada lista1, ListaEncadeada lista2) {
        ListaEncadeada novaLista = new ListaEncadeada();
        for (Nodo atual1 = lista1.inicio; atual1 != null; atual1 = atual1.getProximo()) {
            for (Nodo atual2 = lista2.inicio; atual2 != null; atual2 = atual2.getProximo()) {
                if (atual1.getValor() == atual2.getValor()) {
                    novaLista.adicionar(atual1.getValor());
                    break;
                }
            }
        }
        return novaLista;
    }

    public ListaEncadeada intercalar1(ListaEncadeada lista1, ListaEncadeada lista2) {
        ListaEncadeada novaLista = new ListaEncadeada();
        Nodo atual1 = lista1.inicio;
        Nodo atual2 = lista2.inicio;
        while (atual1 != null || atual2 != null) {
            if (atual1 != null) {
                novaLista.adicionar(atual1.getValor());
                atual1 = atual1.getProximo();
            }
            if (atual2 != null) {
                novaLista.adicionar(atual2.getValor());
                atual2 = atual2.getProximo();
            }
        }
        return novaLista;
    }

    public ListaEncadeada intercalar2(ListaEncadeada lista1, ListaEncadeada lista2) {
        ListaEncadeada novaLista = new ListaEncadeada();
        Nodo atual1 = lista1.inicio;
        Nodo atual2 = lista2.inicio;
    
        while (atual1 != null && atual2 != null) {
            if (atual1.getValor() <= atual2.getValor()) {
                novaLista.adicionar(atual1.getValor());
                atual1 = atual1.getProximo();
            } else {
                novaLista.adicionar(atual2.getValor());
                atual2 = atual2.getProximo();
            }
        }
    
        while (atual1 != null) {
            novaLista.adicionar(atual1.getValor());
            atual1 = atual1.getProximo();
        }
        while (atual2 != null) {
            novaLista.adicionar(atual2.getValor());
            atual2 = atual2.getProximo();
        }
    
        return novaLista;
    }

    private void adicionarInicio(int valor) {
        Nodo novoNodo = new Nodo(valor);
        novoNodo.setProximo(in

    
}
