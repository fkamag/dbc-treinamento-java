package parteum;

public class LivrosClasse {

  String titulo;
  String autor;
  int anoPublicacao;

  public LivrosClasse(String titulo, String autor, int anoPublicacao) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
  }

  public static void main(String[] args) {
    LivrosClasse[] estante = new LivrosClasse[3];

    estante[0] = new LivrosClasse("It", "Stephen King", 1973);
    estante[1] = new LivrosClasse("1984", "George Owel", 1958);
    estante[2] = new LivrosClasse("O Pequeno Príncipe",
        "Antoine de Saint-Exupéry", 1908);

    for (int i = 0; i < estante.length; i++) {
      System.out.println("Livro " + (i + 1) + ":");
      System.out.println("Título: " + estante[i].titulo);
      System.out.println("Autor: " + estante[i].autor);
      System.out.println("Ano de Publicação: " + estante[i].anoPublicacao);
      System.out.println("-------------------------------");
    }




  }


}
