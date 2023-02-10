public class Main {
    public static void main(String[] args) {


        method("usonkmv0@gmail.com", "uson1999", "uson1999");


    }

    public static void method(String login, String password, String confirmPassword) {
        boolean onlyLatinAlphabet = login.matches("^[a-zA-Z0-9]+$");
        if (onlyLatinAlphabet) {
            throw new WrongAlphabetExsepsion(" Логинди Латинский алфавит мн жазуу керек");
        }
        if (login.length() > 20) {
            throw new WrongLoginException("Login 20 dan kop bolup ketti");
        }
        if (password.length() > 20) {
            throw new WronPasswordExsepsion(" Password 20 dan kop bolup ketti");
        }
        if (!password.equals(confirmPassword)) {
            throw new WronPasswordExsepsion("Password mn confirmPassword okshosh emes");
        }
    }
}