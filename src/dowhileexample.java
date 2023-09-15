public class dowhileexample {
    public static void main(String[] args){
      int num=123456789;
      int reversedNum=0;
      int remainder=0;
      System.out.print(remainder=5);
      do{
          remainder=num%10;
          reversedNum=reversedNum*10+remainder;
          num=num/10;
      } while (num!=0);
      System.out.println(reversedNum);

      int a = 11;
      if(true) {
          System.out.print("Hello");
      } else {
          System.out.print("hi");
      }

    }
}
