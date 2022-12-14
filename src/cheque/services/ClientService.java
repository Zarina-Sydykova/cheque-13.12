package cheque.services;

import cheque.classes.Clients;
import cheque.classes.Markets;
import cheque.enums.Products;

import java.util.List;
import java.util.Map;

public interface ClientService {
    String createClients();
    void getAllMarkets(Markets [] markets);

    List<Clients> getAllClients();

    Map<Products,Integer> getCheque();
}
