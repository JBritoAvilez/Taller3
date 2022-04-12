public abstract class Collecetion {
    /**
     * título
     * fecha
     * duración
     * género
     * portada
     * descripción
     */
    public String title;
    public int date;
    public int duration;
    public String gender;
    public String portada;
    public String description;

    public Collecetion(String title, int date, int duration, String gender, String portada, String description) {
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.gender = gender;
        this.portada = portada;
        this.description = description;
    }

    public Collecetion(){
        title = "";
        date = 0;
        duration = 0;
        gender = "";
        portada = "";
        description = "";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public int getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }

    public String getGender() {
        return gender;
    }

    public String getPortada() {
        return portada;
    }

    public String getDescription() {
        return description;
    }

    public abstract void createPlaylist();
    public abstract  void sortList();
}
