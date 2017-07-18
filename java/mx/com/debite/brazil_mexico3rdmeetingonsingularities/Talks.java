package mx.com.debite.brazil_mexico3rdmeetingonsingularities;

public class Talks {
    private String speaker;
    private String title;
    private String institution;
    private String abs;
    private String type;
    private String date;
    private String startTime;
    private String endTime;
    private int talk_logo;

    public Talks(String speaker, String title, String institution, String abs,
                 String type, String date, String startTime, String endTime) {
        this.speaker = speaker;
        this.title = title;
        this.institution = institution;
        this.abs = abs;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.type = type;
        if (type.equalsIgnoreCase("Invited")) this.talk_logo = R.mipmap.ic_invitedtalk;
        else this.talk_logo = R.mipmap.ic_talk;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getTalk_logo() {
        return talk_logo;
    }

    public void setTalk_logo(int talk_logo) {
        this.talk_logo = talk_logo;
    }

}