package Gen17052024;

import java.util.ArrayList;

public class Player {

    //Atributos
    private String nombre;
    private Integer vida;
    private Integer ataque;
    private ArrayList<Objeto> inventario;

    //Constructores
    public Player(String nombre, Integer vida, Integer ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public Player() {
    }

    //Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public ArrayList<Objeto> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Objeto> inventario) {
        this.inventario = inventario;
    }

    //Métodos del jugador
    public void atacar(Enemigo enemigo) {

    }

    public void recibirDanio() {

    }

}
