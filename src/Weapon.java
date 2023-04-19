public class Weapon {
    public WeaponType getTypeWeapon() {
        return typeWeapon;
    }

    public void setTypeWeapon(WeaponType typeWeapon) {
        this.typeWeapon = typeWeapon;
    }

    public String getNameWeapon() {
        return nameWeapon;
    }

    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }

    private WeaponType typeWeapon;
    private String nameWeapon;
}
