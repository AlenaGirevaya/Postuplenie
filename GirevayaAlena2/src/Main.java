import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FamillyFinder familyFinder = new FamillyFinder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество домов ");
        int houseCount = scanner.nextInt();
        scanner.nextLine();

        List<House> houses = new ArrayList<>();
        for (int i = 0; i < houseCount; i++) {
            System.out.println("Введите номер дома ");
            int houseNumber = scanner.nextInt();
            House house = new House();
            house.number = houseNumber;
            house.rooms = new ArrayList<>();

            System.out.println("Введите количество квартир ");
            int roomCount = scanner.nextInt();
            scanner.nextLine();
            for (int j = 0; j < roomCount; j++) {
                System.out.println("Введите номер квартиры ");
                int roomNumber = scanner.nextInt();

                System.out.println("Введите количество человек ");
                int personCount = scanner.nextInt();

                scanner.nextLine();

                Room room = new Room();
                room.number = roomNumber;
                room.humans = new ArrayList<>();

                for (int k = 0; k < personCount; k++) {
                    System.out.println("Введите имя, фамилию и возраст человека, разделение должно быть через пробел ");
                    String[] personData = scanner.nextLine().split(" ");
                    Human human = new Human();
                    human.name(personData[0]);
                    human.lastName(personData[1]);
                    human.age(Integer.parseInt(personData[2]));
                    room.humans.add(human);
                }
                house.rooms.add(room);
            }
            houses.add(house);
        }
        familyFinder.printLargeFamilies(houses);
    }
}
