public class HomeWork {
    public static void main(String[] args) {

        task0();
        task1();
        task2();
        task3();

    }

    public static void task0() {
        System.out.println("Задача 0 ТЕСт");
        String phone = "+960-413 43-45";
        phone = phone.replace("-", "");
        phone = phone.replace("+", "");
        phone = phone.replace(" ", "");
        if (phone.length() == 10) {
            //           phone = '7' + phone;
        } else if (phone.length() >11 ){
            throw new RuntimeException("Телефон слишком длинный!");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий!");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний!");
        }

        System.out.println("phone = " + phone);
        String expectedPhone = "79604134345";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех!");
        } else {
            System.out.println("Неудача!");
        }


    }

    /* Задача 1
    Представьте, что вы работаете в небольшой компании. Данные сотрудников хранятся в неструктурированном формате.
    Бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.

Напишите четыре строки:
С именем firstName — для хранения имени.
С именем middleName — для хранения отчества.
С именем lastName — для хранения фамилии.
С именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
Выведите в консоль фразу: «ФИО сотрудника — …».

В качестве данных для задачи используйте "Ivanov Ivan Ivanovich".
     */

    public static void task1() {
        System.out.println();
        System.out.println("Задача 1");
        String firstName = "Ivan" ;
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName + firstName + lastName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    /* Задача 2
    Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О. сотрудников,
    полностью написанные заглавными буквами (верхним регистром).

    Напишите программу, которая изменит написание Ф. И. О. сотрудника с "Ivanov Ivan Ivanovich" на полностью заглавные буквы.
    В качестве строки с исходными данными используйте строку fullName.
    Результат программы выведите в консоль в формате: "Данные ФИО сотрудника для заполнения отчета — …"
    */
    public static void task2() {
        System.out.println();
        System.out.println("Задача 2");
        String firstName = "Ivan " ;
        String middleName = "Ivanov ";
        String lastName = "Ivanovich";
        String fullName = middleName + firstName + lastName;
        System.out.println("ФИО сотрудника - " + fullName.toUpperCase());

    }

    /* Задача 3
            * Система, в которой мы работаем, не принимает символ «ё». Напишите программу,
    которая заменяет символ «ё» на символ «е».
    В качестве исходных данных используйте строку fullName и данные в ней — "Иванов Семён Семёнович".
    Выведите результат программы в консоль в формате: «Данные ФИО сотрудника — ...». */
    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);


    }
}