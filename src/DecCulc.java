public class DecCulc extends Culc{
    @Override
    public double Sul(int a, int b, char c) {
        switch (c) {
            case '+' : return a + b;
            case '-' : return a - b;
            case '*' : return a * b;
            case '/' : if(b!=0) return a / b;
            else return Double.POSITIVE_INFINITY;

            default : return  0;
        }
    }

    @Override
    public void print(double a) {
        System.out.println("Ответ: "+ a);
    }
}
