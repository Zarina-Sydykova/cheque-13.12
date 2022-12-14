import cheque.classes.Clients;
import cheque.services.impl.ClientServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Элестетип корунуздор,
сиздер маркеттен соода кылып жатасыздар.
Бир канча бара турган маркеттердин списогу болсун.
Маркетте ала турган товарлардын списогу болсун жана баалары болсун.
Анан маркеттен соода кылган сон бизге кадимкидей чек чыгып берсин.
~~~~~~ Чек ~~~~~~~~
Ким алды: "Аты"
Кайсыл маркеттен алды: "Маркет"
Список товаров: Банан, Молоко, Сыр, ...
Общая стоимость товаров:
Скидка: "Если есть акции"
Общая стоимость после скидки:
~~~~~~~~~~~~~~~~~~~
Спасибо за покупку!
Фантазияны иштетип, дагы да методторду кошсонуздар болот,
жана да кооздоп, кызыктуу логикаларды да кошсонуздар болот.
Подсказка 2 класс продуктулар enum болсун, Продуктаны сатып
* алган адамдын акчасы азайып магазиндин акчасы кобоюшу керек.Жок дегенде 10 метод ойлоп жазыныздар.*/
        Scanner in = new Scanner(System.in);
        ClientServiceImpl service = new ClientServiceImpl();
            while (true) {
                int actionType = in.nextInt();
                switch (actionType){
                    case 1-> service.createClients();
                    case 2-> service.markets();
                    case 3-> service.getAllClients();
                    case 4-> service.groceryShopping();
                    case 5-> service.cheque();
                }

            }
        }




}