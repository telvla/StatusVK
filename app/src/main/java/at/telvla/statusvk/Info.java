package at.telvla.statusvk;

public class Info {
    private String code_check;
    private String status;
    private String id_vk;
    private String online;

    Info (String code_check, String status, String id_vk, String online) {
        this.code_check = code_check;
        this.status = status;
        this.id_vk = id_vk;
        this.online = online;
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

    public void setId_vk (String id_vk) {
        id_vk = id_vk;
    }
    String getId_vk () {
        return id_vk;
    }

    public void setOnline (String online) {
        online = online;
    }
    String getOnline () {
        return online;
    }
}
