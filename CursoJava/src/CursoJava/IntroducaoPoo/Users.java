package CursoJava.IntroducaoPoo;

public class Users {
    private String nome;
    private int idade;

    public Users(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Users(){

    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    



}
