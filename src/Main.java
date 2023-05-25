
public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int ticketCost = 27845;
        int miles = service.calculate(ticketCost);
        System.out.println("При стоимости билета: " + ticketCost + " рублей(я), " + "Колличество начисленных Вам бонусных миль равно: "+ miles);

        }
    }
