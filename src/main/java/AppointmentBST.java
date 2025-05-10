
public class AppointmentBST {
    private AppointmentNode root;

    public AppointmentBST() {
        root = null;
    }

    public void addAppointment(PatientAppointment appointment) {
        root = insertRec(root, appointment);
    }

    private AppointmentNode insertRec(AppointmentNode root, PatientAppointment appointment) {
        if (root == null) {
            return new AppointmentNode(appointment);
        }

        int cmp = appointment.getTime().compareTo(root.data.getTime());

        if (cmp < 0) {
            root.left = insertRec(root.left, appointment);
        } else if (cmp > 0) {
            root.right = insertRec(root.right, appointment);
        } else {
            // Duplicate time
            System.out.println("Duplicate appointment time not allowed: " + appointment.getTime());
        }

        return root;
    }

    public void inOrderTraversal(AppointmentNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.data);
            inOrderTraversal(node.right);
        }
    }

    public AppointmentNode getRoot() {
        return root;
    }
}
