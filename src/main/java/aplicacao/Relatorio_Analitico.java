package aplicacao;

/**
 *
 * @author michael.lsantos6
 */
public class Relatorio_Sintetico {
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
}