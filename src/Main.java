import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanFOrStr = new Scanner(System.in);

        RestaurantMenu restaurantMenu = new RestaurantMenu();
        RestaurantService service = new RestaurantServiceImpl(restaurantMenu);


        loop:
        while (true){
            try {
                System.out.println("""
                        1. exit
                        2. create
                        3. remote
                        4. get all
                        5. sort by price
                        6. get by name
                        """);
                switch (scanner.nextInt()){
                    case 1 -> {break loop;}
                    case 2 -> {
                        System.out.print("enter (dishes/drinks/salads/desserts): ");
                        String name = scanFOrStr.nextLine();
                        String string = service.create(name);
                        if (string == null) System.out.println("not found");
                        else System.out.println(string);
                    }
                    case 3 -> {
                        System.out.print("enter id: ");
                        long id = scanner.nextLong();
                        System.out.println(service.remote(id));
                    }
                    case 4 -> System.out.println(service.getAll());
                    case 5 -> System.out.println(service.sortByPrice());
                    case 6 -> {
                        System.out.print("enter name: ");
                        String name = scanFOrStr.nextLine();
                        MenuItem byName = service.getByName(name);
                        if (byName == null) System.out.println("not found");
                        else System.out.println(byName);
                    }
                    default -> System.out.println("enter valid Integer");
                }
            } catch (InputMismatchException e){
                System.out.println("enter valid Integer");
                scanner.next();
            }
        }
    }
}