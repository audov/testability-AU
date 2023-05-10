public class BonusMilesService {

    public int calculate(int price) {
        int mileQuantity; // количество начисленных миль
        int mileCost = 20; // стоимость мили в рублях
        if (price > 0) {
            mileQuantity = price / mileCost;
        } else {
            mileQuantity = 0;
        }
        return mileQuantity;
    }
}