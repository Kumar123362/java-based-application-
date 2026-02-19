public class App {

    // Simple Interface
    interface Message {
        void show();
    }

    // Main method
    public static void main(String[] args) {

        // Anonymous implementation
        Message msg = new Message() {
            public void show() {
                System.out.println("Hello Simple Interface App!");
            }
        };

        msg.show();
    }
}
