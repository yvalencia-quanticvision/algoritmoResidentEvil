public class Weapon extends Sale {
    private String[] nameWeapon = {"cuchillo","pistola"};
    private int[] damageWeapon = {10,120};
    private Double[] multiplierForLevel = {1.2,2.0,3.0,4.0,5.0,6.0};

    private int levelWeapon = 1;

    private Sale sale;

    //------------------------------------------------Getter and Setter-----------------------------


    public String[] getNameWeapon() {
        return nameWeapon;
    }

    public void setNameWeapon(String[] nameWeapon) {
        this.nameWeapon = nameWeapon;
    }


    public int[] getDamageWeapon() {
        return damageWeapon;
    }

    public void setDamageWeapon(int[] damageWeapon) {
        this.damageWeapon = damageWeapon;
    }

    public Double[] getMultiplierForLevel() {
        return multiplierForLevel;
    }

    public void setMultiplierForLevel(Double[] multiplierForLevel) {
        this.multiplierForLevel = multiplierForLevel;
    }

    public int getLevelWeapon() {
        return levelWeapon;
    }

    public void setLevelWeapon(int levelWeapon) {
        this.levelWeapon = levelWeapon;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    //--------------------------------------------------------Metodos----------------------------------------
    public Double damageCalculateCuchillo(){
        if (levelWeapon == 1)
        {
            return damageWeapon[0]*multiplierForLevel[0];

        }else if(levelWeapon == 2){
            return damageWeapon[0]*multiplierForLevel[1];

        }else if(levelWeapon == 3){
            return damageWeapon[0]*multiplierForLevel[2];

        }else if(levelWeapon == 4){
            return damageWeapon[0]*multiplierForLevel[3];

        }else if(levelWeapon == 5){
            return damageWeapon[0]*multiplierForLevel[4];

        }
        return damageWeapon[0]*multiplierForLevel[5];
    }


    public Double damageCalculatePistola(){
        if (levelWeapon == 1)
        {
            return damageWeapon[1]*multiplierForLevel[0];

        }else if(levelWeapon == 2){
            return damageWeapon[1]*multiplierForLevel[1];

        }else if(levelWeapon == 3){
            return damageWeapon[1]*multiplierForLevel[2];

        }else if(levelWeapon == 4){
            return damageWeapon[1]*multiplierForLevel[3];

        }else if(levelWeapon == 5){
            return damageWeapon[1]*multiplierForLevel[4];

        }
        return damageWeapon[1]*multiplierForLevel[5];
    }
    
}
