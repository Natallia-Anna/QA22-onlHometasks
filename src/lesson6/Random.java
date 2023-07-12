package lesson6;
class Rundom
{
    public static void main(String[] args)
    {
        Rundom student1 = new Rundom("АЛИНА","Информационные технологии");
        Rundom student2 = new Rundom("МАРИНА","Информационные технологии");
        Rundom student3 = new Rundom("ИРИНА","Информационные технологии");
        Rundom student4 = new Rundom("КАРИНА","Информационные технологии");
        Rundom student5 = new Rundom("ИННА","Информационные технологии");
        Rundom student6 = new Rundom("ЮЛИЯ","Информационные технологии");
        Rundom student7 = new Rundom("ИГОРЬ","Информационные технологии");
        Rundom student8 = new Rundom("АНДРЕЙ","Информационные технологии");
        Rundom student9 = new Rundom("ЕГОР","Информационные технологии");
        Rundom student10 = new Rundom("АЛЕСЯ","Информационные технологии");
        Rundom student11 = new Rundom("ДЕНИС","Информационные технологии");
        Rundom student12 = new Rundom("КИРИЛЛ","Информационные технологии");
        Rundom student13 = new Rundom("АЛЕКСЕЙ","Информационные технологии");
        Rundom student14 = new Rundom("АННА","Информационные технологии");

        int mark1 = (int) ( Math.random()*11);
        int mark2 = (int) ( Math.random()*11);
        int mark3 = (int) ( Math.random()*11);
        int mark4 = (int) ( Math.random()*11);
        int mark5 = (int) ( Math.random()*11);
        int mark6 = (int) ( Math.random()*11);
        int mark7 = (int) ( Math.random()*11);
        int mark8 = (int) ( Math.random()*11);
        int mark9 = (int) ( Math.random()*11);
        int mark10 = (int) ( Math.random()*11);
        int mark11 = (int) ( Math.random()*11);
        int mark12 = (int) ( Math.random()*11);
        int mark13 = (int) ( Math.random()*11);
        int mark14 = (int) ( Math.random()*11);


        System.out.println(student1.getInfo() + ( mark1));
        System.out.println(student2.getInfo() + ( mark2));
        System.out.println(student3.getInfo() + ( mark3));
        System.out.println(student4.getInfo() + ( mark4));
        System.out.println(student5.getInfo() + ( mark5));
        System.out.println(student6.getInfo() + ( mark6));
        System.out.println(student7.getInfo() + ( mark7));
        System.out.println(student8.getInfo() + ( mark8));
        System.out.println(student9.getInfo() + ( mark9));
        System.out.println(student10.getInfo() + ( mark10));
        System.out.println(student11.getInfo() + ( mark11));
        System.out.println(student12.getInfo() + ( mark12));
        System.out.println(student13.getInfo() + ( mark13));
        System.out.println(student14.getInfo() + ( mark14));
    }

    String name;
    String group;


    Rundom(String name, String group) {
        this.name = name;
        this.group = group;

    }

    String getInfo() {
        return "{Имя: " + name + "; Группа: " + group + ";}";
    }

}