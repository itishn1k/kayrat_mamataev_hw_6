public class Boss extends GameEntity {

    private Weapon weaponIs;

    public Weapon getWeaponIs() {
        return weaponIs;
    }

    public void setWeaponIs(Weapon weaponIs) {
        this.weaponIs = weaponIs;
    }
    public String info(){
        return "Health "+Boss.super.getHeath()+": Damage "+Boss.super.getDamage()+": Weapon "+getWeaponIs().getWeaponIs()+": Type "+getWeaponIs().getWeaponType();
    }
}
