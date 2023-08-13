package marc.dev.example.expensetrackerapi.services;

import marc.dev.example.expensetrackerapi.entities.User;
import marc.dev.example.expensetrackerapi.exceptions.EtAuthException;

public interface UserServices {
    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName,String lastName,String email, String password) throws  EtAuthException;
}
