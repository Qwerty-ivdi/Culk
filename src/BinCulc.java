public class BinCulc implements Valid {

    @Override
    public boolean valid(String num) {
        if(num.matches("[01]+"))
            return true;
        else
            return false;
    }
}
