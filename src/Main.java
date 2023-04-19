public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(45);

        Weapon bossWeapon = new Weapon();
        bossWeapon.setTypeWeapon(WeaponType.FIREARMS);
        bossWeapon.setNameWeapon("AWP");

        boss.setWeapon(bossWeapon);


        System.out.println("Boss health: "+boss.getHealth());
        System.out.println("Boss damage: "+ boss.getDamage());
        System.out.println("Boss name weapon: "+ bossWeapon.getNameWeapon());
        System.out.println("Boss weapon type: "+ bossWeapon.getTypeWeapon());
    }
}