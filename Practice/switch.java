import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit=sc.next();
        int day=sc.nextInt();
        switch (fruit)
        {
            case "mango":
                System.out.println("I will be appear in summer");
                break;
            case "watermelon":
                System.out.println("I will be appear in middlesummer");
                break;
            case "apple":
                System.out.println("I will be appear in anytime");
                break;
            case "guava":
                System.out.println("I dont know when i appear");
                break;
            default:
                System.out.println("Hey enter the fruit of selected only");
        }
switch (day)
{
    case 1:
        System.out.println("Sunday");
        break;
    case 2:
        System.out.println("Monday");
        break;
    case 3:
        System.out.println("Tuesday");
        break;
    case 4:
        System.out.println("Wednesday");
        break;
    case 5:
        System.out.println("Thursday");
        break;
    case 6:
        System.out.println("Friday");
        break;
    case 7:
        System.out.println("Saturday");
        break;
    default:
        System.out.println("ouch enter a valid one");
}

    }
}
