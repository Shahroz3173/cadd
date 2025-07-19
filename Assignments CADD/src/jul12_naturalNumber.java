import java.util.Scanner;
public class jul12_naturalNumber {


        public void main(String[] args) {
            increasingSquence myobj = new increasingSquence();
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the length of k :");
            int k = sc.nextInt();
            System.out.println("the incresing sequence upto " + k +" is :");
            myobj.sequenceoflengthK(k);



        }

    static class increasingSquence{
        public void  sequenceoflengthK(int n) {
            if (n==0) {
                return ;
            }
            sequenceoflengthK(n-1);

            System.out.println(n + " ");


        }
    }
}
