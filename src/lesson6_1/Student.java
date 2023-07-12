package lesson6_1;
class Student
{
    public static void main(String[] args)
    {
        Student student1 = new Student("АЛИНА","Информационные технологии", 8);
        Student student2 = new Student("МАРИНА","Информационные технологии", 9);
        Student student3 = new Student("ИРИНА","Прикладная математика", 8);
        Student student4 = new Student("КАРИНА","Информационные технологии", 5);
        Student student5 = new Student("ИННА","Информационные технологии", 6);
        Student student6 = new Student("ЮЛИЯ","Информационные технологии", 7);
        Student student7 = new Student("ИГОРЬ","Физическая культура", 7);
        Student student8 = new Student("АНДРЕЙ","Информационные технологии", 5);
        Student student9 = new Student("ЕГОР","История искусств", 7);
        Student student10 = new Student("АЛЕСЯ","Информационные технологии", 6);
        Student student11 = new Student("ДЕНИС","Информационные технологии", 8);
        Student student12 = new Student("КИРИЛЛ","Психология", 6);
        Student student13 = new Student("АЛЕКСЕЙ","Информационные технологии", 7);
        Student student14 = new Student("АННА","Информационные технологии", 714);
        System.out.println(student1.getInfo());
        System.out.println(student2.getInfo());
        System.out.println(student3.getInfo());
        System.out.println(student4.getInfo());
        System.out.println(student5.getInfo());
        System.out.println(student6.getInfo());
        System.out.println(student7.getInfo());
        System.out.println(student8.getInfo());
        System.out.println(student9.getInfo());
        System.out.println(student10.getInfo());
        System.out.println(student11.getInfo());
        System.out.println(student12.getInfo());
        System.out.println(student13.getInfo());
        System.out.println(student14.getInfo());
    }

    String name;
    String group;
    int mark;

    Student (String name, String group, int mark) {
        this.name = name;
        this.group = group;
        this.mark = mark;
    }

    String getInfo() {
        return "{Имя: " + name + "; Группа: " + group +"; Оценка диплома "+ mark+ ";}";
    }

        }
