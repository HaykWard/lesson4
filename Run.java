package lesson4;

import lesson4.heroes.*;
import lesson4.items.*;

public class Run {

    public static void main(String[]args){


        //Создание персонажей (Орк, человек, ельф)
        Heroes human = new Heroes("Adam", 100, 0, 10, 10);
        Heroes orc = new Heroes("Varan", 100, 50, 30, 10);
        Heroes els = new Heroes("Suru", 150, 30, 40, 5);

        //Создание персонажей (Ведьмы)
        Witсhes mona = new Witсhes("Mona", 120, 20, 50, 10, 50);
        Witсhes samarika = new Witсhes("Samarika", 130, 25, 40, 20, 60);

        ////Создание персонажей (Драконы)
        Dragons vixr = new Dragons("Vixr", 300, 50, 60, 30, 120);
        Dragons svot = new Dragons("Swot", 500, 100, 80, 60, 90);


        //Создание инвентаря
        //Созжания оружия
        Weapons axe=  new Weapons("Axe", 3, 10);
        Weapons sword=  new Weapons("Sword", 4, 15);
        Weapons hammer=  new Weapons("Hammer", 5, 5);

        //Создание брони
        Armors helmet = new Armors("Helmet", 2, 30);
        Armors shoes = new Armors("Shoes", 1, 10);
        Armors gloves = new Armors("Gloves", 1, 10);
        Armors body = new Armors("Body", 4, 50);


        //Вызовы методов
        Armors.getArmor(human, helmet);

        human.attack(orc, axe);


        human.equip(axe);

        human.attack(orc);
        human.loot(orc);

    }
}
