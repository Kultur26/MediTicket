package za.ac.cput.domain;

public class Patient {

    private int patientId;
    private String patientName;
    private String patientCell;
    private String patientEmail;

    private Patient(){}

    //Buidlder
    public Patient(Builder builder){

        this.patientId = builder.patientId;
        this.patientName = builder.patientName;
        this.patientCell = builder.patientCell;
        this.patientEmail = builder.patientEmail;
    }





    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientCell() {
        return patientCell;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", patientCell='" + patientCell + '\'' +
                ", patientEmail='" + patientEmail + '\'' +
                '}';
    }

    public static class Builder{

        private int patientId;
        private String patientName;
        private String patientCell;
        private String patientEmail;

        public Builder setPatientId(int patientId){
            this.patientId = patientId;
            return this;
        }

        public Builder setPatientName(String patientName){
            this.patientName = patientName;
            return this;
        }

        public Builder setPatientCell(String patientCell){
            this.patientCell = patientCell;
            return this;
        }

        public Builder setPatientEmail(String patientEmail){
            this.patientEmail = patientEmail;
            return this;
        }

        public Builder copy(Patient patient){
            this.patientId = patient.patientId;
            this.patientName = patient.patientName;
            this.patientCell = patient.patientCell;
            this.patientEmail = patient.patientEmail;

            return this;
        }

        public Patient build(){
            return new Patient(this);
        }
    }
}
