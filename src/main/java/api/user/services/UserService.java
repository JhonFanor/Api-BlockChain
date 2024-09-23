package api.user.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import api.user.entities.UserEntitie;

@Service
public class UserService {
    private List<UserEntitie> users = new ArrayList<>();
    private Long counterId = 1L;

    public UserEntitie create(UserEntitie user) {
        user.setId(counterId++);
        users.add(user);
        return user;
    }

    public List<UserEntitie> getAll() {
        return users;
    }

    public Optional<UserEntitie> get(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public UserEntitie update(UserEntitie userUpdate, Long id) {
        Optional<UserEntitie> userExisting = get(id);
        if (userExisting.isPresent()) {
            UserEntitie user = userExisting.get();
            user.setName(userUpdate.getName());
            user.setLastName(userUpdate.getLastName());
            user.setGender(userUpdate.getGender());
            user.setEmail(userUpdate.getEmail());
            user.setPhone(userUpdate.getPhone());

            return user;
        }
        return null;
    }

    public UserEntitie delete(Long id) {
        UserEntitie userFind = get(id).get();
        users.removeIf(user -> user.getId().equals(id));   
        return userFind;
    }
}
