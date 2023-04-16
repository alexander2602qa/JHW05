import ru.netology.services.TimeOfRestService;

public class Main {

    public static void main(String[] args) {

        TimeOfRestService service = new TimeOfRestService();
        System.out.println(service.calcTimeOfRest(10000, 3000, 20000));
        System.out.println(service.calcTimeOfRest(100000, 60000, 150000));

    }

}
