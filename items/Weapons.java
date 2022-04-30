package lesson4.items;

import lesson4.heroes.Heroes;

public class Weapons extends Items{

    public int power;//Мощность, которую можно присвоить персонажам, и увеличивать их мощность(Бронепробитие)

    public Weapons(String name, int hp, int power){
        super(name, hp);
        this.power = power;
    }


    //метод присвоения оружия
    //1-ый параметр: имя персонажа, 2-ой -- имя оружия
    //Оружие увеличивает мощность персонажа(НЕ УРОН)
    public static void getWeapon(Heroes target, Weapons name){
        target.power+= name.power;
        System.out.println(target.power);
    }
}
