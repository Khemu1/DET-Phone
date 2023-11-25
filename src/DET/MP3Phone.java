package DET;

public class MP3Phone extends Phone {
    private int memorySize;
    private boolean playsAAC;

    public MP3Phone(String phoneNumber, int memorySize, boolean playsAAC) {
        super(phoneNumber, true);
        this.memorySize = memorySize;
        this.playsAAC = playsAAC;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public boolean playsAAC() {
        return playsAAC;
    }
}
