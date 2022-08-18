package Class_Management;

public class Staff {
    private String role;

    public Staff(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Staff list: [role=" + role + "]";
    } 
}
