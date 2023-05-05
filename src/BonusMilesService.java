public class BonusMilesService {

    public int calculate(int price) {
        int mile_quantity; // количество начисленных миль
        int mile_cost = 20; // стоимость мили в рублях
        if (price > 0) {
            mile_quantity = price / mile_cost;
        } else {
            mile_quantity = 0;
        }
        return mile_quantity;
    }
}