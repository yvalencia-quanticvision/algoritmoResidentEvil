public class Sale {
    private int[] weaponLevel= {1,2,3,4,5,6};
    private int cost[] = {100,50,60,150,1000};
    private int costTotal;

    //------------------------------------------------Getter and Setter-----------------------------


    public int[] getCost() {
        return cost;
    }

    public void setCost(int[] cost) {
        this.cost = cost;
    }

    public int[] getWeaponLevel() {
        return weaponLevel;
    }

    public void setWeaponLevel(int[] weaponLevel) {
        this.weaponLevel = weaponLevel;
    }

    public int getCostTotal() {
        return costTotal;
    }

    public void setCostTotal(int costTotal) {
        this.costTotal = costTotal;
    }

    public int levelUpWeaponCosto(int level, String nameWeapon){
        switch(nameWeapon){
            case "cuchillo":
               switch(level){
                   case 2:
                     return costTotal = weaponLevel[1]*cost[1];
                   case 3:
                       return costTotal = weaponLevel[2]*cost[1];
                   case 4:
                       return costTotal = weaponLevel[3]*cost[1];
                   case 5:
                       return costTotal = weaponLevel[4]*cost[1];
                   case 6:
                       return costTotal = weaponLevel[5]*cost[1];
               }
            case "pistola":
                switch(level){
                    case 2:
                        return costTotal = weaponLevel[1]*cost[0];
                    case 3:
                        return costTotal = weaponLevel[2]*cost[0];
                    case 4:
                        return costTotal = weaponLevel[3]*cost[0];
                    case 5:
                        return costTotal = weaponLevel[4]*cost[0];
                    case 6:
                        return costTotal = weaponLevel[5]*cost[0];
                }
        }
        return costTotal = 0;
    }

}
