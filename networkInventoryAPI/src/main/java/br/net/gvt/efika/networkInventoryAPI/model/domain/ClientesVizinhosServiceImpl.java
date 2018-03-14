/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI.model.domain;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.enums.OrigemPlanta;
import br.net.gvt.efika.networkInventoryAPI.dao.FactoryDAO;
import br.net.gvt.efika.networkInventoryAPI.dao.NetworkInventoryGponDAO;
import br.net.gvt.efika.networkInventoryAPI.dao.NetworkInventorySigresFibraDAO;
import br.net.gvt.efika.networkInventoryAPI.model.domain.adapter.EfikaCustomerAdapter;
import java.util.ArrayList;
import java.util.List;
import br.net.gvt.efika.networkInventoryAPI.model.entity.NetworkInventoryGpon;
import br.net.gvt.efika.networkInventoryAPI.model.entity.NetworkInventorySigresFibra;
import br.net.gvt.efika.network_inventory.model.dto.ClientesVizinhosResponseDTO;

public class ClientesVizinhosServiceImpl implements ClientesVizinhosService {

    private NetworkInventoryGponDAO dao;

    private NetworkInventorySigresFibraDAO dao2;

    private List<EfikaCustomer> retorno = new ArrayList<>();

    private final ClientesVizinhosResponseDTO resp = new ClientesVizinhosResponseDTO();

    @Override
    public ClientesVizinhosResponseDTO consultar(EfikaCustomer ec, Integer qtde) throws Exception {
        try {
            if (ec.getRede().getPlanta() == OrigemPlanta.VIVO2) {
                dao = FactoryDAO.createGponVivo2();
                NetworkInventoryGpon inventory = dao.consultarCliente(ec.getDesignadorAcesso());
                retorno = new ArrayList<>();
                dao.consultarVizinhos(inventory, qtde).forEach((t) -> {
                    retorno.add(EfikaCustomerAdapter.adapter(t));
                });
                resp.setVizinhos(retorno);
            } else {
                dao2 = FactoryDAO.createFibraVivo1();
                NetworkInventorySigresFibra inventory = dao2.consultarCliente(ec.getInstancia());
                dao2.consultarVizinhos(inventory, qtde).forEach((t) -> {
                    retorno.add(EfikaCustomerAdapter.adapter(t));
                });
                resp.setVizinhos(retorno);
            }

            if (resp.getVizinhos().size() < 2) {
                throw new Exception("Falha ao consultar clientes vizinhos.");
            }

            return resp;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Falha ao consultar clientes vizinhos.");
        }
    }

   
}
