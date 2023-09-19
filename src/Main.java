// Контроль віку і статі
import java.util.Scanner;

public class Main {
    public static int Scan ()//Введення віку людини
    {Scanner sc = new Scanner(System.in);
        int y;
        System.out.println("Введіть ваш вік: ");
        y = sc.nextInt();
        return y;
    }
    public static String Gender ()//Введення гендеру
    {Scanner sc = new Scanner(System.in);
        String s = null;
        int n;
        System.out.println("Обери:");
        System.out.println("1 - якщо стать ЖІНОЧА");
        System.out.println("2 - якщо стать ЧОЛОВІЧА");
        n = sc.nextInt();
        if (n== 1)
        {
            s = "Жіноча";
        }
        else if (n == 2)
        {
            s = "Чоловіча";
        }
        else
        {
            System.out.println("Введено невірну цифру при виборі статі");
        }
        return s;
    }
        public static void Select_by_condition (int age, String sex)//Вибір
        {
            if (age >= 18 )// віковий критерій
            {
                System.out.println("Ви доросла людина! ");
                if (sex == "Жіноча")
                {
                    System.out.println("Ви Жінка!");
                }
                if (sex == "Чоловіча")
                {
                    System.out.println("Ви Чоловік");
                }
            }
            else
            {
                System.out.println("Ви дитина! ");
                if (sex == "Жіноча")
                {
                    System.out.println("Ви дівчинка!");
                }
                if (sex == "Чоловіча")
                {
                    System.out.println("Ви хлопчик");
                }
            }
        }

    public static void main(String[] args) {
        int y = Scan ();
        String s = Gender ();
        Select_by_condition (y, s);
        }
    }
