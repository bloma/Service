package com.example.shaunmesias.assignment_6_2.domain.person;

import java.io.Serializable;

/**
 * Created by Shaun Mesias on 2016/04/17.
 */
public class PersonContact implements Serializable {
    private String id;
    private String contactValue;
    private String status;
    private String state;
    private PersonContact(){}

    public String getId() {
        return id;
    }

    public String getContactValue() {
        return contactValue;
    }

    public String getStatus() {
        return status;
    }

    public String getState() {
        return state;
    }

    public PersonContact(Builder builder) {
        this.id = builder.id;
        this.contactValue= builder.contactValue;
        this.status= builder.status;
        this.state= builder.state;
    }

    public static class Builder{
        private String id;
        private String contactValue;
        private String status;
        private String state;

        public Builder id(String value) {
            this.id = value;
            return this;
        }

         public Builder contactValue(String value){
            this.contactValue = value;
            return this;
        }

        public Builder status(String value){
            this.status = value;
            return this;
        }

        public Builder state(String value){
            this.state = value;
            return this;
        }

        public Builder copy(PersonContact value){
            this.id = value.id;
            this.contactValue = value.contactValue;
            this.status = value.status;
            this.state = value.state;
            return  this;
        }

        public PersonContact build(){
            return new PersonContact(this);
        }
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonContact that = (PersonContact) o;

        return id.equals(that.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
