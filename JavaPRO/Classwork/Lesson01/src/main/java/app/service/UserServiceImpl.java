package app.service;

import app.domain.User;
import app.repository.UserRepository;

public class UserServiceImpl implements UserService{

    private UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User getById(Long id) {
        //Здесь проверки и бизнес-логика
        // Например, идёт проверка егь прошлых заказов,
        // и на основании этого рассчитывается его текущая скидка.
        return repository.getById(id);
    }

    @Override
    public User save(User user) {
        // Здесь проверки и бизнес-логика
        // Здесь мы можем отправить на мыло пользователя
        // какую-либо вступительную акцию. Например, приведи друга.
        return repository.save(user);
    }
}
