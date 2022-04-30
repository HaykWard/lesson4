//Пакет с Классом персонажей
//Родительский класс для классов Dragons, Witches
package lesson4.heroes;

import lesson4.items.Armors;
import lesson4.items.Weapons;

public class Heroes {

    public String name;
    public int hp;
    public int armor;
    public int attack;
    public int power;

    public Heroes(String name, int hp, int armor, int attack, int power){
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.attack = attack;
        this.power = power;
    }


    //Атака без дополнительного оружия
    public void attack(Heroes target){
        if (power>= target.power){
            target.hp-=attack;
            System.out.println(name+" атакует "+target.name+" с уроном "+attack+"!");
            if (target.hp<=0){
                System.out.println(target.name+" умер!");
            }else {
                System.out.println("У "+target.name+" осталось "+target.hp+" здоровья!");
            }
        }else {
            System.out.println("У "+name+" не хватает мощи, чтобы нанести урон "+target.name);
        }
    }


    //Атака с дополнительным оружием. Урон увеличивается в 2 раза, мощь суммируется
    public void attack(Heroes target, Weapons item){
            power += item.power;
            attack *= 2;
            if (power >= target.power) {
                target.hp -= attack;
                System.out.println(name + " атакует " + target.name + " используя " + item.name + " с уроном " + attack + "!");
                if (target.hp <= 0) {
                    System.out.println(target.name + " умер!");
                } else {
                    System.out.println("У " + target.name + " осталось " + target.hp + " здоровья!");
                }
            } else {
                System.out.println("У " + name + " не хватает мощи, чтобы нанести урон " + target.name);
            }
    }


    //Экипировка броней
    public void equip(Armors item){
        armor+=item.armor;
        System.out.println(name+" получил "+item.name+". Уровень брони: "+armor+"!");

    }

    //Эктипировка оружием
    public void equip(Weapons item){
        power+=item.power;
        attack*=2;
        System.out.println(name+" получил "+item.name+". Уровень атаки: "+attack+"! Уровень мощи: "+power+"!");

    }

    //Лут противника(пораженного)(получается забрать только  остаток брони, но не конкретный предмет экипировки)
    public void loot(Heroes target){
        if (target.hp<=0 && target.armor>0){
            armor+=target.armor;
            System.out.println(name+" забрал "+target.armor+" брони у "+target.name+"!");
        }
    }






}
