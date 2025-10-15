package br.com.alura.Compras;

public class CartaoCredito implements Cartao{

    private int id;
    private String nome;
    private double saldo;

    public CartaoCredito(String nome, int id){
        this.id=id;
        this.nome=nome;
        this.saldo=0.00;
    }

    public CartaoCredito(){

    }

    public CartaoCredito(double limite){
        this.saldo=limite;
    }

    public CartaoCredito(String nome, double limite){
        this.nome=nome;
        this.saldo=limite;
    }


    public void setNome(String nome) {this.nome=nome;}

    public String getNome(){ return this.nome;}
    public int getId(){ return this.id;}
    public double getSaldo(){ return this.saldo;}

    @Override
    public String toString(){
        return "{ Id: " + this.id + ", Nome: " + this.nome + ", Saldo: " + this.saldo + "}";
    }

    @Override
    public boolean gastar(double valor) {
        if (valor-this.saldo >=0 ){
            this.saldo-=valor;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public double depositar(double valor){
        return this.saldo += valor;
    }

}
