import java.util.*;

class Calculator
{
    public static void main(String[] args) 
    {
        System.out.println("1. Addition");
        System.out.println("2. Difference");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Natural log");
        System.out.println("6. Exponential");
        System.out.println("7. Modulus");
        System.out.println("8. Absolute");
        System.out.println("9. Square root");
        System.out.println("10. Power");
        System.out.println("11. Sine");
        System.out.println("12. Cosine");
        System.out.println("13. Tangent");
        System.out.println("14. Sine Inverse");
        System.out.println("15. Cosine Inverse");
        System.out.println("16. Tan Inverse\n");

        System.out.println("Enter Your Choice");

        Scanner src= new Scanner(System.in);
        int choice=src.nextInt();

        switch (choice) 
        {
            case 1:
                {
                    System.out.print("a=");
                    int a=src.nextInt();
                    System.out.print("b=");
                    int b=src.nextInt(); 
                    System.out.println(a+b);
                    break;
                }
                case 2:
                {
                    System.out.print("a=");
                    int a=src.nextInt();
                    System.out.print("b=");
                    int b=src.nextInt(); 
                    if(a>b)
                    System.out.println(a-b);
                    else
                    System.out.println(b-a);
                    break;
                }
                case 3:
                {
                    System.out.print("a=");
                    int a=src.nextInt();
                    System.out.print("b=");
                    int b=src.nextInt(); 
                    System.out.println(a*b);
                    break;
                }
                case 4:
                {
                    System.out.print("Dividend=");
                    int a=src.nextInt();
                    System.out.print("Divisor=");
                    int b=src.nextInt(); 
                    System.out.println((double)a/b);
                    break;
                }
                case 5:
                {
                    System.out.print("a=");
                    int a=src.nextInt();
                    System.out.println(Math.log(a));
                    break;
                }
                case 6:
                {
                    System.out.print("a=");
                    int a=src.nextInt(); 
                    System.out.println(Math.exp(a));
                    break;
                }
                case 7:
                {
                    System.out.print("Dividend=");
                    int a=src.nextInt();
                    System.out.print("Divisor=");
                    int b=src.nextInt(); 
                    System.out.println(a%b);
                    break;
                }
                case 8:
                {
                    System.out.print("a=");
                    int a=src.nextInt(); 
                    System.out.println(Math.abs(a));
                    break;
                }
                case 9:
                {
                    System.out.print("a=");
                    int a=src.nextInt();
                    System.out.println(Math.sqrt(a));
                    break;
                }
                case 10:
                {
                    System.out.print("Base=");
                    int a=src.nextInt();
                    System.out.print("Power=");
                    int b=src.nextInt(); 
                    System.out.println(Math.pow(a,b));
                    break;
                }
                case 11:
                {
                    System.out.print("a in Radians=");
                    int a=src.nextInt();
                    System.out.print(Math.sin(a));
                    break;
                }
                case 12:
                {
                    System.out.print("a in Radians=");
                    int a=src.nextInt();
                    System.out.print(Math.cos(a));
                    break;
                }
                case 13:
                {
                    System.out.println("a in Radians=");
                    int a=src.nextInt();
                    System.out.println(Math.tan(a));
                    break;
                }
                case 14:
                {
                    System.out.print("a in Radians=");
                    int a=src.nextInt();
                    System.out.println(Math.asin(a));
                    break;
                }
                case 15:
                {
                    System.out.print("a in Radians=");
                    int a=src.nextInt();
                    System.out.println(Math.acos(a));
                    break;
                }
                case 16:
                {
                    System.out.print("a in Radians=");
                    int a=src.nextInt();
                    System.out.println(Math.atan(a));
                    break;
                }
            default:
            System.out.println("Invalid Input");
                break;
        }
    }
}