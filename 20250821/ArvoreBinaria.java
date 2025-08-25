public class ArvoreBinaria implements Arvore {
 
    private NodoArvore raiz;
 
    public ArvoreBinaria() {

        this.raiz = null;

    }
 
    // --- MÉTODO DE INSERÇÃO  ---

    @Override

    public void inserir(int valor) {

        this.raiz = inserirRecursivo(this.raiz, valor);

    }
 
    private NodoArvore inserirRecursivo(NodoArvore noAtual, int valor) {

        if (noAtual == null) {

            return new NodoArvore(valor);

        }

        if (valor < noAtual.chave) {

            noAtual.filhoEsquerda = inserirRecursivo(noAtual.filhoEsquerda, valor);

        } else if (valor > noAtual.chave) {

            noAtual.filhoDireita = inserirRecursivo(noAtual.filhoDireita, valor);

        }

        return noAtual;

    }
 
    // --- MÉTODO DE PESQUISA  ---

    @Override

    public NodoArvore pesquisa(int valor) {

        return pesquisaRecursivo(this.raiz, valor);

    }
 
    private NodoArvore pesquisaRecursivo(NodoArvore noAtual, int valor) {

        if (noAtual == null || noAtual.chave == valor) {

            return noAtual;

        }

        if (valor < noAtual.chave) {

            return pesquisaRecursivo(noAtual.filhoEsquerda, valor);

        } else {

            return pesquisaRecursivo(noAtual.filhoDireita, valor);

        }

    }
 
 
    // Pré-fixado raiz, squerda e ireita

    @Override

    public void imprimePreFixado() {

        imprimePreFixadoRecursivo(this.raiz);

        System.out.println();

    }
 
    private void imprimePreFixadoRecursivo(NodoArvore noAtual) {

        if (noAtual != null) {

            System.out.print(noAtual.chave + " ");

            imprimePreFixadoRecursivo(noAtual.filhoEsquerda);

            imprimePreFixadoRecursivo(noAtual.filhoDireita);

        }

    }
 
    // Em ordem esquerda,raiz e direita

    public void imprimeEmOrdem() {

        imprimeEmOrdemRecursivo(this.raiz);

        System.out.println();

    }
 
    private void imprimeEmOrdemRecursivo(NodoArvore noAtual) {

        if (noAtual != null) {

            imprimeEmOrdemRecursivo(noAtual.filhoEsquerda);

            System.out.print(noAtual.chave + " ");

            imprimeEmOrdemRecursivo(noAtual.filhoDireita);

        }

    }
 
    // Pós-fixado esquerda, direita e raiz

    public void imprimePosFixado() {

        imprimePosFixadoRecursivo(this.raiz);

        System.out.println();

    }
 
    private void imprimePosFixadoRecursivo(NodoArvore noAtual) {

        if (noAtual != null) {

            imprimePosFixadoRecursivo(noAtual.filhoEsquerda);

            imprimePosFixadoRecursivo(noAtual.filhoDireita);

            System.out.print(noAtual.chave + " ");

        }

    }

}

 