
package lk.aruna.bookshop.model;

public class LoginInfo {
    String employeeID;
    String emplyeeName;
    String username;
    int password;
    int rpassword;
    String answer1;
    String answer2;
    String q1;
    String q2;

    public LoginInfo() {
    }

    public LoginInfo(String employeeID, String emplyeeName, String username, int password, int rpassword, String answer1, String answer2, String q1, String q2) {
        this.employeeID = employeeID;
        this.emplyeeName = emplyeeName;
        this.username = username;
        this.password = password;
        this.rpassword = rpassword;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.q1 = q1;
        this.q2 = q2;
    }

  
    

    public LoginInfo(String employeeID, String emplyeeName, String username) {
        this.employeeID = employeeID;
        this.emplyeeName = emplyeeName;
        this.username = username;
    }

    public LoginInfo(int password, int rpassword, String answer1, String answer2, String q1, String q2) {
        this.password = password;
        this.rpassword = rpassword;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.q1 = q1;
        this.q2 = q2;
    }
    

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmplyeeName() {
        return emplyeeName;
    }

    public void setEmplyeeName(String emplyeeName) {
        this.emplyeeName = emplyeeName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public int getRpassword() {
        return rpassword;
    }

    public void setRpassword(int rpassword) {
        this.rpassword = rpassword;
    }

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    @Override
    public String toString() {
        return "LoginInfo{" + "employeeID=" + employeeID + ", emplyeeName=" + emplyeeName + ", username=" + username + ", password=" + password + ", rpassword=" + rpassword + ", answer1=" + answer1 + ", answer2=" + answer2 + ", q1=" + q1 + ", q2=" + q2 + '}';
    }
    

    

   
    
    
}
