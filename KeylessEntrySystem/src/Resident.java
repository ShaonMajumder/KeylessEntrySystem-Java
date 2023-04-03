import java.io.Serializable;

class Resident implements Serializable {
    private String name;
    private String room;
    private String password;

    public Resident() {
        this.name = "unassigned";
        this.room = "000";
        this.password = "XY12#$ab";
    }

    public Resident(String name, String room, String password) throws IllegalArgumentException {
        if (password.length() < 4 || password.length() > 8) {
            throw new IllegalArgumentException("Password must be between 4 and 8 characters long");
        }
        this.name = name;
        this.room = room;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) throws IllegalArgumentException {
        if (password.length() < 4 || password.length() > 8) {
            throw new IllegalArgumentException("Password must be between 4 and 8 characters long");
        }
        this.password = password;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public String getRoom() {
        return this.room;
    }
}
