public class OctCulc implements Valid{
    @Override
    public boolean valid(String num) {
        if(num.matches("[0-7]+"))
            return true;
        else
            return false;
    }
}
