package access;

import model.Contact;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactAccess  extends JpaRepository<Contact, Long> {
	public void saveOrUpdate(Contact contact);
	public void delete(int contactId);
	public Contact get(int contactId);
	public List<Contact> list();
}
