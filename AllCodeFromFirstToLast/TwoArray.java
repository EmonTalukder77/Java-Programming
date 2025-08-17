public class TwoArray {
    public static void main(String[] args) {
        System.out.println("Here is a Telephone pad");
        char [][] telephone ={{'1','2','3'},
                              {'4','5','6'},
                              {'7','8','9'},
                              {'*','0','#'}};
        for(char[] row:telephone){
            for(char number :row){
                System.out.print(number +" ");
            }
            System.out.println();
        }                      
    }

}
