package partedois;

public class Pessoa {
  // atributos
  public String nome;
  public String endereco;
  public int idade;
  public double peso;

  // constructor
  public Pessoa(String nome, String endereco, int idade, double peso) {
    this.nome = nome;
    this.endereco = endereco;
    this.idade = idade;
    this.peso = peso;
  }

  // métodos
  public void falar() {
    System.out.println("Olá tudo bem");
  }

  public void dormir() {
    System.out.println("Estou dormindo");
  }

  public void comer() {
    System.out.println("Estou comendo");
  }

}
