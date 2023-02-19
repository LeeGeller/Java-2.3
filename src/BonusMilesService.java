public class BonusMilesService {
    public int calculate(int price) {
        int oneBonusRub = 20;
        int bonusMile = price / oneBonusRub;
        return bonusMile;
    }
}
