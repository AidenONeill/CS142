package Lab2;

public class Lab2Q3
{
   public static void main(String args[])
   {
     int num1 = Integer.parseInt(args[0]);//takes in two strings from command like and converts to int
     int num2 = Integer.parseInt(args[2]);//takes in two strings from command like and converts to int
     char c = args[1].charAt(0); //takes in sting from command line and convers to char
     int total = 0;
     // if statement determines which maths operator to use dependent on the char taken in
     if(c==('x'))
     {
      total = num1*num2;
      System.out.println(num1 + " by " + num2 + " = " + total);
     }
     else if(c==('/'))
     {
      total = num1/num2;
      System.out.println(num1 + " divided by " + num2 + " = " + total);
     }
     else if(c==('+'))
     {
      total = num1+num2;
      System.out.println(num1 + " plus " + num2 + " = " + total);
     }
     else if(c==('-'))
     {
      total = num1-num2;
      System.out.println(num1 + " minus " + num2 + " = " + total);
     }
   }
}
