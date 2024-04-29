public class BinCulc implements Valid {

    @Override
    public boolean valid(String num) {
        if(num.matches("^[-]?[0-1]+$"))
            return true;
        else
            return false;
    }
}
