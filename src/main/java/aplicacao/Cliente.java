package aplicacao;

import java.util.Date;

/**
 *
 * @author michael.lsantos6
 */
public class Cliente {
     

        String nome;
        int CPF;
        String endereco;
        String email;
        String sexo;
        Date datNac;
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

        public void setDatNac(Date datNac) {
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

