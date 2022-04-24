package aplicacao;


import java.util.Date;


public class Main {

    public static void main(String[] args) {
    
    }

    /*Aqui contém todas as informações que podem ser usadas futuramente e compoem as classes, como o tamanho, cor modelo do tenis, 
  entre outros atributos de pessoas, como cpf, idade, endereço entre outras coisas.*/
    public class Tenis {

        private String cor;
        private String modelo;
        private int valor;
        private int tamanho;

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getValor() {
            return valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }

        public int getTamanho() {
            return tamanho;
        }

        public void setTamanho(int tamanho) {
            this.tamanho = tamanho;
        }

    }

    public class Cliente {

        String nome;
        int CPF;
        String endereco;
        String email;
        String sexo;
        int datNac;
        String estCivil;
        int telefone;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getCPF() {
            return CPF;
        }

        public void setCPF(int CPF) {
            this.CPF = CPF;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;

        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        public int getDatNac() {
            return datNac;
        }

        public void setDatNac(int datNac) {
            this.datNac = datNac;
        }

        public String getEstCivil() {
            return estCivil;
        }

        public void setEstCivil(String estCivil) {
            this.estCivil = estCivil;
        }

        public int getTelefone() {
            return telefone;
        }

        public void setTelefone(int telefone) {
            this.telefone = telefone;
        }

    }

    public class Vendas {

        int qntEstoque;
        float totalVendas;
        Date dataCompra;

        public Date getDataCompra() {
            return dataCompra;
        }

        public void setDataCompra(Date dataCompra) {
            this.dataCompra = dataCompra;
        }

        public int getQntEstoque() {
            return qntEstoque;
        }

        public void setQntEstoque(int qntEstoque) {
            this.qntEstoque = qntEstoque;
        }

        public float getTotalVendas() {
            return totalVendas;
        }

        public void setTotalVendas(int totalVendas) {
            this.totalVendas = totalVendas;
        }

    }

    public class Relatorio {

        float consulVendas;
        String ConsultaNome;
        String ConsultaData;

        public float getConsulVendas() {
            return consulVendas;
        }

        public void setConsulVendas(float consulVendas) {
            this.consulVendas = consulVendas;
        }

        public String getConsultaNome() {
            return ConsultaNome;
        }

        public void setConsultaNome(String ConsultaNome) {
            this.ConsultaNome = ConsultaNome;
        }

        public String getConsultaData() {
            return ConsultaData;
        }

        public void setConsultaData(String ConsultaData) {
            this.ConsultaData = ConsultaData;
        }

    }
}
