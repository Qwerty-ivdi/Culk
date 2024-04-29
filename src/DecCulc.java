public class DecCulc implements Valid{
    @Override
    public boolean valid(String num) {
        if(num.matches("^-?\\d+$"))
            return true;
        else
            return false;
    }

}
