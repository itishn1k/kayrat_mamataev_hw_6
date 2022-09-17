public class Main {
    public static void main(String[] args) {
        Boss Thanos = new Boss();
        Thanos.setHeath(100);
        Thanos.setDamage(30);
        Weapon thanosWeapon=new Weapon(WeaponType.MELEE,"Mjolnir");
        Thanos.setWeaponIs(thanosWeapon);
        System.out.println(Thanos.info());

        Skeleton s1 = new Skeleton();
        s1.setHeath(80);
        s1.setDamage(20);
        Weapon s1Weapon = new Weapon(WeaponType.FIREARM, "Bow");
        s1.setArrows(50);
        s1.setWeaponIs(s1Weapon);
        System.out.println(s1.info());

        Skeleton s2 = new Skeleton();
        s2.setHeath(70);
        s2.setDamage(25);
        Weapon s2Weapon = new Weapon(WeaponType.EXPLOSIVE, "Bow with Fire-Arrows");
        s2.setArrows(30);
        s2.setWeaponIs(s2Weapon);
        System.out.println(s2.info());
    }

}