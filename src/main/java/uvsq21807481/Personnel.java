package uvsq21807481;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Personnel extends Equipe{

    private final String lastName;
    private final String firstName;
    private final String job;
    private final LocalDate birth;
    private final List<String> phone;

    public static class Builder{
        private final String lastName;
        private final String firstName;
        private final String job;
        private final LocalDate birth;
        private final List<String> phone;

        public Builder(String lastName, String firstName, String job){
            this.lastName = lastName;
            this.firstName = firstName;
            this.birth = LocalDate.now();
            this.job = job;
            this.phone = new ArrayList<>();
        }

        public Builder addPhone(String number){
            phone.add(number);
            return this;
        }

        public Personnel build(){
            return new Personnel(this);
        }
    }

    public Personnel(Builder b){
        this.lastName = b.lastName;
        this.firstName = b.firstName;
        this.birth = b.birth;
        this.job = b.job;
        this.phone = b.phone;
    }

    public String getLastName(){
        return lastName;
    }

    public List<String> getPhone() {
        return phone;
    }
}
