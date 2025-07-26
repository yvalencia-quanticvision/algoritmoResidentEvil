public class Player extends Weapon{
    private String name;
    private int speed;
    private int live;

    private int damage;

    private int money;

    private Weapon weapon;

    private  Sale sale;

    //------------------------------------------------Getter and Setter-----------------------------


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    //--------------------------------------Metodos----------------------------------------------

    public void  levelupWeapon(int level){
        if (money>= sale.getCostTotal()){
            weapon.setLevelWeapon(level);
        }
    }
}
