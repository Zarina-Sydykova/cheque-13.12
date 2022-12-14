package cheque.services.impl;

import cheque.classes.Clients;
import cheque.classes.Markets;
import cheque.services.ClientService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ClientServiceImpl implements ClientService {
    List<Clients> clients = new ArrayList<Clients>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public String createClients() {
        System.out.println("Name: ");
        String name = scanner.nextLine().toUpperCase(Locale.ROOT);
        System.out.println("CreditCard: ");
        Integer bankCard = scanner.nextInt();
        System.out.println("Password: ");
        Integer bankCardPassword = scanner.nextInt();
        Clients client = new Clients(name, bankCard, bankCardPassword);
        client.add(clients);
        System.out.println(clients);
        return "Client created successfully!";
    }

    @Override
    public Markets markets() {

        return markets();
    }

    @Override
    public String getAllClients() {
        System.out.println("\n\tHere is registered clients");
        if (this.clients.isEmpty()) {
            System.out.println("\nClient list is empty, please add some client");
        } else {
            for (int i = 0; i < this.clients.size(); i++) {
                Clients.printUserInfo(this.clients.get(i));
            }
        }
        return this.clients;
    }

    @Override
    public String groceryShopping() {
        return null;
    }

    @Override
    public String cheque() {
        return null;
    }
}
