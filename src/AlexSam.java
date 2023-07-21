import java.util.Scanner;

public class AlexSam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int score=1;
        while(num>1){
            if(num%2==0){
                num/=2;

            }
            else{
                score++;
                num-=1;
            }
        }
        System.out.println(score);
    }
}
