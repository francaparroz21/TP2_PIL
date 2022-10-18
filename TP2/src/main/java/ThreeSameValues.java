public class ThreeSameValues extends Exception{
    @Override
    public String getMessage() {
        return "Incorrect. At least three same values.";
    }
}
