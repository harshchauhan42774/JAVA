public final class pre21 {
    private final String message;

    public pre21(String message) {
        this.message = message;
    }

    public void displayMessage() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        pre21 finalObj = new pre21("Hello, I am a final class!");
        // finalObj.message="keyur";
        finalObj.displayMessage();
    }
}
