public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
