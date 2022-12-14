package cheque.services;

import cheque.classes.Clients;
import cheque.classes.Markets;

import java.util.List;

public interface ClientService {
    String createClients();
    Markets markets();
    String getAllClients();
    String groceryShopping();
    String cheque();
}
