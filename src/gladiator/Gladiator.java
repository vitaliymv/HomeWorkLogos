package gladiator;

abstract class Gladiator {

    void fighting () {}
    void defend () {}
    void takeWeapon () {}

    private int life;
    private int attackPower;
    private int protection;

    public Gladiator() { }

    public Gladiator(int life, int attackPower, int protection) {
        this.life = life;
        this.attackPower = attackPower;
        this.protection = protection;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    @Override
    public String toString() {
        return "Gladiator{" +
                "life=" + life +
                ", attackPower=" + attackPower +
                ", protection=" + protection +
                '}';
    }
}
