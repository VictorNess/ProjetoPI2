package aplicacao;

import java.util.Date;

/**
 *
 * @author michael.lsantos6
 */
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


