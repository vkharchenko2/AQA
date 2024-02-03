package employee;

public class ArrayOfEmployees {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Небейнога Ричард Васильевич", "Закладчик", "richierich05@yahoo.com", "+48 563 873 210", "500$ net/month", 18);
        employees[1] = new Employee("Кауфман Ицхак Шмулевич", "Владелец", "отсутствует", "+972 50 410 2701", "20000$ net/month", 67);
        employees[2] = new Employee("Джейсон Миддлтон", "Дистрибьютор", "j.p.middleton@yahoo.com", "+44 7425 073158", "6000$ net/month", 34);
        employees[3] = new Employee("Петренко Петр Петрович", "Водитель", "отсутствует", "+380 66 271 22 49", "2000$ net/month", 51);
        employees[4] = new Employee("Коломойский Игорь Валерьевич", "Финансовый директор", "benia63@yahoo.com", "+972 51 410 7064", "15000$ net/month", 60);
        for (Employee a : employees) {
            if (a.getAge() > 40) {
                a.printInfo();
            }
        }
    }
}
