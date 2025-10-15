package br.com.alura.Compras;

public class Produto{
    private final String nome;
    private double valor;

    public Produto(String nome, double valor){
        this.nome=nome;
        this.valor=valor;
    }

    public String getNome(){ return this.nome;}
    public double getValor(){ return this.valor;}

    public void setValor(double valor){this.valor=valor;}

    @Override
    public String toString(){
        return "{ Nome: " + this.nome + ", Valor: " + this.valor + " }";
    }


}
