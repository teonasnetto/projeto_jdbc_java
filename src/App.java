import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        
    }
}
