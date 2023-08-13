package marc.dev.example.expensetrackerapi.repo;

import marc.dev.example.expensetrackerapi.entities.User;
import marc.dev.example.expensetrackerapi.exceptions.EtAuthException;

public interface UserRepository {
    Integer create(String firstName,String lastName,String email, String password) throws EtAuthException;
    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
