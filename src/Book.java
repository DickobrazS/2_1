public class Book {
    private String name;
    private int numb;
    private String wright;
    private int sect;

    public void setName(String name) {this.name = name;}
    public void setWright(String wright) {this.wright = wright;}
    public void setNumb(int numb) {this.numb = numb;}
    public void setSect(int sect) {this.sect = sect;}

    public int getNumb() {return numb;}
    public int getSect() {return sect;}
    public String getName() {return name;}
    public String getWright() {return wright;}

}
