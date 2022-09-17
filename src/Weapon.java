public class Weapon {
    private WeaponType weaponType ;
    private String weaponIs;

    public Weapon(WeaponType weaponType, String weaponIs) {
        this.weaponType = weaponType;
        this.weaponIs = weaponIs;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponIs() {
        return weaponIs;
    }
}
