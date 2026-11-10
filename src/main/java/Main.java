public class Main {
    public static void main(String[] args) {
        // Создаем объект Post
        Post post = new Post();

        // Заполняем поля
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = true;

        // Создаем объект даты и заполняем его
        post.birthdate = new FormDate();
        post.birthdate.day = 13;
        post.birthdate.month = 6;
        post.birthdate.year = 1999;

        // Выводим в консоль для проверки (как показано в задании)
        System.out.println("Имя: " + post.name);
        System.out.println("Фамилия: " + post.surname);
        System.out.println("Дата рождения: " + post.birthdate.day + "." + post.birthdate.month + "." + post.birthdate.year);
        System.out.println("Подписка: " + post.subscription);
    }
}