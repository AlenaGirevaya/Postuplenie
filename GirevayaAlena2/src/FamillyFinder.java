import java.util.List;

public class FamillyFinder {
    public void printLargeFamilies(List<House> houses) {
        for (House house : houses) {
            for (Room room : house.rooms) {
                int childCount = 0;
                for (Human human : room.humans) {
                    if (human.age < 18) {
                        childCount++;
                    }
                }
                if (childCount > 2) {
                    System.out.println(" ");
                    System.out.println("Дом: " + house.number + ", Квартира: " + room.number);
                    for (Human human : room.humans) {
                        if (human.age < 18) {
                            System.out.println("Фамилия: " + human.lastName + ", Имя: " + human.name);
                        }
                    }
                }
            }
        }
    }
}
