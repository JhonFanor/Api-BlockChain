package api.user.entities;

public class UserEntitie {
    private Long id;
    private String name;
    private String lastName;
    private String gender;
    private String email;
    private String phone;

    public UserEntitie(Long id, String name, String lastName, String gender, String email, String phone){    
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return phone;
    }
}
