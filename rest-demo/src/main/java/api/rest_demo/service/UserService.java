package api.rest_demo.service;

import api.rest_demo.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
