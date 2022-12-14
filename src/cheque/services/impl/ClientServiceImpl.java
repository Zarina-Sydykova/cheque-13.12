package cheque.services.impl;

import cheque.classes.Clients;
import cheque.classes.Markets;
import cheque.enums.Products;
import cheque.services.ClientService;

import java.util.*;

public class ClientServiceImpl<Discount> implements ClientService {
    List<Clients> clients = new ArrayList<Clients>();
    List<Markets> markets = new ArrayList<>();
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
        clients.add(client);
        System.out.println(clients);
        return "Client created successfully!";
    }

    @Override
    public void getAllMarkets(Markets[] markets) {
        for (Markets market : markets) {
            System.out.println(market.name);
        }

    }


    @Override
    public List<Clients>getAllClients() {
        System.out.println("\n\tHere is registered clients");
        if (this.clients.isEmpty()) {
            System.out.println("\nClient list is empty, please add some client");
        } else {
            for (int i = 0; i < this.clients.size(); i++) {
                Clients.printUserInfo(this.clients.get(i));
            }
        }
        return clients;
    }


    @Override
    public Map<Products, Integer> getCheque() {
        Map<Products, Integer> productsIntegerMap = new HashMap<>();
        try {
            List<Integer> price = new ArrayList<>();
            List<Products>list=new ArrayList<>();
            Integer sum;
            Integer disc = 0;
            System.out.print("Write buyer name: ");
            String name = scanner.next().toUpperCase();
            for (Clients client : clients) {
                if (name.equals(client.getName())){
                    System.out.print("Choose market: ");
                    Markets markets = Markets.valueOf(scanner.next().toUpperCase());
                    Markets[] market = Markets.values();
                    for (Markets markets1 : market) {
                        if (markets1.equals(markets)) {
                            System.out.print("Choose products: ");
                            Products products = Products.valueOf(scanner.next().toUpperCase());
                            Integer p1 = products.getPrice();


                            System.out.println("Price product:"+p1);
                            Integer buy=clients.getBankCard();
                            Integer marketMoney=markets1.getBankCard();
                            System.out.println("Buyer money: "+buy);
                            if ((buy-(p1))>0){

                                Integer buyerMoney= (buy-(p1));
                                Integer mMoney=marketMoney+p1;
                                clients.setBankCard(buyerMoney);
                                markets1.setBankCard(mMoney);

                                System.out.println("Remainder money: "+buyerMoney);
                                Integer d1=products.getSum();
                                price.add(p1);
                                disc=(d1);
                                sum = p1;
                                goodsIntegerMap.put(products, p1);
                                if (name.equals(client.getName())){
                                    list.add(products);
                                    clients.setList(list);
                                    List<Markets>marketsList=new ArrayList<>();
                                    marketsList.add(markets);
                                    clients.setName(marketsList);
                                }
                                while (true) {
                                    System.out.print("Want to select a product (yes  / no) ");
                                    String x = scanner.next();
                                    if (x.equals("yes")) {
                                        System.out.print("Choose goods: ");
                                        Products g2 = Products.valueOf(scanner.next().toUpperCase());
                                        Integer p2 = g2.getPrice();
                                        Integer d2=g2.getSum();
                                        System.out.println("Price product:"+p2); //->  price goods //1
                                        Integer z= clients.getBankCard();
                                        for (int i = 0; i < 1; i++) {
                                            if (z-(p2)>0){
                                                z=(z-p2);
                                                disc+=d2;
                                                price.add(p2);
                                                sum += p2;
                                                mMoney=(mMoney+p2);
                                                z=z+disc;
                                                clients.setBankCard(z);
                                                markets1.setBankCard(mMoney-disc);
                                                System.out.println("market money:"+mMoney);
                                                System.out.println("Remainder money: "+z);//2

                                                goodsIntegerMap.put(g2, p2);
                                                if (name.equals(clients.getName())){

                                                    list.add(g2);
                                                    clients.setList(list);}
                                            }
                                            else {
                                                System.out.println("Not enough money");
                                            }
                                        }
                                    }else if (x.equals("no"))
                                        break;
                                }
                                System.out.println("" +
                                        "\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Check ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                                        "\n                Clients: " + name +
                                        "\n                Markets: " + markets +
                                        "\n                List: " + productsIntegerMap +
                                        "\n                Total cost of products: " + price + " = " + sum +
                                        "\n~~~~~~~~~~~~~~~~~~~~~~~ Thank you for your purchase!!! ~~~~~~~~~~~~~~~~~~~");}
                            else {
                                System.out.println("Not enough money");}
                        }
                    }
                }else {
                    System.out.println("Not founded buyer ");}
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return productsIntegerMap;
    }
}
