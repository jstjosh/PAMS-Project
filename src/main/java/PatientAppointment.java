
public class PatientAppointment {
    private int patientID;
    private String patientName;
    private String appointmentTime;

    public PatientAppointment(int patientID, String patientName, String appointmentTime) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.appointmentTime = appointmentTime;
    }

    public String getTime() {
        return appointmentTime;
    }

    public int getPatientID() {
        return patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    @Override
    public String toString() {
        return patientID + ", " + patientName + ", " + appointmentTime;
    }
}
