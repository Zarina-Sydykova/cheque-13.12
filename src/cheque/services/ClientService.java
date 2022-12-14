package cheque.services;

import cheque.classes.Markets;

public interface ClientService {
    Markets markets();
    String getAllClients();
    String groceryShopping();
    String cheque();
}
