import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Canais> arvore = new ArvoreBinaria<>();

        String[] nomes = {
            "Discovery", "Animal Planet", "Cartoon Network", "History",
            "National Geographic", "CNN", "ESPN", "HBO", "Globo", "SBT"
        };

        // Embaralha os nomes
        Random random = new Random();
        for (int i = 0; i < nomes.length; i++) {
            int j = random.nextInt(nomes.length);
            String temp = nomes[i];
            nomes[i] = nomes[j];
            nomes[j] = temp;
        }

        // Insere na árvore
        for (String nome : nomes) {
            arvore.inserir(new Canais(nome));
        }

        // Impressões
        System.out.println("Pré-fixado (Raiz -> Esq -> Dir):");
        arvore.imprimePreFixado();

        System.out.println("Em ordem (Esq -> Raiz -> Dir):");
        arvore.imprimeEmOrdem();

        System.out.println("Pós-fixado (Esq -> Dir -> Raiz):");
        arvore.imprimePosFixado();

        // Pesquisa
        System.out.println("Pesquisando canal 'HBO':");
        NodoArvore<Canais> resultado = arvore.pesquisa(new Canais("HBO"));
        if (resultado != null) {
            System.out.println("Encontrado: " + resultado.objeto);
        } else {
            System.out.println("Não encontrado.");
        }
    }
}
