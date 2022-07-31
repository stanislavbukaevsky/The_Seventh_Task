public class Main {
    public static void main(String[] args) {
        //Задание 1

        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //Задание 2

        String upperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperCase);

        //Задание 3

        String replacement = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + replacement);

    }
}