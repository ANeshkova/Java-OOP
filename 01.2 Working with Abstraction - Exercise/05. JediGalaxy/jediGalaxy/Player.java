package jediGalaxy;

public class Player {
    private long stars;

    public Player() {
        this.stars = 0;
    }

    public void addCollectedStars(int collectedStars) {
        this.stars += collectedStars;
    }

    public long getStars() {
        return stars;
    }
}
