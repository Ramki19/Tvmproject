import java.util.*;
public class Threadlearn{
     static List<String> name=Arrays.asList("ram", "somu", "ragul", "dravid");
public static Optional<String> finduser(String username){
for(String us : name){
    if(us.equalsIgnoreCase(username)){
        return Optional.of(us);
    }
}
return Optional.empty();
}
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
        System.out.println("enter the username");
        String names=sc.nextLine();
        Optional<String> user=finduser(names);{
            user.ifPresentOrElse(
                    User -> System.out.println("welecome user login succesffuly"),
                    ()-> System.out.println("user not mathced")
            );

        }
    }
}