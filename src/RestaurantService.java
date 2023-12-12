import java.util.List;

public interface RestaurantService {

    String create(String name);

    String remote(long id);

    List<MenuItem> getAll();

    List<MenuItem> sortByPrice();

    MenuItem getByName(String name);

}
