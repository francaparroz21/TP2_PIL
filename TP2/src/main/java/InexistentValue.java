public class InexistentValue extends Exception{

    @Override
    public String getMessage() {
        return "Incorrect. This value is empty.";
    }
}
