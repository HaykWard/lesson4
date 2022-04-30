//Пакет с классамы орудия и брони(инвентарь)
//Родительский класс для классов Armors, Weapon
package lesson4.items;

public class Items {

    public String name;
    public int hp;//Показатель целлостности брони и оружие, при каждом использовании
    // вычитается определенное количество hp

    public Items(String name, int hp){
        this.name = name;
        this.hp = hp;
    }



}
