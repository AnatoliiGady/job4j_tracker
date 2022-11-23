package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                rsl = user;
                System.out.println("User: " + user + " found");
                break;
            } else {
                throw new UserNotFoundException("User not found");
            }
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUsername().length() < 4) {
            System.out.println("User: " + user.getUsername() + " passed validation");
            return true;
        } else {
            throw new UserInvalidException("User: " + user.getUsername() + "did not pass validation");
        }
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Anatolii Gady", false)
        };
        try {
            User user = findUser(users, "Ana");
            if (validate(user)) {
                System.out.println("This user has in access");
            }
        } catch (UserInvalidException ui) {
            ui.printStackTrace();
        } catch (UserNotFoundException i) {
            i.printStackTrace();
        }
    }
}
