package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                rsl = user;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("User not found");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User: " + user.getUsername() + "did not pass validation");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {new User("Anatolii Gady", false)};
        try {
            User user = findUser(users, "Anatolii Gady");
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
