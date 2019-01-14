package at.telvla.statusvk;

public class Info {
    private String code_check;
    private String status;

    Info (String code_check, String status) {
        this.code_check = code_check;
        this.status = status;
    }

    public void setCodeCheck (String code_check) {
        code_check = code_check;
    }

    String getCodeCheck () {
        return code_check;
    }

    public void setStatus (String status) {
        status = status;
    }

    String getStatus () {
        return status;
    }
}
