package cardsWithPower;

public class Card {
    private int power;

    public Card(RankPower rankPower, SuitPower suitPower) {
        this.power = rankPower.getRankPower() + suitPower.getSuitPower();
    }

    public int getPower() {
        return this.power;
    }
}
