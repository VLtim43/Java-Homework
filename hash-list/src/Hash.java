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
       // return "/tmp/filmes.txt";
    return "/home/user/Documents/Programs/Java-Homework/arvore/files/filmes.txt";
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

public int getDuracao() {
    return duracao;
}

public void setDuracao(String duracao) {
    this.duracao = Integer.parseInt(duracao);
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
private int duracao;
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
        this.duracao = Integer.parseInt(Valores[6]);
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
        this.duracao = Integer.parseInt(Valores[2]);
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

///////////////////////////////////////////////////////////////////

class HashTable {
 public ArrayList<Filme>[] array;
private int size;

public ArrayList<Filme> emptyValue;

public HashTable(int size) {
    array = new ArrayList[size];
    this.size = size;
    for (int i = 0; i < array.length; i++) {
        array[i] = new ArrayList<>();
    }
    this.emptyValue = array[0];
}

public void inserir(int Row, Filme filme)  {
    array[Row].add(filme);
}


public int showRows() {
  return array.length;
};

public int showColumns() {
     return array[0].size();
 };

private int hash(int a, int b) {
    return (a * b) % array.length;
}
}

///////////////////////////////////////////////////////////////////


public class Hash {
public static void main(String[] args) {
    MyIO.setCharset("UTF-8");
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
        assert fileRead != null;
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
                }

            }
            linha = MyIO.readLine();
        }

    } catch (Exception e) {
        // TODO: handle exception
    }


  //  for(int i = 0; i < FilmePesquisa.size() ; i++) {
   //     FilmePesquisa.get(i).imprimir();
   // }

    HashTable HashTable = new HashTable(331);

  // System.out.println( HashTable.array[0].get(0).getTitulo());
     HashTable.inserir(0,FilmePesquisa.get(0));
      
      
      
      
      











}

}