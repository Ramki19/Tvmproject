import java.util.*;
public class Optionallearn {
    static  List<Integer> ids=Arrays.asList(1,2,3,4,5);
    public static Optional<Integer> findid(int num) {
        for (int n : ids) {
            if (n==num) {
return Optional.of(n);
            }
        }
        return Optional.empty();
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("enter the customer id");
        int choice=sc.nextInt();
        Optional<Integer> name=findid(choice);
        name.ifPresentOrElse(
                cussid-> System.out.println("welcome to the user"),
                ()-> System.out.println("user id miss match"));




    }
}
