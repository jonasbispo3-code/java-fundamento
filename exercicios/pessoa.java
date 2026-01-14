public class pessoa {
    //Atributos (dados)
    String nome;
    int idade;
    double altura;

    //Construtor
    public pessoa(String nome, int idade, double altura) {
       this.nome = nome;
       this.idade = idade;
       this.altura = altura;
    }

    // Maneira
     public void apresentar(){
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("altura: " + altura);
     }


}
