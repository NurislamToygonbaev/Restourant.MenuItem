import java.util.*;

public class RestaurantServiceImpl implements RestaurantService {

    public RestaurantMenu restaurantMenu;

    public RestaurantServiceImpl(RestaurantMenu restaurantMenu) {
        this.restaurantMenu = restaurantMenu;
    }

    @Override
    public String create(String name) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanForStr = new Scanner(System.in);
//        restaurantMenu.list.addAll(restaurantMenu.dishes);
//        restaurantMenu.list.addAll(restaurantMenu.drinks);
//        restaurantMenu.list.addAll(restaurantMenu.salads);
//        restaurantMenu.list.addAll(restaurantMenu.desserts);
//        for (MenuItem item : restaurantMenu.list) {
//            if (item.getName().equalsIgnoreCase(name)){
//                MenuItem item1 = new MenuItem();
//                item.setId(MyGeneratorId.generator());
//                System.out.print("enter name dishes: ");
//                item.setName(scanForStr.nextLine());
//                System.out.print("enter price: ");
//                item.setPrice(scanner.nextDouble());
//                System.out.print("enter preparation time: ");
//                item.setPreparationTime(scanner.nextInt());
//                restaurantMenu.list.add(item1);
//                return "success created!";
//            }
//        }
        if (name.equalsIgnoreCase("dishes")) {
            MenuItem item = new MenuItem();
            item.setId(MyGeneratorId.generator());
            System.out.print("enter name dishes: ");
            item.setName(scanForStr.nextLine());
            System.out.print("enter price: ");
            item.setPrice(scanner.nextDouble());
            System.out.print("enter preparation time: ");
            item.setPreparationTime(scanner.nextInt());
            restaurantMenu.dishes.add(item);
            return "success created!";
        } else if (name.equalsIgnoreCase("drinks")) {
            MenuItem item = new MenuItem();
            item.setId(MyGeneratorId.generator());
            System.out.print("enter name drinks: ");
            item.setName(scanForStr.nextLine());
            System.out.print("enter price: ");
            item.setPrice(scanner.nextDouble());
            System.out.print("enter preparation time: ");
            item.setPreparationTime(scanner.nextInt());
            restaurantMenu.drinks.add(item);
            return "success created!";
        } else if (name.equalsIgnoreCase("salads")) {
            MenuItem item = new MenuItem();
            item.setId(MyGeneratorId.generator());
            System.out.print("enter name salads: ");
            item.setName(scanForStr.nextLine());
            System.out.print("enter price: ");
            item.setPrice(scanner.nextDouble());
            System.out.print("enter preparation time: ");
            item.setPreparationTime(scanner.nextInt());
            restaurantMenu.salads.add(item);
            return "success created!";
        } else if (name.equalsIgnoreCase("desserts")) {
            MenuItem item = new MenuItem();
            item.setId(MyGeneratorId.generator());
            System.out.print("enter name deserts: ");
            item.setName(scanForStr.nextLine());
            System.out.print("enter price: ");
            item.setPrice(scanner.nextDouble());
            System.out.print("enter preparation time: ");
            item.setPreparationTime(scanner.nextInt());
            restaurantMenu.desserts.add(item);
            return "success created!";
        } else System.out.println("enter correct choice!");
        return null;
    }

    @Override
    public String remote(long id) {
        restaurantMenu.dishes.removeIf(dish -> dish.getId() == id);
        restaurantMenu.drinks.removeIf(drink -> drink.getId() == id);
        restaurantMenu.salads.removeIf(salad -> salad.getId() == id);
        restaurantMenu.desserts.removeIf(dessert -> dessert.getId() == id);
        return "success";
    }

    @Override
    public List<MenuItem> getAll() {
        List<MenuItem> allItem = new LinkedList<>();
        allItem.addAll(restaurantMenu.dishes);
        allItem.addAll(restaurantMenu.drinks);
        allItem.addAll(restaurantMenu.salads);
        allItem.addAll(restaurantMenu.desserts);
        return allItem;
    }

    @Override
    public List<MenuItem> sortByPrice() {
        List<MenuItem> allItem = new LinkedList<>();
        allItem.addAll(restaurantMenu.dishes);
        allItem.addAll(restaurantMenu.drinks);
        allItem.addAll(restaurantMenu.salads);
        allItem.addAll(restaurantMenu.desserts);
        Comparator<MenuItem> comparator = Comparator.comparing(MenuItem::getPrice);
        allItem.sort(comparator);
        return allItem;
    }

    @Override
    public MenuItem getByName(String name) {
        List<MenuItem> allItem = new LinkedList<>();
        allItem.addAll(restaurantMenu.dishes);
        allItem.addAll(restaurantMenu.drinks);
        allItem.addAll(restaurantMenu.salads);
        allItem.addAll(restaurantMenu.desserts);
        for (MenuItem item : allItem) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }
}
