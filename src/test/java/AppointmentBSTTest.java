
import org.junit.Test;
import static org.junit.Assert.*;

public class AppointmentBSTTest {

    @Test
    public void testAddSingleAppointment() {
        AppointmentBST bst = new AppointmentBST();
        PatientAppointment p1 = new PatientAppointment(1, "Test Patient", "09:00");
        bst.addAppointment(p1);

        assertNotNull(bst.getRoot());
        assertEquals("09:00", bst.getRoot().data.getTime());
    }

    @Test
    public void testAddMultipleAppointments() {
        AppointmentBST bst = new AppointmentBST();
        PatientAppointment p1 = new PatientAppointment(1, "Alice", "09:00");
        PatientAppointment p2 = new PatientAppointment(2, "Bob", "08:30");
        PatientAppointment p3 = new PatientAppointment(3, "Charlie", "09:30");

        bst.addAppointment(p1);
        bst.addAppointment(p2);
        bst.addAppointment(p3);

        assertEquals("09:00", bst.getRoot().data.getTime());
        assertEquals("08:30", bst.getRoot().left.data.getTime());
        assertEquals("09:30", bst.getRoot().right.data.getTime());
    }

    @Test
    public void testPreventDuplicateAppointment() {
        AppointmentBST bst = new AppointmentBST();
        PatientAppointment p1 = new PatientAppointment(1, "Alice", "10:00");
        PatientAppointment p2 = new PatientAppointment(2, "Bob", "10:00"); // duplicate

        bst.addAppointment(p1);
        bst.addAppointment(p2); // should not be inserted

        assertNull("Duplicate should not be inserted", bst.getRoot().right);
    }
}
