public class Main {
    public static void main(String[] args) {
        System.out.println("Homework");

    //1
        String firstName = " Ivan";
        String middleName = " Ivanovich";
        String lastName = " Ivanov";
        String result = lastName +  firstName +  middleName;
        System.out.println("ФИО сотрудника - " + result);
    //2
        String fullname2 = "Ivanov Ivan Ivanovich";
        System.out.println(fullname2.toUpperCase());
    //3
       String fullName = "Иванов Семён Семёнович";
       String fullNameTrue = fullName.replace("ё", "е");
        System.out.println(fullNameTrue);

    }
}