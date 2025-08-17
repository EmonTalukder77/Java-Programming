public class StringMethod {
    public static void main(String[] args) {
        String name = "Randy Bro";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("y");

        // name=name.toUpperCase();
        // name=name.toLowerCase();
        // name=name.trim();
        // name=name.replace("R", "E");

        if(name.contains(" ")){
            System.out.println("Your name contains a space .");
        }else{
            System.out.println("Your name doesn't contains a space .");
        }

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(name);

    }
}
