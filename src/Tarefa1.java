public class Tarefa {
    public static void main(String args [] ) {
        int num1 = 100;
        byte num2 = 10;
        short num3 = 1;
        long num4 = 1000;
        float num5 = 2.5f;
        double num6 = 3.3333;
        boolean hygor = true;
        char a = 'a';

        Integer num9 = Integer.valueOf(num1);
        Byte num8 = Byte.valueOf(num2);
        Short num7 = Short.valueOf(num3);
        Long num10 = Long.valueOf(num4);
        Float num11 = Float.valueOf(num5);
        Double num12 = Double.valueOf(num6);
        Boolean hygor2 = Boolean.valueOf(hygor);
        Character a2 = Character.valueOf(a);
         
              System.out.println(num7);
              System.out.format("%s , %s , %s , %S, %S , %s , %S , %s", num7 , num8 , num9, num10, num11 , num12 , hygor2 , a2);

    }
}
