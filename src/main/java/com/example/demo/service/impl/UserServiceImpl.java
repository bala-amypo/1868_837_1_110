@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repo;
    private final PasswordEncoder encoder = new BCryptPasswordEncoder();

    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

    public User registerUser(User user) {
        if (repo.existsByEmail(user.getEmail()))
            throw new IllegalArgumentException("User already exists");

        user.setPassword(encoder.encode(user.getPassword()));
        if (user.getRole() == null) user.setRole("USER");

        return repo.save(user);
    }
}
