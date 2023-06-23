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


/////////////////////////////////////////////////////////////////////////


class Animal {
    private String nome;
    public String nomeCientifico;
    private boolean domestico;
    private int peso;
    private int idadeMaxima;

    public Animal() {
        this.domestico = false;
        this.idadeMaxima = 0;
    }

    public Animal(String nome, String nomeCientifico, boolean domestico,
                  int peso, int idadeMaxima)
    {
        super();
        this.nome = nome;
        this.nomeCientifico = nomeCientifico;
        this.domestico = domestico;
        this.peso = peso;
        this.idadeMaxima = idadeMaxima;
    }

    public Animal(String nome) {
        super();
        this.nome = nome;
        this.nomeCientifico = "null";
        this.domestico = false;
        this.peso = 0;
        this.idadeMaxima = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }

    public int getIdadeMaxima() {
        return idadeMaxima;
    }

    public void setIdadeMaxima(int idadeMaxima) {
        this.idadeMaxima = idadeMaxima;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void imprimir() {
        MyIO.println(this.getNome() + " (" + this.nomeCientifico + ")");

    }



}



/////////////////////////////////////////////////////////////////////////


class Nodo {

    public Animal valor;
    public Nodo esquerda;
    public Nodo direita;

    public Animal getValor() {
        return valor;
    }

    public void setValor(Animal valor) {
        this.valor = valor;
    }

    public Nodo getEsquerda() {
        return esquerda;
    }

    public Nodo getDireita() {
        return direita;
    }

    public void setEsquerda(Nodo esquerda) {
        this.esquerda = esquerda;
    }

    public void setDireita(Nodo direita) {
        this.direita = direita;
    }



    public Nodo() {
        this.valor = null;
        this.esquerda = null;
        this.direita = null;
    }

    public Nodo(Animal valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}



/////////////////////////////////////////////////////////////////////////



class Arvore {
    public Nodo raiz;


    public Arvore() {
        this.raiz = null;
    }


    //comparar

    private boolean eMaior(Animal animalA, Animal animalB) {
        return animalA.nomeCientifico.compareTo(animalB.nomeCientifico) > 0;
    }

    private boolean eMenor(Animal animalA, Animal animalB) {
        return animalA.nomeCientifico.compareTo(animalB.nomeCientifico) <  0;
    }


    //inserir
    public void adicionar(Animal valor) {
        if(this.raiz == null)
            this.raiz = new Nodo(valor);
        else
            this.inserir(this.raiz, valor);
    }

    private Nodo inserir(Nodo raizSubarvore, Animal valor) {
        if(raizSubarvore == null) {
            raizSubarvore = new Nodo(valor);
        }
        else {

            if(eMaior(valor,raizSubarvore.valor)) {
                raizSubarvore.direita = this.inserir(raizSubarvore.direita, valor);
            }
            else if(eMenor(valor,raizSubarvore.valor)) {
                raizSubarvore.esquerda = this.inserir(raizSubarvore.esquerda, valor);
            }
            //

        }
        return raizSubarvore;
    }



    public void buscar(Animal valor) {
        this.buscar(this.raiz, valor);
    }

    public void buscar(Nodo raizSubarvore, Animal valor) {

        if(raizSubarvore == null) {
            System.out.println(" - NAO");
        } else {

            if(eMaior(valor,raizSubarvore.valor)) {
                if(raizSubarvore != raiz) {
                    System.out.print(" - ");
                    raizSubarvore.valor.imprimir();
                }

                this.buscar(raizSubarvore.direita, valor);

            }
            else if(eMenor(valor,raizSubarvore.valor)) {
                if(raizSubarvore != raiz) {
                    System.out.print(" - ");
                    raizSubarvore.valor.imprimir();
                }



                this.buscar(raizSubarvore.esquerda, valor);


            }
            else {
                System.out.print(" - ");
                raizSubarvore.valor.imprimir();
                System.out.println(" - SIM");
            }
        }
    }



    //caminhamentos
    public void caminhamentoEmOrdem() {
        caminhamentoEmOrdem(this.raiz);
    }

    private void caminhamentoEmOrdem(Nodo raizSubarvore) {
        if (raizSubarvore != null) {
            caminhamentoEmOrdem(raizSubarvore.getEsquerda());
            System.out.print(" - ");
            raizSubarvore.getValor().imprimir();
            caminhamentoEmOrdem(raizSubarvore.getDireita());
        }
    }

    //caminhamentos
    public void caminhamentoPreOrdem() {
        caminhamentoPreOrdem(this.raiz);
    }

    private void caminhamentoPreOrdem(Nodo raizSubarvore) {
        if (raizSubarvore != null) {
            System.out.print(" - ");
            raizSubarvore.getValor().imprimir();
            caminhamentoPreOrdem(raizSubarvore.getEsquerda());
            caminhamentoPreOrdem(raizSubarvore.getDireita());
        }
    }

    //caminhamentos
    public void caminhamentoPosOrdem() {
        caminhamentoPosOrdem(this.raiz);
    }

    private void caminhamentoPosOrdem(Nodo raizSubarvore) {
        if (raizSubarvore != null) {
            caminhamentoPosOrdem(raizSubarvore.getEsquerda());
            caminhamentoPosOrdem(raizSubarvore.getDireita());
            System.out.print(" - ");
            raizSubarvore.getValor().imprimir();        }
    }



}


///////////////////////////////////////////////////////////////////


public class prova3 {
    public static void main(String[] args) {
        MyIO.setCharset("UTF-8");
        Arvore arvore = new Arvore();

        ArrayList<Animal> AnimalConsole = new ArrayList<Animal>();
        ArrayList<Animal> AnimalPesquisa = new ArrayList<Animal>();



        String linha = MyIO.readLine();

       //preenchimento dos vetores
        try {
            while(!linha.equals("FIM")) {
                String[] valores = linha.split(";");
                AnimalConsole.add(new Animal(valores[0], valores[1], Boolean.parseBoolean(valores[2]),
                        Integer.parseInt(valores[3]), Integer.parseInt(valores[4])));

                linha = MyIO.readLine();
            }


            linha = MyIO.readLine();
            while (!linha.equals("FIM")) {
                String[] tempString = linha.split(";");
                String firstValue = tempString[0];

                for(int i = 0; i < AnimalConsole.size(); i++) {
                    if (AnimalConsole.get(i).nomeCientifico.equals(firstValue)) {
                        AnimalPesquisa.add(AnimalConsole.get(i));
                    }
                }
                linha = MyIO.readLine();
            }

        } catch (Exception e) {
            System.out.print(e);
        }



        //Adicionar na arvore
       for (Animal animal : AnimalConsole) {
            arvore.adicionar(animal);
        }

        for (Animal animal : AnimalPesquisa) {
            arvore.raiz.valor.imprimir();
            arvore.buscar(animal);
        }








        System.out.println("-----");

        //caminhamento Em Ordem
        MyIO.println("[EM ORDEM]");
        arvore.caminhamentoEmOrdem();
        System.out.println("-----");

        //caminhamento Pré Ordem
        MyIO.println("[PRÉ ORDEM]");
        arvore.caminhamentoPreOrdem();
        System.out.println("-----");

        //caminhamento Pós Ordem
        MyIO.println("[PÓS ORDEM]");
        arvore.caminhamentoPosOrdem();
        System.out.println("-----");








    }

}