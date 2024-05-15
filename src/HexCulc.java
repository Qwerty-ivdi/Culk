public class HexCulc implements Valid{
    @Override
    public boolean valid(String num) {
        if(num.matches("[-]?^[1-9A-Fa-f][0-9A-Fa-f]+"))
            return true;
        else
            return false;
    }
}
