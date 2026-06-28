package org.example;

public enum Weapon {
    SWORD(50, 1.2),
    BOW(30, 2.0),
    AXE(70, 0.8),
    SPEAR(40, 1.5);

    private  int  damage;
    private  double attackSpeed;

    Weapon(int  damage, double attackSpeed){
        this.damage=damage;
        this.attackSpeed=attackSpeed;
    }

    public int getDamage(){
        return damage;
    }

    public double getAttackSpeed(){
        return attackSpeed;
    }

}

/*Her weapon için bir adet int damage ve double attackSpeed değeri tanımlanmalı. Aynı zamana bu değişkenler için getter metodları da yazılmalı.*/