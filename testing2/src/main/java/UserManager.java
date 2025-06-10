
    import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

    public class UserManager {
        private List<User> users = new ArrayList<>();

        // Add a user
        public void addUser(User user) {
            users.add(user);
            System.out.println("User added successfully.");
        }

        // List all users
        public void listUsers() {
            if (users.isEmpty()) {
                System.out.println("No users found.");
                return;
            }

            System.out.println("Registered users:");
            for (User user : users) {
                System.out.println(user);
            }
        }

        // Find a user by ID
        public Optional<User> getUserById(int userId) {
            return users.stream()
                    .filter(user -> user.getUserId() == userId)
                    .findFirst();
        }
    }


