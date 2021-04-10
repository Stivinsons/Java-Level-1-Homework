public class Person {
    String FIO;
    String post;
    String email;
    String telephone;
    int pay;
    int age;


    public Person() {
        FIO = "Иванов Иван Иванович";
        post = "Гланый иженер";
        email = "ivanovii@mail.ru";
        telephone = "89999999999";
        pay = 100000;
        age = 51;
    }

    public Person(String FIO, String post, String email, String telephone, int pay, int age) {
        this.FIO = FIO;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.pay = pay;
        this.age = age;
    }

    public void output(){
        System.out.println("Информация о сотруднике");
        System.out.println("ФИО: " + FIO);
        System.out.println("Должность: " + post);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + telephone);
        System.out.println("Зарплата: " + pay);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

//Строки ниже можно использовать в отдельном файле.

    public static void main(String[] args) {
        Person[] personArray = new Person[5];
        personArray[0] = new Person("Иванов Иван Иванович", "Главный инженер", "IvanovII@mail.ru","89999999999", 100000, 51);
        personArray[1] = new Person("Петров Петр Петрович", "Заведующий производством", "PetrovPP@mail.ru","88888888888", 90000, 47);
        personArray[2] = new Person("Семенов Семен Семенович", "Начальник отдела", "SemenovSS@mail.ru","87777777777", 80000, 43);
        personArray[3] = new Person("Федоров Федр Федорович", "Аналитик", "FedorovFF@mail.ru","86666666666", 60000, 31);
        personArray[4] = new Person("Антонов Антон Антоньевич", "Младший аналитик", "AntonovAA@mail.ru","85555555555", 40000, 25);

        for (int i = 0; i < personArray.length; i++){
            if (personArray[i].age > 40){
                personArray[i].output();
            }
        }
    }
}



