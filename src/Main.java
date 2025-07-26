import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner in = new Scanner(System.in);

        Player player = new Player();
        Weapon weapon = new Weapon();
        //String[] armas = player.getWeapon().getNameWeapon();

        System.out.println("Seleciona arma: \n"+ weapon.getNameWeapon()[0] +" \n"+weapon.getNameWeapon()[1]);
        int op = in.nextInt();

        //System.out.println("Ingrese el nivel que quiere subir: ");
        //int level = in.nextInt();

        if (op == 2){
            System.out.println(player.damageCalculatePistola());
        } else if (op == 1) {
            System.out.println(player.damageCalculateCuchillo());
        }


    }
}