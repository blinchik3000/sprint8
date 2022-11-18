import io.qameta.allure.Step;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    @Step("проверяем корректно ли имя")
    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        //минимум 3
//        length
        //длина не больше 19
//        length
        //только один пробел
//        boolean onlySingleSubstring(String str, String subStr) {
//            return str.indexOf(subStr) == str.lastIndexOf(subStr); // задали условие двумя методами
//        }
//    }
        boolean isCorrect = false;
        if (name.isEmpty()) {
            System.out.println("Строка пустая");
        } else if (name.length() < 3) {
            System.out.println("Длина меньше 3 символов");
        } else if (name.length() > 19) {
            System.out.println("Длина больше 19 символов");
        } else if (!name.contains(" ")) {
            System.out.println("В имени отсутствует пробел");
        } else if (name.indexOf(" ") != name.lastIndexOf(" ")) {
            System.out.println("Количество пробелов в строке не равно 1");
        } else if (name.indexOf(" ") == 0) {
            System.out.println("Пробел не должен быть первым символом");
        } else if (name.lastIndexOf(" ") == name.length()-1) {
            System.out.println("Пробел не должен быть последним символом");
        } else {
            System.out.println("Все хорошо!");
            isCorrect = true;
        }
        return isCorrect;
    }

}