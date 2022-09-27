import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21, "Bob", "bob@bob.com", new Date(), 3000.0, obj);

        System.out.println(obj);
        System.out.println(seller);
    }
}
