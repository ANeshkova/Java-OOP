package hotelReservation;

public class PriceCalculator {

    public static String CalculatePrice(double pricePerDay, int numberOfDays, Season season, Discount discount) {

        double discountMultiplier = discount.getValue() / 100.0;
        double priceBeforeDiscount = numberOfDays * pricePerDay * season.getValue();
        double discountedAmount = priceBeforeDiscount * discountMultiplier;
        double result = priceBeforeDiscount - discountedAmount;

        return String.format("%.2f", result);
    }
}
