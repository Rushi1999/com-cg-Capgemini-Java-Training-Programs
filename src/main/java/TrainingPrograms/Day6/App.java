package TrainingPrograms.Day6;

public class App {

        public static void main(String[] args) {

            AppUser appUser = new AppUser();
            appUser.userName = "Prashant";

            appUser.role = Role.ADMIN;

            System.out.println(appUser.userName);
            System.out.println(appUser.role);

        }

    }
