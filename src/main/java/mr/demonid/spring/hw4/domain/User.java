package mr.demonid.spring.hw4.domain;

import lombok.Data;

import java.sql.Date;
import java.time.LocalDate;

@Data
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String email;

    public Date getSqlBirthDate() {
        return Date.valueOf(birthDate);
    }
    public void setSqlBirthDate(Date sqlBirthDate) {
        birthDate = sqlBirthDate.toLocalDate();
    }
}
