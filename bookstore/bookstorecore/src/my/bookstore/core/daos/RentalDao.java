package my.bookstore.core.daos;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.internal.dao.Dao;
import my.bookstore.core.model.BookModel;
import my.bookstore.core.model.RentalModel;

import java.util.List;

public interface RentalDao extends Dao {
    List<RentalModel> getActiveRentalsForCustomer(CustomerModel customer);

    List<BookModel> getMostRentedBooks(int numberOfBooks);
}