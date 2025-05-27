package org.example;

public enum Weapon {
    SWORD,
    GUN;

    private int damage;
    private double attackSpeed;

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public int getDamage() {
        return damage;
    }
}
