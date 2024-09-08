package lista;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;
    private final String NAO_EXISTE = "Posição não existe.";

    public void adiciona(T elemento) {
        No<T> novoNo = new No<>(elemento);
        if (this.tamanho == 0) {
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else {
            this.ultimo.setProximo(novoNo);
            novoNo.setAnterior(this.ultimo);
            this.ultimo = novoNo;
        }
        this.tamanho++;
    }

    public void adicionaPorPosicao(int posicao, T elemento) {
        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException(NAO_EXISTE);
        }

        if (posicao == 0) {
            adicionaInicio(elemento);
            return;
        }

        if (posicao == this.tamanho) {
            adiciona(elemento);
            return;
        }

        No<T> novoNo = new No<>(elemento);
        No<T> noAtual = this.buscaNo(posicao);
        No<T> noAnterior = noAtual.getAnterior();

        noAnterior.setProximo(novoNo);
        novoNo.setAnterior(noAnterior);

        novoNo.setProximo(noAtual);
        noAtual.setAnterior(novoNo);

        this.tamanho++;
    }

    public void adicionaInicio(T elemento) {
        No<T> novoNo = new No<>(elemento);
        if (this.tamanho == 0) {
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else {
            novoNo.setProximo(this.inicio);
            this.inicio.setAnterior(novoNo);
            this.inicio = novoNo;
        }
        this.tamanho++;
    }

    public T removeInicio() {
        if (this.tamanho == 0) {
            throw new RuntimeException("Lista está vazia.");
        }

        T removido = this.inicio.getElemento();
        this.inicio = this.inicio.getProximo();
        if (this.inicio != null) {
            this.inicio.setAnterior(null);
        } else {
            this.ultimo = null;
        }
        this.tamanho--;
        return removido;
    }

    public T removeFinal() {
        if (this.tamanho == 0) {
            throw new RuntimeException("Lista está vazia.");
        }

        T removido = this.ultimo.getElemento();
        this.ultimo = this.ultimo.getAnterior();
        if (this.ultimo != null) {
            this.ultimo.setProximo(null);
        } else {
            this.inicio = null;
        }
        this.tamanho--;
        return removido;
    }

    public T removerPorPosicao(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            throw new IllegalArgumentException(NAO_EXISTE);
        }

        if (posicao == 0) {
            return this.removeInicio();
        }

        if (posicao == this.tamanho - 1) {
            return this.removeFinal();
        }

        No<T> atual = this.buscaNo(posicao);
        No<T> noAnterior = atual.getAnterior();
        No<T> proximo = atual.getProximo();

        noAnterior.setProximo(proximo);
        if (proximo != null) {
            proximo.setAnterior(noAnterior);
        }

        atual.setProximo(null);
        atual.setAnterior(null);
        this.tamanho--;

        return atual.getElemento();
    }

    public void limpa() {
        for (No<T> atual = this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual.setAnterior(null);
            atual = proximo;
        }
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    private No<T> buscaNo(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            throw new IllegalArgumentException(NAO_EXISTE);
        }

        No<T> noAtual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }

        return noAtual;
    }

    public T buscaPorPosicao(int posicao) {
        return this.buscaNo(posicao).getElemento();
    }

    public int busca(T elemento) {
        No<T> noAtual = this.inicio;
        int pos = 0;

        while (noAtual != null) {
            if (noAtual.getElemento().equals(elemento)) {
                return pos;
            }
            pos++;
            noAtual = noAtual.getProximo();
        }

        return -1;
    }

    @Override
    public String toString() {
        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");

        No<T> atual = this.inicio;
        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");
        return builder.toString();
    }

    public No<T> getInicio() {
        return inicio;
    }

    public No<T> getUltimo() {
        return ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String getNAO_EXISTE() {
        return NAO_EXISTE;
    }
}
