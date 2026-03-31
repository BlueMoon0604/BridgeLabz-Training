package SensitiveDataTagging;

public class Main {
	public static void main(String[] args) {

        UserAccount user = new UserAccount("nova", "mypassword123");
        Product product = new Product("Mobile", 1780000);

        EncryptionProcessor.process(user);
        EncryptionProcessor.process(product);
    }
}
