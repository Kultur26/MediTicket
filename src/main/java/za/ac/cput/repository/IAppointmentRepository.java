package za.ac.cput.repository;

import za.ac.cput.domain.Appointment;

import java.util.Set;

public interface IAppointmentRepository {
    Appointment create(Appointment appointment);
    Appointment read(Integer appointmentId);
    Appointment update(Appointment appointment);
    boolean delete(Integer appointmentId);
    Set<Appointment> getAll();
}