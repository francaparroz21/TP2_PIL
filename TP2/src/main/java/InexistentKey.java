public class InexistentKey extends Exception{
    @Override
    public String getMessage() {
        return "Incorrect. Key inexistent";
    }

}