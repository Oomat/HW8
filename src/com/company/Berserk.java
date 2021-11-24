package com.company;

import java.util.Random;

public class Berserk extends Hero {
    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int block = boss.getDamage();
        Random random = new Random();
        int berserk = random.nextInt(2);
           this.setHealth(this.getHealth()+ block);
           boss.setHealth(boss.getHealth() - block);
        System.out.println(getAbility()  + " " + block + "Berserk ability");
            }
        }
