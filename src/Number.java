public class Number {
    int number;
    int sys;
    public void setNumber(String num, int system) {
        Valid v;
        switch (system){
            case 2:
                v = new BinCulc();
                if(v.valid(num))
                    number=Integer.parseInt(String.valueOf(num),2);
                else
                    throw new IllegalArgumentException("Ошибка записи!");
            break;
            case 8:v = new OctCulc();
                if(v.valid(num))
                    number=Integer.parseInt(String.valueOf(num),8);
                else
                    throw new IllegalArgumentException("Ошибка записи!");
                break;
            case 10:v = new DecCulc();
                if(v.valid(num))
                    number=Integer.parseInt(String.valueOf(num),10);
                else
                    throw new IllegalArgumentException("Ошибка записи!");
                break;
            case 16:v = new HexCulc();
                if(v.valid(num))
                    number=Integer.parseInt(String.valueOf(num),16);
                else
                    throw new IllegalArgumentException("Ошибка записи!");break;
        }
    }
    public int getSys(){
        return sys;
    }
    public int getNumber() {
        return number;
    }
    public String printNumber() {
        return "Hex: " + Integer.toHexString(number) + "\n" +
                "DEC: " + number + "\n" +
                "OCT: " + Integer.toOctalString(number) + "\n" +
                "BIN: " + Integer.toBinaryString(number) + "\n";
    }
}
