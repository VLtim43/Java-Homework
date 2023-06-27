import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.io.*;
import java.nio.charset.*;
import java.util.ArrayList;

class ArquivoTextoLeitura {
    private BufferedReader entrada;

    ArquivoTextoLeitura(String nomeArquivo) {
        try {
            entrada = new BufferedReader(new InputStreamReader(new FileInputStream(nomeArquivo), "UTF-8"));
        } catch (UnsupportedEncodingException excecao) {
            System.out.println(excecao.getMessage());
        } catch (FileNotFoundException excecao) {
            System.out.println("Arquivo nao encontrado");
        }
    }

    public void fecharArquivo() {
        try {
            entrada.close();
            
        } catch (IOException excecao) {
            System.out.println("Erro no fechamento do arquivo de leitura: " + excecao);
        }
    }

    @SuppressWarnings("finally")
    public String ler() {
        String textoEntrada = null;
        try {
            textoEntrada = entrada.readLine();
        } catch (EOFException excecao) { // Excecao de final de arquivo.
            textoEntrada = null;
        } catch (IOException excecao) {
            System.out.println("Erro de leitura: " + excecao);
            textoEntrada = null;
        } finally {
            return textoEntrada;
        }
    }
}

class MyIO {

    private static BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in, Charset.forName("ISO-8859-1")));
    private static String charset = "ISO-8859-1";

    public static void setCharset(String charset_) {
        charset = charset_;
        in = new BufferedReader(new InputStreamReader(System.in, Charset.forName(charset)));
    }

    public static void print() {
    }

    public static void print(int x) {
        try {
            PrintStream out = new PrintStream(System.out, true, charset);
            out.print(x);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Erro: charset invalido");
        }
    }

    public static void print(double x) {
        try {
            PrintStream out = new PrintStream(System.out, true, charset);
            out.print(x);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Erro: charset invalido");
        }
    }

    public static void print(String x) {
        try {
            PrintStream out = new PrintStream(System.out, true, charset);
            out.print(x);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Erro: charset invalido");
        }
    }

    public static void print(boolean x) {
        try {
            PrintStream out = new PrintStream(System.out, true, charset);
            out.print(x);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Erro: charset invalido");
        }
    }

    public static void print(char x) {
        try {
            PrintStream out = new PrintStream(System.out, true, charset);
            out.print(x);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Erro: charset invalido");
        }
    }

    public static void println() {
    }

    public static void println(int x) {
        try {
            PrintStream out = new PrintStream(System.out, true, charset);
            out.println(x);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Erro: charset invalido");
        }
    }

    public static void println(double x) {
        try {
            PrintStream out = new PrintStream(System.out, true, charset);
            out.println(x);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Erro: charset invalido");
        }
    }

    public static void println(String x) {
        try {
            PrintStream out = new PrintStream(System.out, true, charset);
            out.println(x);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Erro: charset invalido");
        }
    }

    public static void println(boolean x) {
        try {
            PrintStream out = new PrintStream(System.out, true, charset);
            out.println(x);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Erro: charset invalido");
        }
    }

    public static void println(char x) {
        try {
            PrintStream out = new PrintStream(System.out, true, charset);
            out.println(x);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Erro: charset invalido");
        }
    }

    public static void printf(String formato, double x) {
        try {
            PrintStream out = new PrintStream(System.out, true, charset);
            out.printf(formato, x);// "%.2f"
        } catch (UnsupportedEncodingException e) {
            System.out.println("Erro: charset invalido");
        }
    }

    public static double readDouble() {
        double d = -1;
        try {
            d = Double.parseDouble(readString().trim().replace(",", "."));
        } catch (Exception e) {
        }
        return d;
    }

    public static double readDouble(String str) {
        try {
            PrintStream out = new PrintStream(System.out, true, charset);
            out.print(str);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Erro: charset invalido");
        }
        return readDouble();
    }

    public static float readFloat() {
        return (float) readDouble();
    }

    public static float readFloat(String str) {
        return (float) readDouble(str);
    }

    public static int readInt() {
        int i = -1;
        try {
            i = Integer.parseInt(readString().trim());
        } catch (Exception e) {
        }
        return i;
    }

    public static int readInt(String str) {
        try {
            PrintStream out = new PrintStream(System.out, true, charset);
            out.print(str);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Erro: charset invalido");
        }
        return readInt();
    }

    public static String readString() {
        String s = "";
        char tmp;
        try {
            do {
                tmp = (char) in.read();
                if (tmp != '\n' && tmp != ' ' && tmp != 13) {
                    s += tmp;
                }
            } while (tmp != '\n' && tmp != ' ');
        } catch (IOException ioe) {
            System.out.println("lerPalavra: " + ioe.getMessage());
        }
        return s;
    }

    public static String readString(String str) {
        try {
            PrintStream out = new PrintStream(System.out, true, charset);
            out.print(str);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Erro: charset invalido");
        }
        return readString();
    }

    public static String readLine() {
        String s = "";
        char tmp;
        try {
            do {
                tmp = (char) in.read();
                if (tmp != '\n' && tmp != 13) {
                    s += tmp;
                }
            } while (tmp != '\n');
        } catch (IOException ioe) {
            System.out.println("lerPalavra: " + ioe.getMessage());
        }
        return s;
    }

    public static String readLine(String str) {
        try {
            PrintStream out = new PrintStream(System.out, true, charset);
            out.print(str);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Erro: charset invalido");
        }
        return readLine();
    }

    public static char readChar() {
        char resp = ' ';
        try {
            resp = (char) in.read();
        } catch (Exception e) {
        }
        return resp;
    }

    public static char readChar(String str) {
        try {
            PrintStream out = new PrintStream(System.out, true, charset);
            out.print(str);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Erro: charset invalido");
        }
        return readChar();
    }

    public static boolean readBoolean() {
        boolean resp = false;
        String str = "";

        try {
            str = readString();
        } catch (Exception e) {
        }

        if (str.equals("true") || str.equals("TRUE") || str.equals("t") || str.equals("1") || str.equals("verdadeiro")
                || str.equals("VERDADEIRO") || str.equals("V")) {
            resp = true;
        }

        return resp;
    }

    public static boolean readBoolean(String str) {
        try {
            PrintStream out = new PrintStream(System.out, true, charset);
            out.print(str);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Erro: charset invalido");
        }
        return readBoolean();
    }

    public static void pause() {
        try {
            in.read();
        } catch (Exception e) {
        }
    }

    public static void pause(String str) {
        try {
            PrintStream out = new PrintStream(System.out, true, charset);
            out.print(str);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Erro: charset invalido");
        }
        pause();
    }
}

//////////////////////////////////////////////////////////////////////////

class Path {
    public static String getPath() {
        String os = System.getProperty("os.name");
        if (os.contains("Windows"))
            return "file\\filmes.txt";
        else
          return "/tmp/filmes.txt";
           //return "/home/user/Documents/Programs/Java-Homework/arvore/files/filmes.txt";
    }
}

class Filme {
    // Attributes
    private String id;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAtor1() {
        return ator1;
    }

    public void setAtor1(String ator1) {
        this.ator1 = ator1;
    }

    public String getAtor2() {
        return ator2;
    }

    public void setAtor2(String ator2) {
        this.ator2 = ator2;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPais_origem() {
        return pais_origem;
    }

    public void setPais_origem(String pais_origem) {
        this.pais_origem = pais_origem;
    }

    public int getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(int ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    private String titulo;
    private String diretor;
    private String ator1;
    private String ator2;
    private String duracao;
    private String categoria;
    private String pais_origem;
    private int ano_lancamento;

    // Constructor por leitura
    public Filme(String Linha, Boolean isArquivo) {

        if (isArquivo) {
            String[] Valores = Linha.split("#");
            this.id = Valores[0];
            this.titulo = Valores[1];
            this.diretor = Valores[2];
            this.ator1 = Valores[3];
            this.ator2 = Valores[4];
            this.ano_lancamento =  Integer.parseInt(Valores[5]);
            this.duracao = Valores[6];
            this.categoria = Valores[7];
            this.pais_origem = Valores[8];
        } else {
            String[] Valores = Linha.split(";");
            this.id = "null";
            this.titulo = Valores[0];
            this.diretor = "null";
            this.ator1 = "null";
            this.ator2 = "null";
            this.ano_lancamento =  Integer.parseInt(Valores[1]);
            this.duracao = Valores[2];
            this.categoria = "null";
            this.pais_origem = "null";
        }

    }

    public Filme(Filme newFilme) {
        this.id = newFilme.getId();
        this.titulo = newFilme.getTitulo();
        this.diretor = newFilme.getDiretor();
        this.ator1 = newFilme.getAtor1();
        this.ator2 = newFilme.getAtor2();
        this.ano_lancamento =  newFilme.getAno_lancamento();
        this.duracao = newFilme.getDuracao();
        this.categoria = newFilme.getCategoria();
        this.pais_origem = newFilme.getPais_origem();
    }

    public void imprimir() {
        MyIO.println("[" + this.titulo + "] " + "[" + this.ano_lancamento + "] " + "[" + this.pais_origem + "] "
                + "[" + this.categoria + "] " + "[" + this.diretor + "] " + "[" + this.ator1 + ", " + this.ator2 + "] "
                + "[" + this.duracao + "] " + "[" + this.id + "] ");

    }

}


class PrintMovies {
    public static void Print(ArrayList<Filme> filmesArray) {
        for(int i = 0; i < filmesArray.size(); i++) {
            filmesArray.get(i).imprimir();
        }
    }

}


///////////////////////////////////////////////////////////////////



class Nodo {
    public Filme valor;
    public Nodo esquerda;
    public Nodo direita;
    public int altura;

    public Nodo() {
        this.valor = null;
        this.esquerda = null;
        this.direita = null;
        this.altura = 0;
    }

    public Nodo(Filme valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
        this.altura = 0;
    }
}
 class Inteiro {
     public void setValor(Filme valor) {
         this.valor = valor;
     }

     private Filme valor;

     public Filme getValor() {
         return valor;
     }

     public Inteiro() {
        this.valor = null;
    }

    public Inteiro(Filme i) {
        this.valor = i;
    }



    public void imprimir() {
       this.valor.imprimir();
    }
}

 class No {
    private Inteiro item;
    private int altura;
    private No esquerda;
    private No direita;

    public No() {
        this.item = new Inteiro();
        this.altura = 0;
        this.esquerda = null;
        this.direita = null;
    }

    public No(Inteiro registro) {
        this.item = registro;
        this.altura = 0;
        this.esquerda = null;
        this.direita = null;
    }

    public Inteiro getItem() {
        return this.item;
    }

    public void setItem(Inteiro item) {
        this.item = item;
    }

    public No getEsquerda() {
        return this.esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return this.direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura() {
        int alturaEsq, alturaDir;

        if (this.direita == null)
            alturaDir = -1;
        else
            alturaDir = this.direita.getAltura();

        if (this.esquerda == null)
            alturaEsq = -1;
        else
            alturaEsq = this.esquerda.getAltura();

        if (alturaEsq > alturaDir)
            this.altura = alturaEsq + 1;
        else
            this.altura = alturaDir + 1;
    }

    public int getFatorBalanceamento() {
        int alturaEsq, alturaDir;

        if (this.direita == null)
            alturaDir = -1;
        else
            alturaDir = this.direita.getAltura();

        if (this.esquerda == null)
            alturaEsq = -1;
        else
            alturaEsq = this.esquerda.getAltura();

        return (alturaEsq - alturaDir);
    }
}
 class AVL {
     public No getRaiz() {
         return raiz;
     }

     private No raiz;

    public AVL() {
        raiz = null;
    }



     private boolean compara(Filme A, Filme B) {
         if(A.getAno_lancamento() > B.getAno_lancamento()) {
             return true; // A > B
         } else if ( A.getAno_lancamento() < B.getAno_lancamento()) {
             return false; // A < B
         } else if ( A.getAno_lancamento() == B.getAno_lancamento()) {

             if(A.getCategoria().compareTo(B.getCategoria()) > 0) {
                 return true; // A > B
             } else if ( A.getCategoria().compareTo(B.getCategoria()) < 0) {
                 return false; // A < B
             } else if ( A.getCategoria().compareTo(B.getCategoria()) == 0) {

                 if(A.getTitulo().compareTo(B.getTitulo()) > 0) {
                     return true; // A > B
                 } else if ( A.getTitulo().compareTo(B.getTitulo()) < 0) {
                     return false; // A < B
                 } else if ( A.getTitulo().compareTo(B.getTitulo()) == 0) {
                     return false;
                 }
             }
         }


         return true;
     }



     public void buscar(Inteiro novo) throws Exception {
         this.raiz = buscar(this.raiz, novo);

     }
     private No buscar(No raizSubarvore, Inteiro novo) throws Exception{
         if (raizSubarvore == null) {
             raizSubarvore = new No(novo);
             System.out.println(" - NAO");
         }
         else if (compara(raizSubarvore.getItem().getValor(), novo.getValor())) {

             if(raizSubarvore.getItem() != raiz.getItem()) {
                 System.out.print(" - ");
                 raizSubarvore.getItem().getValor().imprimir();

             }

             raizSubarvore.setEsquerda(buscar(raizSubarvore.getEsquerda(), novo));
         }
         else if (compara(novo.getValor(), raizSubarvore.getItem().getValor())) {
             if(raizSubarvore.getItem() != raiz.getItem()) {
                 System.out.print(" - ");
                 raizSubarvore.getItem().getValor().imprimir();
             }

             raizSubarvore.setDireita(buscar(raizSubarvore.getDireita(), novo));
         }
         else {
             System.out.println(" - SIM");

         }

         return balancear(raizSubarvore);

     }

    public void inserir(Inteiro novo) throws Exception {
        this.raiz = inserir(this.raiz, novo);
    }
    private No inserir(No raizSubarvore, Inteiro novo) throws Exception{
        if (raizSubarvore == null) {
            raizSubarvore = new No(novo);

        }
        else if (novo.getValor() == raizSubarvore.getItem().getValor()) {
            throw new Exception("Não foi possível inserir o item na árvore: chave já inseriada anteriormente!");
        }
        else if (compara(raizSubarvore.getItem().getValor(), novo.getValor())) {
            raizSubarvore.setEsquerda(inserir(raizSubarvore.getEsquerda(), novo));
        }
        else {
            raizSubarvore.setDireita(inserir(raizSubarvore.getDireita(), novo));
        }

        return balancear(raizSubarvore);
    }

    private No balancear(No raizSubarvore) {
        int fatorBalanceamento;
        int fatorBalanceamentoFilho;

        fatorBalanceamento = raizSubarvore.getFatorBalanceamento();

        if (fatorBalanceamento == 2) {
            // árvore desbalanceada para a esquerda.
            fatorBalanceamentoFilho = raizSubarvore.getEsquerda().getFatorBalanceamento();
            if (fatorBalanceamentoFilho == -1) {
                // rotação dupla.
                // rotação do filho à esquerda.
                raizSubarvore.setEsquerda(rotacionarEsquerda(raizSubarvore.getEsquerda()));
            }
            // rotação à direita.
            raizSubarvore = rotacionarDireita(raizSubarvore);
        }
        else if (fatorBalanceamento == -2) {
            // árvore desbalanceada para a direita.
            fatorBalanceamentoFilho = raizSubarvore.getDireita().getFatorBalanceamento();
            if (fatorBalanceamentoFilho == 1) {
                // rotação dupla.
                // rotação do filho à direita.
                raizSubarvore.setDireita(rotacionarDireita(raizSubarvore.getDireita()));
            }
            // rotação à esquerda.
            raizSubarvore = rotacionarEsquerda(raizSubarvore);
        }
        else {
            raizSubarvore.setAltura();
        }

        return raizSubarvore;
    }

    private No rotacionarDireita(No p) {
        No u = p.getEsquerda();
        No filhoEsquerdaDireita = u.getDireita();  // triângulo vermelho

        u.setDireita(p);
        p.setEsquerda(filhoEsquerdaDireita);

        p.setAltura();
        u.setAltura();

        return u;
    }

    private No rotacionarEsquerda(No p) {
        No z = p.getDireita();
        No filhoDireitaEsquerda = z.getEsquerda();  // triângulo vermelho

        z.setEsquerda(p);
        p.setDireita(filhoDireitaEsquerda);

        p.setAltura();
        z.setAltura();

        return z;
    }


    public void remover(Filme chaveRemover) throws Exception {
        this.raiz = remover(this.raiz, chaveRemover);
    }

    private No remover(No raizSubarvore, Filme chaveRemover) throws Exception {
        if (raizSubarvore == null) {
            throw new Exception("Não foi possível remover o item da árvore: chave não encontrada!");
        }
        else if (chaveRemover == raizSubarvore.getItem().getValor()) {
            if (raizSubarvore.getEsquerda() == null) {
                raizSubarvore = raizSubarvore.getDireita();
            }
            else if (raizSubarvore.getDireita() == null) {
                raizSubarvore = raizSubarvore.getEsquerda();
            }
            else {
                raizSubarvore.setEsquerda(antecessor(raizSubarvore, raizSubarvore.getEsquerda()));
            }
        }
        else if (compara(chaveRemover , raizSubarvore.getItem().getValor())) {
            raizSubarvore.setDireita(remover(raizSubarvore.getDireita(), chaveRemover));
        }
        else {
            raizSubarvore.setEsquerda(remover(raizSubarvore.getEsquerda(), chaveRemover));
        }
        return balancear(raizSubarvore);
    }

    private No antecessor(No noRetirar, No raizSubarvore) {
        if (raizSubarvore.getDireita() != null) {
            raizSubarvore.setDireita(antecessor(noRetirar, raizSubarvore.getDireita()));
        }
        else {
            noRetirar.setItem(raizSubarvore.getItem());
            raizSubarvore = raizSubarvore.getEsquerda();
        }
        return balancear(raizSubarvore);
    }

}




public class arvoreAvl {
    public static void main(String[] args) throws Exception {
        MyIO.setCharset("UTF-8");
        AVL ArvoreAVL = new AVL ();
        ArrayList<Filme> FilmeArquivos = new ArrayList<Filme>();
        ArrayList<Filme> FilmeConsole = new ArrayList<Filme>();
        ArrayList<Filme> FilmePesquisa = new ArrayList<Filme>();




        ArquivoTextoLeitura fileRead = null;
        String linha;

        try {
            fileRead = new ArquivoTextoLeitura(Path.getPath());
            linha = fileRead.ler();

            while (linha != null) {
                FilmeArquivos.add( new Filme(linha, true));
                linha = fileRead.ler();

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            fileRead.fecharArquivo();
        }

        // le console
        try {

            linha = MyIO.readLine();

            while (!linha.equals("FIM")) {

                String[] tempString = linha.split(";");
                String firstValue = tempString[0];
                for (Filme filmeArquivo : FilmeArquivos) {
                    if (filmeArquivo.getTitulo().equals(firstValue)) {
                        FilmeConsole.add(filmeArquivo);
                        //ArvoreBinaria.adicionar(FilmeArquivos.get(ii));
                    }

                }
                linha = MyIO.readLine();

            }

            linha = MyIO.readLine();
            while (!linha.equals("FIM")) {
                String[] tempString = linha.split(";");
                String firstValue = tempString[0];
                for (Filme filmeArquivo : FilmeArquivos) {
                    if (filmeArquivo.getTitulo().equals(firstValue)) {
                        FilmePesquisa.add(filmeArquivo);
                        //ArvoreBinaria.adicionar(FilmeArquivos.get(ii));
                    }

                }
                linha = MyIO.readLine();
            }

        } catch (Exception e) {
            // TODO: handle exception
        }



        for(int a = 0 ; a < FilmeConsole.size();a++) {
            ArvoreAVL.inserir(new Inteiro(FilmeConsole.get(a)));
        }


        for(int a = 0 ; a < FilmePesquisa.size();a++) {
            ArvoreAVL.getRaiz().getItem().getValor().imprimir();
            ArvoreAVL.buscar(new Inteiro(FilmePesquisa.get(a)));
        }

       // ArvoreAVL.raiz.getEsquerda().getItem().getValor().imprimir();


    }

}