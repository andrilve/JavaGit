
public class Loader {
    private static Cat getKitten() {
        double ves = 1100.0;
        return new Cat(ves);
    }

    public static void main(String[] args) {
        //1. Понятие класса и объекта
        //Создать 5-7 кошек и вызвать у них различные методы

        //напечатайте в консоль вес созданных кошек
        Cat murka = new Cat();
        System.out.println("Вес Мурки " + murka.getWeight());

        //покормите 2 кошки и после этого распечатать их вес (убедитесь что вес изменился)
        Cat eshka = new Cat();
        System.out.println("Вес Ешки " + eshka.getWeight());
        double fish = 20;
        eshka.feed(fish);
        System.out.println("Вес Ешки " + eshka.getWeight());

        murka.feed(fish);
        System.out.println("Вес Мурки " + murka.getWeight());

        //перекормите кошку
        Cat barsik = new Cat();
        double Kitekat = 1000;
        System.out.println("Барсик " + barsik.getStatus());
        System.out.println("Вес Барсика " + barsik.getWeight());
        while (!barsik.getStatus().equals("Exploded")) {
            barsik.feed(Kitekat);
        }
        System.out.println("Вес Барсика " + barsik.getWeight());
        System.out.println("Барсик " + barsik.getStatus());

        //"замяукайте" кошку до смерти
        Cat schrödinger = new Cat();
        double geiger = 0 - (schrödinger.getWeight() - 1001);
        System.out.println("Шредингер вес " + schrödinger.getWeight());
        schrödinger.feed(geiger);
        System.out.println("Шредингер вес " + schrödinger.getWeight());
        System.out.println("Шредингер " + schrödinger.getStatus());
        while (!schrödinger.getStatus().equals("Dead")) {
            schrödinger.meow();
        }
        System.out.println("Шредингер " + schrödinger.getStatus());

        //3.
        // Статические методы и переменные
        System.out.println(" ");

        System.out.println("Количество кошек " + Cat.getCount());

        Cat Puh = new Cat();
        Cat Puh2 = new Cat();
        System.out.println("Количество кошек 4 - " + Cat.getCount());

        System.out.println("Puh2 " + Puh2.getStatus());
        System.out.println("Вес Puh2 " + Puh2.getWeight());
        Puh2.feed(10000.);
        System.out.println("Вес Puh2 " + Puh2.getWeight());
        System.out.println("Puh2 " + Puh2.getStatus());

        System.out.println("Количество кошек 3 - " + Cat.getCount());

        System.out.println(" ");

        //5. Создание объектов и конструктор
        double ves = 2110.0;
        Cat catVes = new Cat(ves);
        System.out.println("Заданный вес " + catVes.getWeight());

        Cat little = getKitten();
        System.out.println("Вес котёнка " + little.getWeight());

        Cat puh = getKitten();
        System.out.println("Вес котёнка " + puh.getWeight());

        Cat pus = getKitten();
        System.out.println("Вес котёнка " + pus.getWeight());
        System.out.println(" ");

        // 6.
        // Инкапсуляция, геттеры и сеттеры
        Cat catBlack = new Cat();

        catBlack.setColor(Color.BLACK);
        System.out.println("Цвет кошки " + catBlack.getColor());
        System.out.println(" ");

        // 7
        // Копирование объектов
        // Создать у кошки метод создания её “глубокой” копии.

        murka.setName("Мурка");

        Cat murka2 = murka.copy(murka);

        System.out.println("Имя мурки 2 " + murka2.getName());

        murka2.setName("Мурка2");

        System.out.println("Имя мурки " + murka.getName());
        System.out.println("Имя мурки 2 " + murka2.getName());

    }
}