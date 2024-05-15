public class DecCulc implements Valid{
    @Override
    public boolean valid(String num) {
        if(num.matches("^[-]?^[1-9][0-9]+$"))
            return true;
        else
            return false;
    }

}
