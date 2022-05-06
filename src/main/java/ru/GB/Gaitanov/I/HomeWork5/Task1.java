package ru.GB.Gaitanov.I.HomeWork5;

public class Task1 {

    public static void main(String[] args) {

        Employee[] emp = new Employee[5];
        emp[0] = new Employee("Иванов Иван Иванович", "директор", "dir@mail", (int) 88005353535L, 300000, 41);
        emp[1] = new Employee("Смирнов Константин Петрович", "главный бухгалтер", "glavbuh@mail", (int) 88000000524L, 150000, 35);
        emp[2] = new Employee("Голубева Кристина Федоровна", "бухгалтер", "buh@mail", (int) 88002100051L, 80000, 62);
        emp[3] = new Employee("Иванов Семен Семенович", "Руководитель отдела", "ruk@mail", (int) 880004830005L, 100000, 29);
        emp[4] = new Employee("Иванов Аркадий Григорьевич", "работник", "rab@mail", (int) 880127000005L, 30000, 40);



      /*  public static int arr(int len, int initialValue) {

            int arr[] = new int[len];
            for (int i = 1; i < arr.length; i++) {
                arr[i] = initialValue;
        */

            for (int i = 0; i < emp.length; i++) {
                if (emp[i].getAge() >= 40)
                    System.out.println(emp[i].getNameSurnamePatronymic() + " старше 40 лет");

            }
    }
}




    /*    emp1.setNameSurnamePatronymic("Иванов Иван Иванович");
        emp1.setPosition("директор");
        emp1.setEmail("dir@mail");
        emp1.setPhoneNumber(880000005);
        emp1.setSalary(300000);


        emp2.setNameSurnamePatronymic("ичСмирнов Олег Петров"); = ;
        emp2.setPosition("главный бухгалтер");
        emp2.setEmail("glavbuh@mail");
        emp2.setPhoneNumber(847600005);
        emp2.setSalary(150000);

        emp3.setNameSurnamePatronymic ("Головач Елена Игоревна");
        emp3.setPosition("бухгалтер");
        emp3.setEmail("buh@mail");
        emp3.setPhoneNumber(814589605);
        emp3.setSalary(100000);

        emp4.nameSurnamePatronymic = "Смирнов Константин Петрович";
        emp4.position = "Руководитель отдела";
        emp4.email = "ruk@mail";
        emp4.phoneNumber = 842358705;
        emp4.setSalary(130000);

        emp5.nameSurnamePatronymic = "Иванов Семен Семенович";
        emp5.position = "работник";
        emp5.email = "rab@mail";
        emp5.phoneNumber = 854423354;
        emp5.setSalary(80000);
*/



