package lesson4.heroes;

//Класс драконов, есть конструктор и новая переменная "Скорость пооета"
public class Dragons extends Heroes{

    public int flySpeed;

    public Dragons(String name, int hp, int armor, int attack, int power, int flySpeed){
        super(name, hp, armor, attack, power);
        this.flySpeed = flySpeed;
    }

}
