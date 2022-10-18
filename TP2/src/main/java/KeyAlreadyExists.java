public class KeyAlreadyExists extends Exception{
    @Override
    public String getMessage() {
        return "Incorrect. Key already exists";
    }
}