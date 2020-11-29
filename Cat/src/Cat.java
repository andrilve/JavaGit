
public class Cat {
    private static final int EYES_COUNT = 3; /*implements Cloneable;*/
    private static final int lEGS_COUNT = 4;
    private static final double MAX_WEIGHT = 1000;
    private static final double MIN_WEIGHT = 9000.0;

    private static int count; //статическая переменная count
    private double feed; // Объявление переменной еда
    private double originWeight;
    private double weight;
    private boolean catAlive;

    private double minWeight;
    private double maxWeight;

    private Color color;

    private String name;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

        feed = 0;   //Инициализировали переменную

        catAlive = true;
        count++;
    }

    //5. Создание объектов и конструктор
    public Cat(double weight) {
        this();
        this.weight = weight;
    }

    //конструктор
    public Cat(double weight, String name, Color color) {
        this();
        this.weight = weight;
        this.name = name;
        this.color = color;
    }

    public void meow() {
        weight = weight - 1;

        if (weight < minWeight & catAlive) {
            catAlive = false;
            count--;
        }
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        feed = feed + amount; // увеличиваем переменную при каждой кормежке
        weight = weight + amount;

        if (weight > maxWeight & catAlive) {
            catAlive = false;
            count--;
        }
    }

    public void drink(Double amount) {
        weight = weight + amount;

        if (weight > maxWeight & catAlive) {
            catAlive = false;
            count--;
        }
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    public void SumFeed() {
        System.out.println(feed);
    }

    public void pee() {
        weight = weight - 1;
        System.out.println("pee");

        if (weight < minWeight & catAlive) {
            catAlive = false;
            count--;
        }
    }

    public static int getCount() {
        return count;
    }

    //Color
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //Имя
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Копирование
  /*  public Cat clone() throws CloneNotSupportedException
    {
        Cat clone = (Cat)super.clone();
        return clone;
    }*/

    public Cat copy(Cat mum) {
        Cat son = new Cat(mum.weight, mum.getName(), mum.getColor());
        return son;
    }

}