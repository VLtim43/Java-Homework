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
            return "files\\filmes.txt";
        else
            return "/home/user/Documents/Programs/Java-Homework/arvore/files/filmes.txt";
    }
}

class Filme {
    // Attributes
    private String id;

    public int getLancamento() {
        return ano_lancamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getTitulo() {
        return titulo;
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

    public Nodo() {
        this.valor = null;
        this.esquerda = null;
        this.direita = null;
    }

    public Nodo(Filme valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}


 class ArvoreBinaria {
     public Nodo raiz;
     public ArvoreBinaria() {
         this.raiz = null;
     }

     public ArvoreBinaria(Nodo no) {
         this.raiz = no;
     }

     public boolean vazia() {
         return (this.raiz == null);
     }


     public void adicionar(Filme valor) {
         if(this.raiz == null)
             this.raiz = new Nodo(valor);
         else
             this.inserir(this.raiz, valor);
     }

     private Nodo inserir(Nodo raizSubarvore, Filme valor) {
         if(raizSubarvore == null) {
             raizSubarvore = new Nodo(valor);
         }
         else {

             if(compara(valor,raizSubarvore.valor)) {
                 raizSubarvore.direita = this.inserir(raizSubarvore.direita, valor);
             }
             else if(compara(raizSubarvore.valor,valor)) {
                 raizSubarvore.esquerda = this.inserir(raizSubarvore.esquerda, valor);
             }
             else {
                //
             }
         }
         return raizSubarvore;
     }

     private boolean compara(Filme A, Filme B) {
         if(A.getLancamento() > B.getLancamento()) {
             return true; // A > B
         } else if ( A.getLancamento() < B.getLancamento()) {
             return false; // A < B
         } else if ( A.getLancamento() == B.getLancamento()) {
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

     public void imprimirPreOrdem(Nodo raizSubarvore) {
         if(raizSubarvore != null) {
             System.out.println(raizSubarvore.valor.getTitulo());
             imprimirPreOrdem(raizSubarvore.esquerda);
             imprimirPreOrdem(raizSubarvore.direita);
         }
     }




     public void buscar(String titulo) {
         if (buscarNo(raiz, titulo)) {
             System.out.println("Yes");
         } else {
             System.out.println("No");
         }
     }

     private boolean buscarNo(Nodo raizSubarvore, String titulo) {
         if (raizSubarvore == null) {
             return false;
         }
         raizSubarvore.valor.imprimir();
         if (raizSubarvore.valor.getTitulo().equals(titulo)) {
             return true;
         }

         return buscarNo(raizSubarvore.esquerda, titulo) || buscarNo(raizSubarvore.direita, titulo);
     }





 }




    public class arvore {
    public static void main(String[] args) {
        MyIO.setCharset("UTF-8");
        ArvoreBinaria ArvoreBinaria = new ArvoreBinaria();
        ArrayList<Filme> FilmeArquivos = new ArrayList<Filme>();
        ArrayList<Filme> FilmeConsole = new ArrayList<>();


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
                ArvoreBinaria.adicionar(new Filme(linha, false)); // Add the line to the binary tree
                linha = MyIO.readLine();

            }

            linha = MyIO.readLine(); // Read the next line after the first "FIM"

            while (!linha.equals("FIM")) {
                FilmeConsole.add(new Filme(linha, false)); // Add the line to the ArrayList
                linha = MyIO.readLine();
            }



        } catch (Exception e) {
            // TODO: handle exception
        }


        //ArvoreBinaria.raiz.valor.Imprimir();
        //System.out.print(FilmeConsole.get(0).getTitulo());



       // for(int k = 0 ; k < FilmeConsole.size(); k++) {
        //    ArvoreBinaria.buscar(FilmeConsole.get(k).getTitulo());
        //}

       //for(int k = 0; k < FilmeConsole.size(); k++) {
          // System.out.println(ArvoreBinaria.buscar(FilmeConsole.get(k).getTitulo()));

      // }

        ArvoreBinaria.buscar("22 July");


    }

}