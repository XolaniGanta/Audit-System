package com.personalProject.demo.Entity;

import java.util.Objects;


public class Auditor {


    private String auditorID;
    private String auditorFirstName, auditorSurname, auditorCellPhone;

    protected Auditor() {
    }

    private Auditor(Builder builder) {

        this.auditorID = builder.auditorID;
        this.auditorFirstName = builder.auditorFirstName;
        this.auditorSurname = builder.auditorSurname;
        this.auditorCellPhone = builder.auditorCellPhone;

    }

    public String getAuditorID() {
        return auditorID;
    }

    public String getAuditorFirstName() {
        return auditorFirstName;
    }

    public String getAuditorSurname() {
        return auditorSurname;
    }

    public String getAuditorCellPhone() {
        return auditorCellPhone;
    }

    @Override
    public String toString() {
        return "Auditor{" +
                "auditorID=" + auditorID +
                ", auditorCellPhone=" + auditorCellPhone +
                ", auditorFirstName='" + auditorFirstName + '\'' +
                ", auditorSurname='" + auditorSurname + '\'' +
                '}';
    }

    public static class Builder {


        private String auditorID, auditorFirstName, auditorSurname, auditorCellPhone;


        public Builder setAuditorID(String auditorID) {
            this.auditorID = auditorID;
            return this;
        }

        public Builder setAuditorFirstName(String auditorFirstName) {
            this.auditorFirstName = auditorFirstName;
            return this;
        }

        public Builder setAuditorSurname(String auditorSurname) {
            this.auditorSurname = auditorSurname;
            return this;
        }

        public Builder setAuditorCellPhone(String auditorCellPhone) {
            this.auditorCellPhone = auditorCellPhone;
            return this;
        }

        public Builder copy(Auditor auditor) {
            this.auditorID = auditor.auditorID;
            this.auditorFirstName = auditor.auditorFirstName;
            this.auditorSurname = auditor.auditorSurname;
            this.auditorCellPhone = auditor.auditorCellPhone;
            return this;
        }

        public Auditor build() {

            return new Auditor(this);

        }
    }


    @Override
    public int hashCode() {
        return Objects.hash(auditorID);
    }
}
