package aplicacao;

import java.util.Date;

/**
 *
 * @author michael.lsantos6
 */
public class Pedido {
   
     
        float valorVenda;
        Date dataCompra;

        public Date getDataCompra() {
            return dataCompra;
        }

        public void setDataCompra(Date dataCompra) {
            this.dataCompra = dataCompra;
        }


        public float getvalorVenda() {
            return valorVenda;
        }

        public void setvalorVenda(int valorVenda) {
            this.valorVenda = valorVenda;
        }

    }


