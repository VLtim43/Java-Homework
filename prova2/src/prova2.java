import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.io.*;
import java.nio.charset.*;

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

class Animal {
    private String nome;
    private String nomeCientifico;
    private boolean domestico;
    private int peso;
    private int idadeMaxima;

    public Animal() {
        this.domestico = false;
        this.idadeMaxima = 0;
    }

    public Animal(String nome, String nomeCientifico, boolean domestico, int peso, int idadeMaxima) {
        super();
        this.nome = nome;
        this.nomeCientifico = nomeCientifico;
        this.domestico = domestico;
        this.peso = peso;
        this.idadeMaxima = idadeMaxima;
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

    public String toString() {
        return this.getNome() + " (" + this.nomeCientifico + "), animal "
                + (this.isDomestico() ? "domestico" : "selvagem") + " com idade maxima de " + this.getIdadeMaxima()
                + " anos " + "e peso estimado de " + this.getPeso() + " quilos.";
    }
}

///////////////////////////////////////////////////////////////////

class SelectionSort {
    public static void sort(int[] array, int n) {
        for (int i = 0; i < (n - 1); i++) {
            int menor = i;
            for (int j = (i + 1); j < n; j++) {
                if (array[menor] > array[j]) {
                    menor = j;
                }
            }
            int temp = array[i];
            array[i] = array[menor];
            array[menor] = temp;
        }
    }
}

public class prova2 {
    public static void main(String[] args) {
        // vetor de animais
        Animal[] animais = new Animal[50];

        String linha = MyIO.readLine();
        int quantidade = 0; // quantidade efetiva de animais no vetor

        // preenchimento do vetor
        while (!linha.equals("FIM")) {
            String[] valores = linha.split(";");

            animais[quantidade++] = new Animal(valores[0], valores[1], Boolean.parseBoolean(valores[2]),
                    Integer.parseInt(valores[3]), Integer.parseInt(valores[4]));

            linha = MyIO.readLine();
        }

        linha = MyIO.readLine();

        // pesquisa no vetor
        while (!linha.equals("FIM")) {
            String[] pesos = linha.split(";");
            int peso_min, peso_max;

            try {
                peso_min = Integer.parseInt(pesos[0]);
                peso_max = Integer.parseInt(pesos[1]);

                for (int i = 0; i < quantidade; i++) {
                    if (animais[i].getPeso() >= peso_min && animais[i].getPeso() <= peso_max) {
                        System.out.println(animais[i]);
                    }
                }
            } catch (Exception ex) {
                System.out.println("Informacao de peso do animal incorreta.");
            }

            linha = MyIO.readLine();
        }

        System.out.println("-----");

        int n = animais.length;
        int NUM_COMPARACOES = 0;
        for (int i = 0; i < (n - 1); i++) {

            int menor = i;
            for (int j = (i + 1); j < n; j++) {
                if (animais[j] != null) {
                    NUM_COMPARACOES++;
                    if (animais[menor].getIdadeMaxima() > animais[j].getIdadeMaxima()) { // compara idade

                        menor = j;

                    } else if (animais[menor].getIdadeMaxima() == animais[j].getIdadeMaxima()) {

                        if (animais[menor].getPeso() > animais[j].getPeso()) { // compara peso
                            menor = j;

                        } else if (animais[menor].getPeso() == animais[j].getPeso()) {

                            int compare = animais[menor].getNome().compareTo(animais[j].getNome()); // compara nome
                            if (compare < 0) {
                                menor = j;

                            }
                            NUM_COMPARACOES++;
                        }

                    }

                }

            }
            Animal temp = animais[i];
            animais[i] = animais[menor];
            animais[menor] = temp;
            NUM_COMPARACOES++;

        }

        for (int i = 0; i < n; i++) {
            if (animais[i] != null) {
                System.out.println(animais[i].toString());
            }
        }

        System.out.println("[NUM_COMPARACOES] [" + NUM_COMPARACOES + "]");

    }

}
