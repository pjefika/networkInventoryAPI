/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.OrigemPlanta;
import dao.FactoryDAO;
import dao.NetworkInventoryGponDAO;
import java.util.ArrayList;
import java.util.List;
import model.entity.NetworkInventoryGpon;

public class ClientesVizinhosServiceImpl implements ClientesVizinhosService {

    private NetworkInventoryGponDAO dao;

    private List<EfikaCustomerDTO> retorno;

    @Override
    public List<EfikaCustomerDTO> consultar(EfikaCustomer ec, Integer qtde) throws Exception {
        try {
            if (ec.getRede().getPlanta() == OrigemPlanta.VIVO2) {
                dao = FactoryDAO.createGponVivo2();
                NetworkInventoryGpon inventory = dao.consultarCliente(ec.getDesignadorAcesso());
                retorno = new ArrayList<>();
                dao.consultarVizinhos(inventory, qtde).forEach((t) -> {
                    retorno.add(adapter(t));
                });
                return retorno;
            } else {
                return null;
            }
        } catch (Exception e) {
            throw new Exception("Falha ao consultar clientes vizinhos.");
        }
    }

    protected EfikaCustomerDTO adapter(NetworkInventoryGpon inv) {
        return new EfikaCustomerDTO(inv);
    }

//    protected EfikaCustomerDTO adapter(NetworkInventoryG inv) {
//        return new EfikaCustomerDTO(inv);
//    }
}
