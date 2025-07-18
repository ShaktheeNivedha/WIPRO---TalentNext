public class is_arguments {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("No Values");
        }
        else{
            for (String str: args){
                System.out.println(str + ",");

            }
        }
    }
}
