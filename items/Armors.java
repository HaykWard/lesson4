package lesson4.items;

import lesson4.heroes.Heroes;

//Создание дополнительной брони для персонажей,
public class Armors extends Items{

    public int armor;//дополнительна броня которая состоит из нескольких частей(шлем, нателник, сапоги, перчатки)
    // при присвоении добавляет броню персонажам

    public Armors(String name, int hp, int armor) {
        super(name, hp);
        this.armor = armor;
    }

    //метод присвоения дополнительной защиты
    //1-ый пааметр: имя персонажа, 2-ой -- имя защиты
    public static void getArmor(Heroes target, Armors name){
        target.armor+= name.armor;
        System.out.println(target.armor);
    }



}
