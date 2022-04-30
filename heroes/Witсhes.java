package lesson4.heroes;

//Класс ведьм, есть конструктор и новая переменная "Магия"

public class Witсhes extends Heroes {

    public int magic;

    public Witсhes(String name, int hp, int armor, int attack, int power, int magic) {
        super(name, hp, armor, attack, power);
        this.magic = magic;
    }
}
