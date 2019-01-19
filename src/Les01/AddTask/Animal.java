/*Дописать логику, чтобы метод compareTo() осуществил поиск по скорости(если же скорость у 2-х объектов равна,
то ищем по цене) -> цене - > породе -> весу животного.*/

package Les01.AddTask;

public class Animal implements Comparable { // <Animal>{
    String breed;
    int weight;
    int speed;
    int price;

    Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    public String toString() {
        return "speed = " + this.speed + ", price = " + this.price + ", breed = " + this.breed + ", weight =  " + this.weight;
    }

    // Сортируем по скорости/цене/породе/весу
    public int compareTo(Object o) {                 //    public int compareTo(Animal o) {
        int speed = this.speed - ((Animal) o).speed;            // сравнение по скорости животного
        int price = this.price - ((Animal) o).price;            // сравнение по цене животного
        int breed = this.breed.compareTo(((Animal) o).breed);   // сравнение по породе животного
        int weight = this.weight - ((Animal) o).weight;         // сравнение по весу животного

        if (speed == 0) {
            if (price == 0) {
                if (breed == 0) {
                    return weight;
                } else {
                    return breed;
                }
            } else {
                return price;
            }
        } else {
            return speed;
        }
    }
}