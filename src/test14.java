import java.util.regex.Pattern;

public class test14 {
    public static void main(String[] args) {
        String abs = "aba cac ana";
        char[] split = abs.toCharArray();
        int f = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i] == ' '){
              int l = i - 1;
              while (f <= l){
                  char temp = split[f];
                  split[f] = split[l];
                  split[l] = temp;
                  f++;
                  l--;
              }
              f = i + 1;
            }
            if (i == split.length - 1){
                int l = i;
                while (f <= l){
                    char temp = split[f];
                    split[f] = split[l];
                    split[l] = temp;
                    f++;
                    l--;
                }
            }
        }

        String password = "mannaman1";

        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long");
        } else if (!password.matches(".*\\d.*")) {
            System.out.println("Password must contain at least one digit");
//            return false;
        } else if (!password.matches(".*[a-zA-Z].*")) {
//            Toast.makeText(context, "Password must contain at least one letter", Toast.LENGTH_SHORT).show();
            System.out.println("Password must contain at least one letter");
//            return false;
        } else if (!password.matches(".*[@#$%^&+=].*")) {
//            Toast.makeText(context, "Password must contain at least one special character (@#$%^&+=)", Toast.LENGTH_SHORT).show();
            System.out.println("Password must contain at least one special character (@#$%^&+=)");
//            return false;
        }

        String str = "";
        for (int i = 0; i < split.length; i++) {
            str += split[i];
        }
        System.out.println(str);
        if (str == abs){
            System.out.println("palindrom");
            return;
        }
    }
}
