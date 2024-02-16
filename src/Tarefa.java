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

        Short num7 = new Short((short) 3);
        Byte num8 = new Byte ((byte)10);
        Integer num9 = new Integer(100);
        Long num10 = new Long (1000);
        Float num11 = new Float (2.5f);
        Double num12 = new Double(3.333);
        Boolean hygor2 = new Boolean (true);
        Character a2 = new Character (a);
         
              System.out.println(num7);
              System.out.format("%s , %s , %s , %S, %S , %S , %s", num7 , num8 , num9, num10, num11 , hygor2 , a2);

    }
}
