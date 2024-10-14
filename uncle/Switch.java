import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
int color= sc.nextInt();

switch(color){
    case 1:System.out.println(" hello");
    break;
    case 2: System.out.println("Salam walekum");
    break;
    case 3:System.out.println("Namaste");
break;
default: System.out.println("invalid number");
}
    }
    
}
