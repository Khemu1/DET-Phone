package DET;

public class Main {
    public static void main(String[] args) {
        MP3Phone mp3Phone = new MP3Phone("123-456-7890", 16, true);

        System.out.println("Phone Number: " + mp3Phone.getPhoneNumber());
        System.out.println("Has Added-Value Services: " + mp3Phone.hasAddedValueServices());
        System.out.println("Memory Size: " + mp3Phone.getMemorySize() + " MB");
        System.out.println("Plays AAC: " + mp3Phone.playsAAC());
    }
}
