package officeManagmentChallengeJava;

public class Availability {

    public static String roomName;
    boolean available = true;

    public Availability(MeetingRoom name) {
        roomName = name.getRoomName();
    }

    public boolean isAvailable(String roomName) {

        return available;
    }
}
