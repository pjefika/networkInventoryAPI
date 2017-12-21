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
import dao.NetworkInventorySigresFibraDAO;
import java.util.ArrayList;
import java.util.List;
import model.entity.NetworkInventoryGpon;
import model.entity.NetworkInventorySigresFibra;

public class ClientesVizinhosServiceImpl implements ClientesVizinhosService {

    private NetworkInventoryGponDAO dao;

    private NetworkInventorySigresFibraDAO dao2;

    private List<EfikaCustomerDTO> retorno = new ArrayList<>();

    private final ClientesVizinhosResponse resp = new ClientesVizinhosResponse();

    @Override
    public ClientesVizinhosResponse consultar(EfikaCustomer ec, Integer qtde) throws Exception {
        try {
            if (ec.getRede().getPlanta() == OrigemPlanta.VIVO2) {
                dao = FactoryDAO.createGponVivo2();
                NetworkInventoryGpon inventory = dao.consultarCliente(ec.getDesignadorAcesso());
                retorno = new ArrayList<>();
                dao.consultarVizinhos(inventory, qtde).forEach((t) -> {
                    retorno.add(adapter(t));
                });
                resp.setVizinhos(retorno);
            } else {
                dao2 = FactoryDAO.createFibraVivo1();
                NetworkInventorySigresFibra inventory = dao2.consultarCliente(ec.getInstancia());

                dao2.consultarVizinhos(inventory, qtde).forEach((t) -> {
                    retorno.add(adapter(t));
                });
                resp.setVizinhos(retorno);
            }

            if (resp.getVizinhos().size() > 1) {
                throw new Exception("Falha ao consultar clientes vizinhos.");
            }

            return resp;
        } catch (Exception e) {
            throw new Exception("Falha ao consultar clientes vizinhos.");
        }
    }

    protected EfikaCustomerDTO adapter(NetworkInventoryGpon inv) {
        return new EfikaCustomerDTO(inv);
    }

    protected EfikaCustomerDTO adapter(NetworkInventorySigresFibra inv) {
        return new EfikaCustomerDTO(inv);
    }
}
